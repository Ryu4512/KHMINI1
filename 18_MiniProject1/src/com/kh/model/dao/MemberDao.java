package com.kh.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.kh.model.vo.PcMember;
import com.kh.model.vo.Requests;

// ȸ�� ���� ������ ���� ����� Ŭ����
public class MemberDao {
	// ȸ�� ���� ������ ������ ����
	private String fileName = "pcMember.dat";
	private String fileName2 = "Requests.dat";
	
	// PcMember ��ü ���� ����
	public ArrayList<PcMember> fileOpen() {
		ArrayList<PcMember> list = new ArrayList<>();
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
			list = (ArrayList<PcMember>) ois.readObject();
			
		} catch (IOException e) {
//			e.printStackTrace();
			System.out.println("pcMember.dat ������ �ε����� ���߽��ϴ�.");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
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
	
	// Requests ��ü ���� ����
				public ArrayList<Requests> fileOpen2() {
					ArrayList<Requests> list2 = new ArrayList<>();
					
					try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName2))) {
						list2 = (ArrayList<Requests>) ois.readObject();
						
					} catch (IOException e) {
//						e.printStackTrace();
						System.out.println("Requests.dat ������ �ε����� ���߽��ϴ�.");
					} catch (ClassNotFoundException e) {
//						e.printStackTrace();
						System.out.println("ArrayList<Requests>���� ĳ���� �� �� �����ϴ�.");
					}
					
					return list2;
				}
				
				// Requests ��ü ���� ����
				public void fileSave2(ArrayList<Requests> list2) {
					
					try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName2))) {
						oos.writeObject(list2);
						
					} catch (IOException e) {
//						e.printStackTrace();
						System.out.println("Requests.dat ���� ���忡 �����Ͽ����ϴ�.");
					}
					
				}

}
