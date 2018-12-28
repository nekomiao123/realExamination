package realExamination;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class FileIO {
	
	//返回字符串数组的read函数
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
			//将ArrayList转换成为String的字符串数组
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
	
	//写入函数,写入一个字符串数组
	public void writeLines(String[] s,String filename)
	{
		try {
			
			FileWriter fw = new FileWriter(filename,true);
			//true代表以追加的方式写入
			BufferedWriter bw=new BufferedWriter(fw);
			for(int i=0;i<s.length;i++)
			{
				String tmp =s[i]+"\r\n";
				bw.write(tmp);
				//bw.newLine();
				bw.flush();
				//使用缓冲区中的方法，将数据刷新到目的地文件中去。
			}
			bw.close();
			fw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//写入函数,只写入一行,作为追加
	public void Writel(String s,String filename)
	{
		try {
			FileWriter fw = new FileWriter(filename,true);
			//true代表以追加的方式写入
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write(s+"\r\n");
			//每次写入之后得换行
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
		io.Writel("2016002001,王虹,充值,1000", file2);
		
	}

}

