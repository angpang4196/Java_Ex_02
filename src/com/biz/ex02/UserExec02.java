package com.biz.ex02;

import java.util.Scanner;

import com.biz.ex02.vo.UserVO;

public class UserExec02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// main에서 키보드로부터 한 학생에 대한 학번, 학생이름, 학년, 주소, 전화번호를 입력받아 UserVO에 저장
		// 저장된 정보를 console에 표시
		UserVO userVO = new UserVO();
		Scanner scan = new Scanner(System.in);

		System.out.print("학번>>");
		userVO.setStrIndex(scan.nextLine());

		System.out.print("학생이름>>");
		userVO.setStrName(scan.nextLine());

		System.out.println("학년>>");
		userVO.setStrGrade(scan.nextLine());

		System.out.print("주소>>");
		userVO.setStrAddr(scan.nextLine());

		System.out.print("전화번호");
		userVO.setStrCall(scan.nextLine());

		System.out.println(userVO);

	}

}
