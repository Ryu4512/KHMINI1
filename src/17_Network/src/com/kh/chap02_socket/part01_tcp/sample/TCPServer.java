package com.kh.chap02_socket.part01_tcp.sample;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public void serverStart() {
		//	������ ���� ���� ������ �ʿ�
		
		//	Ư�� ���α׷��� ������ �� �ִ� ��Ʈ ��ȣ
		int port = 8888;
		
		try {
			ServerSocket server = new ServerSocket(port);
			while(true) {
				//	Ŭ���̾�Ʈ�� ��û accept(����) ��
				//	�ش� Ŭ���̾�Ʈ�� ����� ���� ����
				Socket client = server.accept();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
