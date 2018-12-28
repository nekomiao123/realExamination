package realExamination;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class TestSql {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PreparedStatement ps = null;
	    Connection ct = null;
	    ResultSet rs = null;
		//查询语句
	    System.out.println("请输入想要进行查询的专业");
		Scanner sc = new Scanner(System.in);
		String sdept = sc.nextLine();
		String sql = "SELECT * from student WHERE Sdept = '" + sdept + "'";;

	    ct = Sqlcon.getConn();
	    try {
	    	// 获取Statement
			ps = (PreparedStatement)ct.prepareStatement(sql);
			//执行查询
			rs = ps.executeQuery();
			while(rs.next()){
            	for(int i=1;i<6;i++)
            	{
                System.out.print(rs.getString(i)+" ");         
                }
            	System.out.println("");
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    Sqlcon.closeAll(ct, rs, ps);

	}

}
