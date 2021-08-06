package com.kh.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.kh.common.ChangePanel;
import com.kh.model.vo.PcMember;

public class LoginAfterPage extends JPanel{
	private MainFrame mfr;
	private JPanel loginafterpage;
	private Image img;
		
	public LoginAfterPage(MainFrame mf) {
		this.mfr = mf;
		this.loginafterpage = this;
		
		Login lo = new Login(mf);
		PcMember pm = new PcMember();
		Seat se = new Seat(mf);
		
		// �α��� �� ȭ��
		
		// up JPanel
		JPanel upPanel = new JPanel();
		upPanel.setPreferredSize(new Dimension(840, 80));
		upPanel.setBackground(Color.darkGray);
			
		// JLabel "no."
		JLabel nojl = new JLabel("no." /*OO �Դϴ�*/);
		upPanel.add(nojl);
		nojl.setFont(new Font("���", Font.BOLD, 30));
		nojl.setForeground(Color.white);
		nojl.setPreferredSize(new Dimension(560, 60));
		
		/*// JLabel "ȸ����ȣ or ��ȸ�� ��ȣ"
		JLabel nojl2 = new JLabel("OO �Դϴ�");
		upPanel.add(nojl2);
		nojl2.setFont(new Font("���", Font.BOLD, 30));
		nojl2.setForeground(Color.white);
		nojl2.setPreferredSize(new Dimension(260, 60));
		*/
		
		// JButton "�ڸ��̵�"
		JButton move = new JButton("�ڸ� �̵� >>");
		move.setBackground(Color.darkGray);
		upPanel.add(move);
		move.setPreferredSize(new Dimension(240, 60));
		move.setFont(new Font("���", Font.BOLD, 20));
		move.setForeground(Color.yellow);
		move.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "�ڸ��̵� �������� �̵��մϴ�", "�ڸ� �̵�", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, loginafterpage, new Seat(mf));
			}
		});
				
		// left JPanel 
		JPanel leftPanel = new JPanel();
		leftPanel.setPreferredSize(new Dimension(840, 720));
		leftPanel.setBackground(Color.black);
		leftPanel.add(upPanel);
		leftPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
				
		// ����� JLabel
		JLabel jl1 = new JLabel();
		leftPanel.add(jl1);
		jl1.setPreferredSize(new Dimension(1000, 60));
		
		// leftPanel JLabel ID 
		JLabel info = new JLabel("ID : " + pm.getUserId());
		leftPanel.add(info);
		info.setFont(new Font("���", Font.BOLD, 30));
		info.setForeground(Color.white);
		info.setPreferredSize(new Dimension(800, 80));
		
		
		// leftPanel JLabel ȸ�����
		/*JLabel rank = new JLabel("ȸ����� : ");
		leftPanel.add(rank);
		rank.setFont(new Font("���", Font.BOLD, 30));
		rank.setForeground(Color.white);
		rank.setPreferredSize(new Dimension(800, 80));
		*/
		// Calendar
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(System.currentTimeMillis());
		
		Calendar cal2 = Calendar.getInstance();
		cal2.setTimeInMillis(System.currentTimeMillis() + 1000 * 60 * 6);
		
		// Timer
		Timer timer = new Timer();
		
		TimerTask task = new TimerTask() {

			@Override
			public void run() {
				System.out.println("Task is complete :)");
			}			
		};
		Calendar date = Calendar.getInstance();
		date.set(Calendar.YEAR,2020);
		date.set(Calendar.MONTH,Calendar.JUNE);
		date.set(Calendar.DAY_OF_MONTH,20);
		date.set(Calendar.HOUR_OF_DAY,0);
		date.set(Calendar.MINUTE,0);
		date.set(Calendar.SECOND,0);
		date.set(Calendar.MILLISECOND,0);
		
		timer.schedule(task, date.getTime());
		
				
		// leftPanel JLabel �����ð�
		JLabel time = new JLabel("�����ð� : "/*cal.get(Calendar.MINUTE)*/);
		leftPanel.add(time);
		time.setFont(new Font("���", Font.BOLD, 60));
		time.setForeground(Color.white);
		time.setPreferredSize(new Dimension(800, 160));
		
		
		
		// ���� �ð�
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date today = new Date();
		
		// leftPanel JLabel ���۽ð�
		JLabel starttime = new JLabel("���۽ð� : " + format.format(today));
		leftPanel.add(starttime);
		starttime.setFont(new Font("���", Font.BOLD, 30));
		starttime.setForeground(Color.white);
		starttime.setPreferredSize(new Dimension(800, 80));
				
		
		// leftPanel JLabel ���ð�
		JLabel usagetime = new JLabel("���ð� : " + cal2.get(Calendar.MINUTE));
		leftPanel.add(usagetime);
		usagetime.setFont(new Font("���", Font.BOLD, 30));
		usagetime.setForeground(Color.white);
		usagetime.setPreferredSize(new Dimension(800, 80));
				
		// JButton "��� ����"
		JButton exit = new JButton("��� ����");
		exit.setBackground(Color.red);
		leftPanel.add(exit);
		exit.setPreferredSize(new Dimension(180, 60));
		exit.setFont(new Font("���", Font.BOLD, 30));
		exit.setForeground(Color.white);
		exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "����� ���� �մϴ�", "��� ����", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, loginafterpage, new Login(mf));
			}
		});
				
		
		// right JPanel ����
		JPanel rightPanel = new JPanel();
		rightPanel.setPreferredSize(new Dimension(400, 720));
		rightPanel.setBackground(Color.gray);
		Image icon = new ImageIcon("icon/raccoon.jpg").getImage().getScaledInstance(340, 520, 0);
		// JLabel �����Ͽ� Image ����
		JLabel label = new JLabel(new ImageIcon(icon));
		rightPanel.add(label);
		// ���� ���������� Ŭ���� �Ͼ�� �� �̺�Ʈ ����
		// this.addMouseListener(new MyMouseAdapter());
		
		// right JPanel "�޴� �ֹ�" button
		JButton menubutton = new JButton("�޴� �ֹ�");
		menubutton.setBackground(Color.blue);
		rightPanel.add(menubutton);
		menubutton.setPreferredSize(new Dimension(350, 100));
		menubutton.setFont(new Font("���", Font.BOLD, 60));
		menubutton.setForeground(Color.white);
		menubutton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "�޴� �ֹ� �������� �̵��մϴ�.", "�޴� �ֹ�", JOptionPane.PLAIN_MESSAGE);
				ChangePanel.changePanel(mfr, loginafterpage, new CafePage(mf));
			}
		});
		
		
		this.add(leftPanel);
		this.add(rightPanel);
		mf.add(this);
	}
	
	public void Time() {
		
	}
		
}

