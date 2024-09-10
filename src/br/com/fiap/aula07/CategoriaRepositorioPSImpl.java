package br.com.fiap.aula07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

import com.mysql.cj.xdevapi.PreparableStatement;

public class CategoriaRepositorioPSImpl implements ICategoriaRepositorio {
	
	private static Logger log = Logger.getAnonymousLogger();
	
	private Connection obterConexao()  {
		
		Connection conn = null;
		
		try {

			//Class.forName("org.h2.Driver");
			//conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/fiap?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true", "root", "123456");
			conn.setAutoCommit(true);
			
		} catch (SQLException sqlex) {
			log.info(sqlex.getMessage());
		} 
				
		
				
		return conn;
	}
	
	public void consultar() {
		
		
		String SQL = "SELECT ID, NAME FROM CATEGORIA";
		
		Connection conn = obterConexao();
		
		try {
			
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(SQL);
			
			while(rs.next()) {
				System.out.print(rs.getInt(1) + "\t");
				System.out.println(rs.getString(2));
			}
			
			rs.close();
			stmt.close();
					
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public void inserir(int id, String nome) {
		
		String SQL = "INSERT INTO CATEGORIA (ID, NAME) VALUES (?, ?)";

		Connection conn = obterConexao();
		
		try {
			
			PreparedStatement pstmt = conn.prepareStatement(SQL);
			
			pstmt.setInt(1, id);
			pstmt.setString(2, nome);
						
			System.out.println(pstmt.execute());

			pstmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

	
	public void alterar(int id, String nome) {
		
		String SQL = "UPDATE CATEGORIA SET NAME=? WHERE ID=?";

		Connection conn = obterConexao();

		
		try {
			
			PreparedStatement pstmt = conn.prepareStatement(SQL);
			
			pstmt.setString(1, nome);
			pstmt.setInt(2, id);
			
			System.out.println(pstmt.execute());

			pstmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public void excluir(int id) {
		
		String SQL = "DELETE FROM CATEGORIA WHERE ID=?";

		Connection conn = obterConexao();
		
		try {
			
			PreparedStatement pstmt = conn.prepareStatement(SQL);
			
			pstmt.setInt(1, id);
			
			System.out.println(pstmt.execute());

			pstmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	
	public void excluirTodos() {
		
		String SQL = "DELETE FROM CATEGORIA";

		Connection conn = obterConexao();
		
		try {
			
			Statement stmt = conn.createStatement();
			System.out.println(stmt.executeUpdate(SQL));

			stmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
