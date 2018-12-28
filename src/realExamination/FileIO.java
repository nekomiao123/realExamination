package realExamination;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class FileIO {
	
	//�����ַ��������read����
	public String[] readAllLines(String filename)
	{
		ArrayList<String> stu = new ArrayList<>();
		String[] s = null;
		try {

			FileReader fr = new FileReader(filename);
			BufferedReader br=new BufferedReader(fr);
			String ch;
			while((ch=br.readLine())!=null){
				stu.add(ch);
			}
			s = new String[stu.size()];
			//��ArrayListת����ΪString���ַ�������
			for(int i=0;i<stu.size();i++)
			{
				s[i] = stu.get(i);
			}
			br.close();
			fr.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return s;
	}
	
	//д�뺯��,д��һ���ַ�������
	public void writeLines(String[] s,String filename)
	{
		try {
			
			FileWriter fw = new FileWriter(filename,true);
			//true������׷�ӵķ�ʽд��
			BufferedWriter bw=new BufferedWriter(fw);
			for(int i=0;i<s.length;i++)
			{
				String tmp =s[i]+"\r\n";
				bw.write(tmp);
				//bw.newLine();
				bw.flush();
				//ʹ�û������еķ�����������ˢ�µ�Ŀ�ĵ��ļ���ȥ��
			}
			bw.close();
			fw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//д�뺯��,ֻд��һ��,��Ϊ׷��
	public void Writel(String s,String filename)
	{
		try {
			FileWriter fw = new FileWriter(filename,true);
			//true������׷�ӵķ�ʽд��
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write(s+"\r\n");
			//ÿ��д��֮��û���
			bw.flush();
			bw.close();
			fw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String file = "test.txt";
		String file2 = "t.txt";
		FileIO io = new FileIO();
		String[] tmp = io.readAllLines(file);
		io.writeLines(tmp, file2);
		io.Writel("2016002001,����,��ֵ,1000", file2);
		
	}

}

