package com.kh.view;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
	public static int SeatNumber;				// �¼� ��ȣ
	public static String getLoginID;			// �α��� �� ���̵�
	public static int getValue;					// �α��� �� ������
	public static int getpaymentScreenNumber; 	// ������ �ݾ״� �ð���
	public static String menu;					// �޴�
	public static int menunum;					// �޴� ����
	public static String call;					// ��û���� �Է°�
	public static double timer;					// ���ð�
	
	public MainFrame() {
		super("PC�� ���α׷�");
		this.setSize(1280, 720);
		this.setLocationRelativeTo(null); // �������� �� ȭ�� ����� â �߰� �ϴ� �޼ҵ�
		
		new MainPage(this);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
