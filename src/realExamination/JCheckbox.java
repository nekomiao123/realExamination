package realExamination;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JCheckbox extends JFrame implements ActionListener{

	
	
	private JCheckBox checkbox[];                          //���θ�ѡ������  
	private String stylestr[]={"����", "����","С��"};
	private JMenu menu[];
	public JCheckbox()
	{
		super("201700800609 Ҧ�ݷ�");
		this.setSize(500,400);
		//this.setLocation(500,300);	
		this.setLocationRelativeTo(null);    //���ھ���
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		init();
		this.setVisible(true);
	}
	
	public void init()
	{
		Container c = this.getContentPane();
		c.setLayout(new GridLayout(2, 1));
		
		//�˵���
		JMenuBar menubar = new JMenuBar();  
		//�������Ӳ˵���
		this.setJMenuBar(menubar); 
		String menustr[] = {"�ļ�","�༭","����","��ʽ"};
		String menuitemstr[][] = {
				{"�½�","��","����","���Ϊ","|","�˳�"},
                {"����","�ָ�","|","����","����","ճ��","|","����","�滻"},
                {"����","�ı�"},
                {"����"}};
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
		
		JLabel label = new JLabel("��ѡ����ϲ����");
//		JCheckBox check = new JCheckBox("����");
//		check.addActionListener(e->{
//			if(check.isSelected()) {
//				System.out.println("��ѡ����"+check.getText());
//				System.out.println("�����������ҵ�");
//			}
//		}
//		);
//		JCheckBox jbox = new JCheckBox("����");
//		JCheckBox ju = new JCheckBox("С��");
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
					System.out.println("��ѡ����"+checkbox[i].getText());
					System.out.println("����"+checkbox[i].getText()+"���ҵ�");
				}
			}
		}
		
		
	}

}
