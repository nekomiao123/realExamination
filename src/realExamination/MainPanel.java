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
		super("201700800609 Ҧ�ݷ�");
		this.setSize(500,400);                               //���ô��ڴ�С
		//this.setLocation(400,300);	                         //���ô���λ��
		this.setLocationRelativeTo(null);                    //���ھ���
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //���ڹر�ʱ���������
		init();
		this.setVisible(true);
	}
	
	public void init()
	{
		//�������
		Container c = this.getContentPane();
		c.setLayout(new BorderLayout());
		
	}
	
	//������
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
