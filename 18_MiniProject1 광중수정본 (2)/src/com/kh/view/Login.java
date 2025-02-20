package com.kh.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.kh.common.ChangePanel;
import com.kh.model.dao.MemberDao;
import com.kh.model.vo.PcMember;

public class Login extends JPanel{
	private MainFrame mfr;
	private JPanel login;
	private MemberDao a = new MemberDao();
	private ArrayList<PcMember> list = new ArrayList<>();
	
	public Image bg = new ImageIcon("icon/bg.jpg").getImage();
	
	protected void paintComponent(Graphics g) {
		g.drawImage(bg, 0, 0, 1280, 720, null);
	}
	
	public Login(MainFrame mf) {		
		this.mfr = mf;
		this.login = this;
			
		this.setLayout(null);
		
		String text = "<html><p style=\"color:white;font-size:40px;border-bottom:5px solid white;\">"+ mfr.SeatNumber +"</p></html>";
		JLabel label = new JLabel(text);

		String PName = "<html><p style=\"color:#E5C9F1;font-size:40px;\">"+ "MINI1 PC" +"</p></html>";
		JLabel label2 = new JLabel(PName);

		String PMenu = "<html><p style=\"color:#BEBEBE;font-size:15px;\">"
					   + "COFFEE<br>" + "DRINK<br>" + "RICE<br>" + "NOODLE<br>" + "CHICKEN<br>" + "SNACK<br>"
					   +"</p></html>";
		String PMenuDetail = "<html><p style=\"color:#FFFFFF;font-size:15px;\">"
				   + "아메리카노 / 카페라떼 / 카라멜마끼아또<br>"
				   + "탄산음료(콜라, 사이다, 웰치스) / 아이스티 / 에이드<br>"
				   + "김치볶음밥 / 낙지볶음밥 / 새우볶음밥<br>"
				   + "라면 / 짜파게티 / 라볶이 / 우동<br>"
				   + "순살치킨 / 버팔로윙 / 버팔로봉 / 지파이<br>"
				   + "핫도그 / 치즈스틱 / 소떡소떡 / 츄러스<br>"
				   +"</p></html>";
		JLabel label3 = new JLabel(PMenu);
		JLabel label4 = new JLabel(PMenuDetail);

		label.setSize(400, 80);
		label.setLocation(20, 20);
		label2.setSize(230, 60);
		label2.setLocation(525, 80);
		label3.setSize(100, 180);
		label3.setLocation(350, 200);
		label4.setSize(500, 180);
		label4.setLocation(500, 200);
		
		this.add(label);
		this.add(label2);
		this.add(label3);
		this.add(label4);

		JPanel panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setBackground(Color.DARK_GRAY);
		panel2.setSize(1280, 150);
		panel2.setLocation(0, 550);

		JLabel logo = new JLabel("KH정보교육원");
		logo.setFont(new Font("",Font.BOLD,25));
		logo.setForeground(Color.LIGHT_GRAY);
		logo.setSize(300, 150);
		logo.setLocation(10, 0);
		panel2.add(logo);		

		JPanel panel3 = new JPanel();	
		panel3.setBackground(Color.DARK_GRAY);
		panel3.setBounds(680, 550, 600, 150);
		panel3.setLayout(null);
		JLabel IdLabel = new JLabel("아이디 ");
		JLabel PwLabel = new JLabel("비밀번호 ");
		JLabel NumLabel = new JLabel("비회원 ");
		IdLabel.setForeground(Color.WHITE);
		PwLabel.setForeground(Color.WHITE);
		NumLabel.setForeground(Color.WHITE);
		JTextField IdArea = new JTextField(15);
		JPasswordField PwArea = new JPasswordField(15);
		JTextField NumArea = new JTextField(15);
		JButton LoginBtn = new JButton("로그인");
		JButton JoinBtn = new JButton("회원가입");
		JButton SearchBtn = new JButton("아이디/비밀번호 찾기");
		LoginBtn.setBackground(new Color(52, 152, 219));	//RGB
		LoginBtn.setForeground(Color.white);
		JoinBtn.setBackground(new Color(224, 224, 224));
		SearchBtn.setBackground(new Color(224, 224, 224));

		IdLabel.setSize(100, 30);
		IdLabel.setLocation(0, 10);
		PwLabel.setSize(100, 30);
		PwLabel.setLocation(0, 50);
		NumLabel.setSize(100, 30);
		NumLabel.setLocation(0, 90);
		NumArea.setEnabled(false);

		IdArea.setSize(150, 30);
		IdArea.setLocation(100, 10);
		PwArea.setSize(150, 30);
		PwArea.setLocation(100, 50);
		NumArea.setSize(150, 30);
		NumArea.setLocation(100, 90);
		
		LoginBtn.setSize(100, 110);
		LoginBtn.setLocation(260, 10);
		JoinBtn.setSize(180, 50);
		JoinBtn.setLocation(370, 10);
		SearchBtn.setSize(180, 50);
		SearchBtn.setLocation(370, 70);
		
		panel3.add(IdLabel);
		panel3.add(IdArea);		
		panel3.add(PwLabel);
		panel3.add(PwArea);		
		panel3.add(NumLabel);
		panel3.add(NumArea);
		panel3.add(LoginBtn);
		panel3.add(JoinBtn);
		panel3.add(SearchBtn);
		
		panel2.add(panel3);
		this.add(panel3);
		this.add(panel2);		

		JDialog dialog = new JDialog(mfr, "아이디/비밀번호 찾기");
		dialog.setResizable(false);
		dialog.setBounds(440, 110, 400, 500);
		JPanel findArea = new JPanel();
		JLabel findTit = new JLabel("아이디 / 비밀번호 찾기");
		findTit.setFont(new Font("",Font.BOLD,30));
		findTit.setHorizontalAlignment(JLabel.CENTER);
		String textIdOn = "<html><p style=\"width:140px;border-bottom:5px solid black;text-align:center;font-size:15px;\">"+ "아이디 찾기" +"</p></html>";
		String textIdOff = "<html><p style=\"width:140px;border-bottom:5px solid gray;text-align:center;font-size:15px;color:gray;\">"+ "아이디 찾기" +"</p></html>";
		String textPwOn = "<html><p style=\"width:140px;border-bottom:5px solid black;text-align:center;font-size:15px;\">"+ "비밀번호 찾기" +"</p></html>";
		String textPwOff = "<html><p style=\"width:140px;border-bottom:5px solid gray;text-align:center;font-size:15px;color:gray;\">"+ "비밀번호 찾기" +"</p></html>";
		JButton findIdtxt = new JButton(textIdOn);
		JButton findPwtxt = new JButton(textPwOff);

		findArea.setLayout(null);
		findIdtxt.setBorder(null);
		findPwtxt.setBorder(null);
		
		findTit.setSize(400, 50);
		findTit.setLocation(0, 10);
		findIdtxt.setSize(200, 50);
		findIdtxt.setLocation(0, 60);
		findPwtxt.setSize(200, 50);
		findPwtxt.setLocation(200, 60);

		JTextField InputName = new JTextField("이름 입력");
		JTextField InputEmail = new JTextField("이메일주소 입력");
		JTextField InputID = new JTextField("아이디 입력");
		JTextField InputPhone = new JTextField("휴대폰번호 입력 (-제외)");
		JButton SearchId_btn = new JButton("아이디 찾기");
		JButton SearchPw_btn = new JButton("비밀번호 찾기");
		JLabel SearchResult = new JLabel();

		InputName.setSize(200, 50);
		InputName.setLocation(100, 150);
		InputEmail.setSize(200, 50);
		InputEmail.setLocation(100, 210);
		
		InputID.setSize(200, 50);
		InputID.setLocation(100, 150);
		InputPhone.setSize(200, 50);
		InputPhone.setLocation(100, 210);

		SearchResult.setSize(400, 20);
		SearchResult.setLocation(0, 300);
		SearchResult.setHorizontalAlignment(JLabel.CENTER);
		
		SearchId_btn.setSize(200, 50);
		SearchId_btn.setLocation(100, 350);
		SearchPw_btn.setSize(200, 50);
		SearchPw_btn.setLocation(100, 350);		
		
		findArea.add(findTit);
		findArea.add(findIdtxt);
		findArea.add(findPwtxt);
		findArea.add(InputName);
		findArea.add(InputEmail);
		findArea.add(SearchId_btn);
		findArea.add(SearchResult);
		dialog.add(findArea);
		
		LoginBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
		    	int value = -1;
		    	for(int i = 0; i < list.size(); i++) {
		    		if(IdArea.getText().equals(list.get(i).getUserId()) &&
		    		PwArea.getText().equals(list.get(i).getUserPw())) {
		    			value = i;
		    			mfr.getValue = value;
		    		}
		    	}
		    	if(value >= 0) {
		    		JOptionPane.showMessageDialog(null, "로그인 성공", "MINI1 PC", JOptionPane.PLAIN_MESSAGE);
					ChangePanel.changePanel(mfr, login, new LoginAfterPage(mf));
		    	}else {
		    		JOptionPane.showMessageDialog(null, "로그인 실패", "MINI1 PC", JOptionPane.WARNING_MESSAGE);
		    	}
			}			
		});
		
		JoinBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mfr, login, new SignUp(mf));
			}			
		});

		//TEST		
		//	id, 이름, pw, 생년월일, 성별, 핸드폰, 이메일
		list = a.fileOpen();	//	먼저 파일 오픈
//		테스트로 미리 생성
//		list.add(new PcMember("admin1", "관리자", "pass", 1, '성', "0101234", "1"));
//		list.add(new PcMember("admin2", "관리자", "pass", 1, '성', "0102345", "2"));
//		list.add(new PcMember("admin3", "관리자", "pass", 1, '성', "0103456", "3"));
//		list.add(new PcMember("admin4", "관리자", "pass", 1, '성', "0104567", "4"));
		a.fileSave(list);
		System.out.println("리스트 확인");
		System.out.println(list);
		
		SearchId_btn.addMouseListener(new MouseAdapter() {
		    public void mouseClicked(MouseEvent e) {
		    	int value = -1;
		    	for(int i = 0; i < list.size(); i++) {
		    		if(InputName.getText().equals(list.get(i).getUserName()) &&
		    		InputEmail.getText().equals(list.get(i).getUserEmail())) {
		    			value = i;
		    		}
		    	}
		    	if(value >= 0) {
		    		SearchResult.setText(list.get(value).getUserName() + "님의 아이디는 " + list.get(value).getUserId() + " 입니다.");
		    		SearchResult.setForeground(Color.BLUE);
		    	}else {
		    		SearchResult.setText("일치하는 정보가 없습니다.");
		    		SearchResult.setForeground(Color.RED);
		    	}
		    }
		});
		SearchPw_btn.addMouseListener(new MouseAdapter() {
		    public void mouseClicked(MouseEvent e) {
		    	int value = -1;
		    	for(int i = 0; i < list.size(); i++) {
		    		if(InputID.getText().equals(list.get(i).getUserId()) &&
		    		InputPhone.getText().equals(list.get(i).getUserPhone())) {
		    			value = i;
		    		}
		    	}
		    	System.out.println(value);
		    	if(value >= 0) {
		    		SearchResult.setText(list.get(value).getUserId() + "님의 비밀번호는 " + list.get(value).getUserPw() + " 입니다.");
		    		SearchResult.setForeground(Color.BLUE);
		    	}else {
		    		SearchResult.setText("일치하는 정보가 없습니다.");
		    		SearchResult.setForeground(Color.RED);
		    	}
		    }
		});
		
		SearchBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true);
			}			
		});
		findIdtxt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				findIdtxt.setText(textIdOn);
				findPwtxt.setText(textPwOff);
				findArea.remove(InputID);
				findArea.remove(InputPhone);
				findArea.remove(SearchPw_btn);
				findArea.add(InputName);
				findArea.add(InputEmail);
				findArea.add(SearchId_btn);
				SearchResult.setText("");
				findArea.revalidate();
				findArea.repaint();
			}			
		});
		findPwtxt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				findIdtxt.setText(textIdOff);
				findPwtxt.setText(textPwOn);
				findArea.remove(InputName);
				findArea.remove(InputEmail);
				findArea.remove(SearchId_btn);
				findArea.add(InputID);
				findArea.add(InputPhone);
				findArea.add(SearchPw_btn);
				SearchResult.setText("");
				findArea.revalidate();
				findArea.repaint();
			}			
		});
	}
	
}
