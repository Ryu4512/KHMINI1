package text.com.kh.test.view;

import javax.swing.JFrame;


public class MainFrame extends JFrame {

	public MainFrame() {
		super("�г� ü���� �׽�Ʈ");
		this.setSize(1280, 720);
				
		new OpenPage(this);
//		new OpenPage2(this);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
