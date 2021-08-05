package text.com.kh.test.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class OpenPage2 extends JPanel{
	private MainFrame mf;
	private JPanel mainPage;
	private Image img;
	
	public OpenPage2(MainFrame mf) {
		this.mf = mf;
		this.mainPage = this;
					
		// ������ ȭ��
		
		// out JPanel ����ȭ�� 
		JPanel outPanel = new JPanel();
		outPanel.setPreferredSize(new Dimension(1280, 720));
		outPanel.setBackground(Color.blue);
						
		// inJPanel ����
		JPanel inPanel = new JPanel();
		inPanel.setPreferredSize(new Dimension(1200, 665));
		inPanel.setBackground(Color.white);
		outPanel.add(inPanel);
		inPanel.setLayout(new FlowLayout());
						
		// JLabel "�ֹ����"
		JLabel jmjl = new JLabel("�ֹ����");
		inPanel.add(jmjl);
		jmjl.setFont(new Font("���", Font.BOLD, 40));
		jmjl.setForeground(Color.black);
		jmjl.setPreferredSize(new Dimension(1200, 80));
		jmjl.setHorizontalAlignment(JLabel.CENTER);
		// jmjl.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		// JButton "�Ϸ�"
		JButton move = new JButton("�Ϸ�");
		move.setBackground(Color.red);
		inPanel.add(move);
		move.setFont(new Font("���", Font.BOLD, 20));
		move.setForeground(Color.white);
		move.setPreferredSize(new Dimension(120, 60));
		move.setLayout(new FlowLayout(FlowLayout.RIGHT));

		// right JPanel "�ֹ�����" button
		JButton menubutton = new JButton("�ֹ�����");
		menubutton.setBackground(Color.gray);
		inPanel.add(menubutton);
		menubutton.setFont(new Font("���", Font.BOLD, 20));
		menubutton.setForeground(Color.white);
		menubutton.setPreferredSize(new Dimension(120, 60));
		menubutton.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		// linePanel ����
		JPanel linePanel = new JPanel();
		linePanel.setPreferredSize(new Dimension(1200, 10));
		linePanel.setBackground(Color.black);
		inPanel.add(linePanel);
				
		// JtextField 
		JLabel requests = new JLabel("��û����");
		inPanel.add(requests);
		requests.setFont(new Font("���", Font.BOLD, 40));
		requests.setHorizontalAlignment(JLabel.LEFT);
		
		JTextField tf = new JTextField(50);
		JTextArea ta = new JTextArea(10, 50);
		tf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = tf.getText();
				ta.append(text + "\n");
				tf.setText("");
				}
			});
		inPanel.add(tf);
		inPanel.add(ta);
		
		
		this.add(outPanel);
		mf.add(this);
	}
		
}



