/*
Conexão do drive postgresql com banco de dados postgre,
sendo acessado pelo usuário postgres é a senha.
*/
package sistema.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	String driver = "org.postgresql.Driver";
	private String url = "jdbc:postgresql://localhost/sistemaweb";
	private String usuario = "postgres";
	private String senha   = "150996"; 
	public Connection getConnetion()  {
		try {
			Class.forName(driver);
			return  DriverManager.getConnection(url, usuario, senha);
		} catch (SQLException erro) {
			throw new RuntimeException(erro);		
		  }
		catch (ClassNotFoundException erro) {
			throw new RuntimeException(erro);		
		  }
	}
}
