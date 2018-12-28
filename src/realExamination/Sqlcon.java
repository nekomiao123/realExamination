package realExamination;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Sqlcon {
	
		public static Connection getConn() 
		{
	    String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	    String url = "jdbc:sqlserver://localhost:1433;databaseName = student";
	    /*"jdbc:sqlserver://localhost:1433;databaseName = student"
	     * 是microsoft提供的java-sqlserver数据库连接驱动来访问sqlserver时的url
	     * localhost是指你的数据库服务器地址，1433为你的sqlserver端口号！
	     * “student”是所要连接的数据库的名称
	    */
	    //用户名和密码
	    String username = "sa";
	    String password = "123a.";
	    
	    Connection conn = null;
	    try {
	        Class.forName(driver); //classLoader,加载对应驱动
	        System.out.println("加载驱动成功！");
	        conn = (Connection) DriverManager.getConnection(url, username, password);
	        System.out.println("连接数据库成功！");
	    } catch (ClassNotFoundException e) {
	        e.printStackTrace();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return conn;
		}
		
		
		public static void closeAll(Connection conn,ResultSet rset,PreparedStatement pstmt){
			try {
				//检查连接是否已关闭，如果没有关闭，则关闭
				if(rset!=null){
					rset.close();
					rset=null;
				}
				if( pstmt != null) {
					pstmt.close();
					pstmt = null;
				}
				if( !conn.isClosed()) 
					conn.close();
			}catch(SQLException e1) {
				e1.printStackTrace();
			}
		}
		public static void closeAll(Connection conn,ResultSet rset,Statement pstmt){
			try {
				//检查连接是否已关闭，如果没有关闭，则关闭
				if(rset!=null){
					rset.close();
					rset=null;
				}
				if( pstmt != null) {
					pstmt.close();
					pstmt = null;
				}
				if( !conn.isClosed()) 
					conn.close();
			}catch(SQLException e1) {
				e1.printStackTrace();
			}
		}
	
	public static void main(String[] args) 
	{
		
	}

}
