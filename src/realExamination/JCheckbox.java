package realExamination;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JCheckbox extends JFrame implements ActionListener{

	
	
	private JCheckBox checkbox[];                          //字形复选框数组  
	private String stylestr[]={"喵喵", "鞠喵","小鞠"};
	private JMenu menu[];
	public JCheckbox()
	{
		super("201700800609 姚惠峰");
		this.setSize(500,400);
		//this.setLocation(500,300);	
		this.setLocationRelativeTo(null);    //窗口居中
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		init();
		this.setVisible(true);
	}
	
	public void init()
	{
		Container c = this.getContentPane();
		c.setLayout(new GridLayout(2, 1));
		
		//菜单栏
		JMenuBar menubar = new JMenuBar();  
		//框架上添加菜单栏
		this.setJMenuBar(menubar); 
		String menustr[] = {"文件","编辑","插入","格式"};
		String menuitemstr[][] = {
				{"新建","打开","保存","另存为","|","退出"},
                {"撤销","恢复","|","剪切","复制","粘贴","|","查找","替换"},
                {"日期","文本"},
                {"字体"}};
		menu = new JMenu[menustr.length];
		JMenuItem menuitem[][] = new JMenuItem[menustr.length][];
		for(int i=0;i<menustr.length;i++)
		{
			menu[i] = new JMenu(menustr[i]);
			menubar.add(menu[i]);
			menuitem[i] = new JMenuItem[menuitemstr[i].length];
			for(int j=0;j<menuitem[i].length;j++)
			{
				if(menuitemstr[i][j].equals("|"))
					this.menu[i].addSeparator();
				else {
					menuitem[i][j] = new JMenuItem(menuitemstr[i][j]);
					menu[i].add(menuitem[i][j]);
					menuitem[i][j].addActionListener(this);
				}
			}
		}
		
		
		JPanel panel1 = new JPanel(new FlowLayout());
		JPanel panel2 = new JPanel(new FlowLayout());
		
		JLabel label = new JLabel("请选择你喜欢的");
//		JCheckBox check = new JCheckBox("喵喵");
//		check.addActionListener(e->{
//			if(check.isSelected()) {
//				System.out.println("你选择了"+check.getText());
//				System.out.println("但是喵喵是我的");
//			}
//		}
//		);
//		JCheckBox jbox = new JCheckBox("鞠喵");
//		JCheckBox ju = new JCheckBox("小鞠");
		panel1.add(label);
		
		this.checkbox = new JCheckBox[stylestr.length];
		for(int i=0;i<stylestr.length;i++)
		{
			this.checkbox[i] = new JCheckBox(stylestr[i]);
			panel2.add(checkbox[i]);
			this.checkbox[i].addActionListener(this);
		}
		
		c.add(panel1);
		c.add(panel2);
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JCheckbox();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i=0;i<stylestr.length;i++) {
			if(e.getSource()==checkbox[i])
			{
				if(checkbox[i].isSelected()) {
					System.out.println("你选择了"+checkbox[i].getText());
					System.out.println("但是"+checkbox[i].getText()+"是我的");
				}
			}
		}
		
		
	}

}
