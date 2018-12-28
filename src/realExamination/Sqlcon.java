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
	     * ��microsoft�ṩ��java-sqlserver���ݿ���������������sqlserverʱ��url
	     * localhost��ָ������ݿ��������ַ��1433Ϊ���sqlserver�˿ںţ�
	     * ��student������Ҫ���ӵ����ݿ������
	    */
	    //�û���������
	    String username = "sa";
	    String password = "123a.";
	    
	    Connection conn = null;
	    try {
	        Class.forName(driver); //classLoader,���ض�Ӧ����
	        System.out.println("���������ɹ���");
	        conn = (Connection) DriverManager.getConnection(url, username, password);
	        System.out.println("�������ݿ�ɹ���");
	    } catch (ClassNotFoundException e) {
	        e.printStackTrace();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return conn;
		}
		
		
		public static void closeAll(Connection conn,ResultSet rset,PreparedStatement pstmt){
			try {
				//��������Ƿ��ѹرգ����û�йرգ���ر�
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
				//��������Ƿ��ѹرգ����û�йرգ���ر�
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
