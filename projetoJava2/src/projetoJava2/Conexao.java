package projetoJava2;
import java.sql.*;

public class Conexao 
{
	static String status="";

	public static Connection getConection() 
	{
		Connection conn = null;
		 String url = "jdbc:mysql://localhost/teste";
		String user = "root";
		String password = "wasd";
		try
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(url,user, password);
			status = "Conection opened";
		}
		catch(SQLException e)
		{
			status = e.getMessage();
		}
		catch(ClassNotFoundException e)
		{
			status = e.getMessage();
		}
		catch(Exception e)
		{
			status = e.getMessage();
		}

		return conn;
	}

}
