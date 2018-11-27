package com.biz.ex02;

import java.util.Scanner;

import com.biz.ex02.vo.GradeVO;

public class GradeExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GradeVO gradeVO = new GradeVO();
		Scanner scan = new Scanner(System.in);

		System.out.print("학번>>");                    // 예를 들어 1번이 아닌 01번을 출력하고싶다면 String형으로 !
		gradeVO.setStrNum(scan.nextLine());

		// 국어, 영어, 수학 성적은 변수가 int형인데 scan.nextLine() 읽어들인 값은 String 형이다.
		// String 형을 int 형으로 변환시켜야한다.

		System.out.print("국어점수>>");
		int intKor = Integer.valueOf(scan.nextLine());
		gradeVO.setIntKor(intKor);

		System.out.print("영어점수>>");
		int intEng = Integer.valueOf(scan.nextLine());
		gradeVO.setIntEng(intEng);

		System.out.print("수학점수>>");
		int intMath = Integer.valueOf(scan.nextLine());
		gradeVO.setIntMath(intMath);

		int intSum = intKor + intEng + intMath;
		float floatAvg = (float) intSum / 3;
		gradeVO.setIntSum(intSum);
		gradeVO.setFloatAvg(floatAvg);

		System.out.println(gradeVO);

	}

}