package miniproject;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class Selectplace {
	public Selectplace() {
		JFrame frame = new JFrame("���Ұ���ȭ��");
		frame.setSize(1280,720);
		// �׸��巹�̾ƿ� ������ �г�
		JPanel panel1 = new JPanel();
		panel1.setLocation(100,100);
		panel1.setSize(1000, 600);
		panel1.setLayout(null);
		
		// �ڸ����� �г�
		JPanel panel2 = new JPanel();
		panel2.setLocation(800,100);
		panel2.setSize(400, 200);
		panel2.setLayout(null);
		
		panel2.add(new Button("�ڸ�����"));
		
		JPanel panel = new JPanel(new GridLayout(6, 5, 10, 20));
		panel.setSize(1000,500);
		JLabel lb1 = new JLabel("ȸ�����");
		lb1.setFont(lb1.getFont().deriveFont(30.0f));
		lb1.setHorizontalAlignment(JLabel.CENTER);
		lb1.setBackground(Color.blue);
		lb1.setOpaque(true);
		panel.add(lb1);
		
		JLabel lb2 = new JLabel("�л����");
		lb2.setFont(lb2.getFont().deriveFont(30.0f));
		lb2.setHorizontalAlignment(JLabel.CENTER);
		lb2.setBackground(Color.blue);
		lb2.setOpaque(true);
		panel.add(lb2);
		
		JLabel lb3 = new JLabel("��ȸ�����");
		lb3.setFont(lb3.getFont().deriveFont(30.0f));
		lb3.setHorizontalAlignment(JLabel.CENTER);
		lb3.setBackground(Color.blue);
		lb3.setOpaque(true);
		panel.add(lb3);
		
		JLabel lb4 = new JLabel("��ǰ��");
		lb4.setFont(lb4.getFont().deriveFont(30.0f));
		lb4.setHorizontalAlignment(JLabel.CENTER);
		lb4.setBackground(Color.blue);
		lb4.setOpaque(true);
		panel.add(lb4);
		
		JLabel lb5 = new JLabel("��������");
		lb5.setFont(lb5.getFont().deriveFont(30.0f));
		lb5.setHorizontalAlignment(JLabel.CENTER);
		lb5.setBackground(Color.blue);
		lb5.setOpaque(true);
		panel.add(lb5);
		
		JButton b1 = new JButton("1�ð� / 1000��");
		b1.setFont(b1.getFont().deriveFont(20.0f));
		panel.add(b1);
		
		JButton b2 = new JButton("1�ð� / 900��");
		b2.setFont(b2.getFont().deriveFont(20.0f));
		panel.add(b2);
		
		JButton b3 = new JButton("1�ð� / 1200��");
		b3.setFont(b3.getFont().deriveFont(20.0f));
		panel.add(b3);
		
		JButton b4 = new JButton("��ȭ��ǰ��");
		b4.setFont(b4.getFont().deriveFont(20.0f));
		panel.add(b4);
		
		JButton b5 = new JButton("ī��");
		b5.setFont(b5.getFont().deriveFont(20.0f));
		panel.add(b5);
		
		JButton b6 = new JButton("3�ð� / 3000��");
		b6.setFont(b6.getFont().deriveFont(20.0f));
		panel.add(b6);
		
		JButton b7 = new JButton("3�ð� / 2400��");
		b7.setFont(b7.getFont().deriveFont(20.0f));
		panel.add(b7);
		JButton b9 = new JButton("3�ð� / 3300��");
		b9.setFont(b9.getFont().deriveFont(20.0f));
		panel.add(b9);
		
		JButton b10 = new JButton("�ؽ�ĳ��");
		b10.setFont(b10.getFont().deriveFont(20.0f));
		panel.add(b10);
		
		JButton b11 = new JButton("����");
		b11.setFont(b11.getFont().deriveFont(20.0f));
		panel.add(b11);
		
		JButton b12 = new JButton("5�ð� / 4000��");
		b12.setFont(b12.getFont().deriveFont(20.0f));
		panel.add(b12);
		
		
		JButton b13 = new JButton("5�ð� / 3500��");
		b13.setFont(b13.getFont().deriveFont(20.0f));
		panel.add(b13);
	
		JButton b14 = new JButton("5�ð� / 5000��");
		b14.setFont(b14.getFont().deriveFont(20.0f));
		panel.add(b14);
		
		JButton b15 = new JButton("��ĳ��");
		b15.setFont(b15.getFont().deriveFont(20.0f));
		panel.add(b15);
		
		JButton b16 = new JButton("īī������");
		b16.setFont(b16.getFont().deriveFont(20.0f));
		panel.add(b16);
		
		JButton b17 = new JButton("12�ð� / 10000��");
		b17.setFont(b17.getFont().deriveFont(20.0f));
		panel.add(b17);
		
		JButton b18 = new JButton("12�ð� / 8000��");
		b18.setFont(b18.getFont().deriveFont(20.0f));
		panel.add(b18);
		
		JButton b19 = new JButton("12�ð� / 12000��");
		b19.setFont(b19.getFont().deriveFont(20.0f));
		panel.add(b19);
		
		JButton b20 = new JButton("ƾĳ��");
		b20.setFont(b20.getFont().deriveFont(20.0f));
		panel.add(b20);
	
		JButton b21 = new JButton("�Ｚ����");
		b21.setFont(b21.getFont().deriveFont(20.0f));
		panel.add(b21);
		
		JButton b22 = new JButton("20�ð� / 15000��");
		b22.setFont(b22.getFont().deriveFont(20.0f));
		panel.add(b22);
		
		JButton b23 = new JButton("20�ð� / 12000��");
		b23.setFont(b23.getFont().deriveFont(20.0f));
		panel.add(b23);
		
		panel.add(new JLabel(""));
		
		JButton b24 = new JButton("���۱���Ʈ");
		b24.setFont(b24.getFont().deriveFont(20.0f));
		panel.add(b24);
		
		JButton b25= new JButton("�佺");
		b25.setFont(b25.getFont().deriveFont(20.0f));
		panel.add(b25);
		panel1.add(panel);
		
		frame.add(panel1);
		frame.add(panel2); //  �ڸ����� �г� �߰�
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new Selectplace();
	}
}
