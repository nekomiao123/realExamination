package realExamination;

import java.awt.*;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class MainPanel extends JFrame implements ActionListener, MouseListener {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	
	
	
	public MainPanel()
	{
		super("201700800609 姚惠峰");
		this.setSize(500,400);                               //设置窗口大小
		//this.setLocation(400,300);	                         //设置窗口位置
		this.setLocationRelativeTo(null);                    //窗口居中
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //窗口关闭时，程序结束
		init();
		this.setVisible(true);
	}
	
	public void init()
	{
		//顶层面板
		Container c = this.getContentPane();
		c.setLayout(new BorderLayout());
		
	}
	
	//主函数
	public static void main(String[] args) {
		new MainPanel();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
