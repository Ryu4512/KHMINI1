package com.kh.run;

import java.awt.Color;
import java.awt.Font;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class timer extends JFrame{
	private String one;
	private String two;
	private String a;
	private int m = -1;
	private int h, s;
	private JLabel first = new JLabel();
	private JLabel second = new JLabel();
	private JLabel aa = new JLabel();
	private JLabel aa2 = new JLabel();

	public timer() {
		set();
		setlabel();
		timeget();
	}
	public void timeget() {
		String sday=null;
		Calendar t=Calendar.getInstance();
		int year = t.get(Calendar.YEAR); 
		int month = t.get(Calendar.MONTH)+1;
		int date = t.get(Calendar.DATE);
		int amPm = t.get(Calendar.AM_PM);
		String ampm=amPm==Calendar.AM? "����":"����";
		int hour = t.get(Calendar.HOUR);
		if(hour == 0) {
			hour = 12;
		}
		int min = t.get(Calendar.MINUTE);
		int sec = t.get(Calendar.SECOND);
		int day= t.get(Calendar.DAY_OF_WEEK);
		a = ("���ð� : "+year+"."+month+"."+date+"."+ampm+" "+hour+":"+min+":"+sec);
		aa.setText(a);
		add(aa);
		while(true) {
			Calendar t2=Calendar.getInstance();
			int year2 = t2.get(Calendar.YEAR); 
			int month2 = t2.get(Calendar.MONTH)+1;
			int date2 = t2.get(Calendar.DATE);
			int amPm2 = t2.get(Calendar.AM_PM);
			int hour2 = t2.get(Calendar.HOUR);
			if(hour2 == 0) {
				hour2 = 12;
			}
			int min2 = t2.get(Calendar.MINUTE);
			int sec2 = t2.get(Calendar.SECOND);
			String ampm2=amPm==Calendar.AM? "����":"����";
			int day2= t.get(Calendar.DAY_OF_WEEK);
			one = (year2+"."+month2+"."+date2+".");
			two = (ampm2+" "+hour2+":"+min2+":"+sec2);
			if(sec2<sec) {
				sec2 += 60;
			}
			s = (sec2 -sec);
			if(s == 0) {
				m++;
			}
			if(m == 60) {
				m = 0;
				h++;
			}
			String h2 = h+"";
			String m2 = m+"";
			String s2 = s+"";
						
			first.setText("����ð� : " + one + two);
			aa2.setText("���ð� : " + h2+":"+m2+":"+s2);
			add(aa2);
			add(first);
			add(second);
			try {
				Thread.sleep(1000);//1��
				repaint();
		    } catch(Exception e) {
		    	
		    }
		}
	}
public void setlabel() {	
		first.setBackground(new Color(0,0,0,0));
		first.setBounds(0,120,300,50);
		first.setForeground(Color.black);
		aa2.setBackground(new Color(0,0,0,0));
		aa2.setBounds(0,0,100,50);
		aa2.setForeground(Color.red);
		aa.setBackground(new Color(0,0,0,0));
		aa.setBounds(0,50,300,50);
		aa.setForeground(Color.BLUE);
	}
	public void set() {
		setTitle("�Ƕ����� Ÿ�̸�");
		setSize(400, 200);
		setLocationRelativeTo(null);	//	ȭ�� ����� â�� ����
		setLayout(null);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}
	public static void main(String[] args) { 
		new timer();
	}

	
}
