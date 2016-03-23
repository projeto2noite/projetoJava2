package projetoJava2;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.DatabaseMetaData;
 
public class Conexao
{
    public static void main (String[] args) throws Exception
    {
        // register the driver 
        String sDriverName = "org.sqlite.JDBC";
        Class.forName(sDriverName);
 
        // now we set up a set of fairly basic string variables to use in the body of the code proper
        String sTempDb = "lixocoin.db";
        String sJdbc = "jdbc:sqlite";
        String sDbUrl = sJdbc + ":" + sTempDb;
        // which will produce a legitimate Url for SqlLite JDBC :
        // jdbc:sqlite:hello.db
        int iTimeout = 30;
        //String makeTable = "CREATE TABLE UsuarioComum (nome text, sobrenome text, email text, cpf integer)";
        String insert = "INSERT INTO UsuarioComum VALUES('Laura', 'Regina', 'laura.regina.cp@gmail.com', 987867567')";
        String selectFromUsuarioComum = "SELECT response from UsuarioComum";
        //String slectFromEmpresa = "SELECT response from UsuarioComum";
 
        // create a database connection
        Connection conn = DriverManager.getConnection(sDbUrl);
        try 
        {
            Statement stmt = conn.createStatement();
            
            try 
            {
                stmt.setQueryTimeout(iTimeout);
                //stmt.executeUpdate(makeTable);
                stmt.executeUpdate(insert);
                ResultSet rs = stmt.executeQuery(selectFromUsuarioComum);
                try 
                {
                	while(rs.next())
                    {
                    	String sResult = rs.getString("response");
                        System.out.println(sResult);
                    }
                } 
                finally 
                {
                    try { rs.close(); } 
                    catch (Exception ignore) {}
                }
            
            } 
            finally 
            {
                try { stmt.close(); } catch (Exception ignore) {}
            }
        } 
        finally 
        {
            try { conn.close(); } catch (Exception ignore) {}
        }
    }
 
}