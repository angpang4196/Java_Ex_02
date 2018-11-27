package com.biz.ex02;

import com.biz.ex02.vo.UserVO;

public class UserExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserVO userVO = new UserVO();
		userVO.setStrIndex("001");
		userVO.setStrName("윤성우");
		userVO.setStrGrade("3");
		userVO.setStrAddr("대한민국");
		userVO.setStrCall("001-001-001");
		String toString = userVO.toString();
		System.out.println(toString);

	}

}
