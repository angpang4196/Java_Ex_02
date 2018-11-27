package com.biz.ex02.service;

import java.util.Scanner;

import com.biz.ex02.vo.GradeVO;

public class GradeService {

	public GradeVO gradeVO;

	private Scanner scanner;

	public GradeService() {
		gradeVO = new GradeVO();
		scanner = new Scanner(System.in);
	}
	
	public void makeScore() {
		System.out.print("학번>>");
		gradeVO.setStrNum(scanner.nextLine());

		System.out.print("국어점수>>");
		int intKor = Integer.valueOf(scanner.nextLine());
		gradeVO.setIntKor(intKor);

		System.out.print("영어점수>>");
		int intEng = Integer.valueOf(scanner.nextLine());
		gradeVO.setIntEng(intEng);

		System.out.print("수학점수>>");
		int intMath = Integer.valueOf(scanner.nextLine());
		gradeVO.setIntMath(intMath);

		int intSum = intKor + intEng + intMath; // intSum = gradeVO.getIntKor;
		float floatAvg = (float) intSum / 3; // intSum += gradeVO.getIntEng;
		gradeVO.setIntSum(intSum); // intSum += gradeVO.getIntMath;
		gradeVO.setFloatAvg(floatAvg);
	}

}
