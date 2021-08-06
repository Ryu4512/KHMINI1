package com.kh.test.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.kh.test.model.vo.PcMember;


// ȸ�� ���� ������ ���� ����� Ŭ����
public class MemberDao {
	// ȸ�� ���� ������ ������ ����
	private String fileName = "pcMember.dat";
	
	// PcMember ��ü ���� ����
	public ArrayList<PcMember> fileOpen() {
		ArrayList<PcMember> list = new ArrayList<>();
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
			list = (ArrayList<PcMember>) ois.readObject();
			
		} catch (IOException e) {
//			e.printStackTrace();
			System.out.println("pcMember.dat ������ �ε����� ���߽��ϴ�.");
		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
			System.out.println("ArrayList<PcMember>���� ĳ���� �� �� �����ϴ�.");
		}
		
		return list;
	}
	
	// PcMember ��ü ���� ����
	public void fileSave(ArrayList<PcMember> list) {
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
			oos.writeObject(list);
			
		} catch (IOException e) {
//			e.printStackTrace();
			System.out.println("pcMember.dat ���� ���忡 �����Ͽ����ϴ�.");
		}
		
	}

}
