package test.com.kh.test.common;

import javax.swing.JPanel;

import test.com.kh.test.view.MainFrame;

public class ChangePanel {
	
	public static void changePanel(MainFrame mfr, JPanel op, JPanel np) {
		// �����̳�(������)�� ���� �г�(old panel), �� �г�(new panel)�� �ּ� �Ű������� ���� ����
		
		mfr.remove(op);		// old panel �����
		mfr.add(np);			// new panel �ø���
		mfr.revalidate();	// ���̾ƿ� �����ڿ��� �� ������ҷ� �缳�� �ϵ��� ��û (���Ӱ� �ö� ������Ʈ�� ���̰� �ϱ� ����)
		mfr.repaint();		// ������� �ٽ� �׸����� ��
	}

}
