package com.kh.chap02_socket.part01_tcp.sample;

import java.io.IOException;
import java.net.Socket;

public class TCPClient {

	public void clientStart() {
		int port = 8888;
		String serverIP = "";
		
		try {
			//	���������� ���� ��û�� ����
			//	*** ������ IP�� port ��ȣ *** �� �Ű������� �����ϸ� ���� ��ü ����
			Socket socket = new Socket(serverIP, port);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
