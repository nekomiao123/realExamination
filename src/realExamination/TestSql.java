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
		//��ѯ���
	    System.out.println("��������Ҫ���в�ѯ��רҵ");
		Scanner sc = new Scanner(System.in);
		String sdept = sc.nextLine();
		String sql = "SELECT * from student WHERE Sdept = '" + sdept + "'";;

	    ct = Sqlcon.getConn();
	    try {
	    	// ��ȡStatement
			ps = (PreparedStatement)ct.prepareStatement(sql);
			//ִ�в�ѯ
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
