package com.kh.menu.view;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
	
	public MainFrame() {
		super("�޴�");
		
		this.setBounds(200, 200, 1280, 720);
		this.setLocationRelativeTo(null);
		
		new MainPage(this);

		// �ݵ�� �ʿ��� �ڵ�
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
