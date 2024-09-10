package br.com.fiap.aula07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransacaoImpl {

	public static void main(String[] args) throws Exception {
		
		
		TransacaoImpl impl = new TransacaoImpl();
		impl.efetuarTransferencia(2, 500, 1);
		

	}

	public Connection obterConexao() {

		Connection conn = null;

		try {

			// Class.forName("org.h2.Driver");
			// conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");

			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/fiap?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true",
					"root", "123456");
			conn.setAutoCommit(true);

		} catch (SQLException sqlex) {
			System.out.println(sqlex.getMessage());
		}

		return conn;
	}
	
	public void efetuarTransferencia(int idOrigem, double valor, int idDestino) throws Exception {
		
		String SQL = "UPDATE CONTA SET SALDO = SALDO - ? WHERE ID = ?";
		String SQL2 = "UPDATE CONTA SET SALDO = SALDO + ? WHERE ID = ?";
		
		Connection conn = obterConexao();
		conn.setAutoCommit(false);
		
		PreparedStatement pstmt = conn.prepareStatement(SQL);
		
		pstmt.setDouble(1, valor);
		pstmt.setInt(2, idOrigem);
		
		System.out.println(pstmt.execute());
		
		pstmt = conn.prepareStatement(SQL2);
		
		pstmt.setDouble(1, valor);
		pstmt.setInt(2, idDestino);
		
		System.out.println(pstmt.execute());
		
		conn.commit();

		pstmt.close();
		conn.close();
		
	}

}
