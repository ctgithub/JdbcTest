import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Test {

	public static Connection conn;
	public static Connection getconn() throws ClassNotFoundException, SQLException{
		String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String url="jdbc:sqlserver://localhost:1433;;databaseName=instant";
		String username="sa";
		String pwd="200802";
		Class.forName(driver);
		conn=DriverManager.getConnection(url,username,pwd);
		return conn;
		
	}
	public static void main(String[] args){
		try {
			Test.getconn();
			System.out.println("dedao");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
