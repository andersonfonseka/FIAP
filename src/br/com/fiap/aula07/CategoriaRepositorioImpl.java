package br.com.fiap.aula07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

public class CategoriaRepositorioImpl implements ICategoriaRepositorio {
	
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
		
		String SQL = "INSERT INTO CATEGORIA (ID, NAME) VALUES (" + id + ", '" + nome + "')";

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
	
	public void alterar(int id, String nome) {
		
		String SQL = "UPDATE CATEGORIA SET NAME='" + nome + "' WHERE ID=" + id;

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

	public void excluir(int id) {
		
		String SQL = "DELETE FROM CATEGORIA WHERE ID=" + id;

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
