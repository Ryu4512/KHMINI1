package com.kh.controller;

import java.util.ArrayList;

import com.kh.model.dao.MemberDao;
import com.kh.model.vo.PcMember;

// �����Ϳ� GUI ��� �����ϴ� Ŭ����
public class MemberController {
	
	private ArrayList<PcMember> list = new ArrayList<>();
	private MemberDao md = new MemberDao();
	
	// ȸ�� ���� �߰� ���
	public void addList(PcMember pm) {
		list.add(pm);
	}

}
