package br.com.fiap.aula07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ClienteJDBC {

	public static void main(String[] args) throws Exception {
		

		ClienteJDBC jdbc = new ClienteJDBC();
		jdbc.consultar();
		
		jdbc.excluir(5);
		
//		jdbc.inserir(5, "AUTOMOVEIS");
		jdbc.inserir(6, "TESTE", 5);
//		jdbc.consultar();
//		jdbc.inserir(5, "AUTOMOVEIS");
//		jdbc.consultar();
//		
	}
	
	public Connection obterConexao() throws ClassNotFoundException, SQLException {
		
		Class.forName("org.h2.Driver");
		Connection conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", ""); 
		return conn;
	}
	
	private void consultar() throws SQLException {
		
		
		String SQL = "SELECT P.ID, P.NAME, G.NAME FROM PRODUTO P JOIN CATEGORIA G ON P.CATEGORIA_ID = G.ID";
		
		 
		try {
			
			Connection conn = obterConexao();
		
			Statement stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery(SQL);
			
			while(rs.next()) {
				System.out.print(rs.getInt(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.println(rs.getString(3));
			}
			
			rs.close();
			stmt.close();
			conn.close();
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void inserir(int id, String nome) {
		
		String SQL = "INSERT INTO CATEGORIA (ID, NAME) VALUES (" + id + ", " + nome + ")";
		
		try {
			
			Connection conn = obterConexao();
			
			Statement stmt = conn.createStatement();
			
			System.out.println(stmt.executeUpdate(SQL));

			stmt.close();
			conn.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void inserir(int id, String nome, int categoriaId) {
		
		String SQL = "INSERT INTO PRODUTO (ID, NAME, CATEGORIA_ID) VALUES (" + id + ", '" + nome + "', " + categoriaId + ")";
		
		try {
			
			Connection conn = obterConexao();
			
			Statement stmt = conn.createStatement();
			
			System.out.println(stmt.executeUpdate(SQL));

			stmt.close();
			conn.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	public void alterar(int id, String nome) {
		
		String SQL = "UPDATE CATEGORIA SET NAME='" + nome + "' WHERE ID=" + id;
		
		try {
			
			Connection conn = obterConexao();
			
			Statement stmt = conn.createStatement();
			
			System.out.println(stmt.executeUpdate(SQL));

			stmt.close();
			conn.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void excluir(int id) {
		
		String SQL = "DELETE FROM CATEGORIA WHERE ID=" + id;
		
		try {
			
			Connection conn = obterConexao();
			
			Statement stmt = conn.createStatement();
			
			System.out.println(stmt.executeUpdate(SQL));

			stmt.close();
			conn.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
