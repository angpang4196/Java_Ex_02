package com.biz.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.ex02.vo.GradeVO;

public class GradeExec04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<GradeVO> gradel = new ArrayList();

		for (int i = 0; i < 5; i++) {
			GradeVO gradeVO = new GradeVO();
			makeScore(gradeVO);           // GradeVO를 gradeVO로 생성해서 매개변수로 전달
			gradel.add(gradeVO);          // 전달했던 gradeVO를 gradel에 추가
			
			/*
			 *  변수를 method에 매개변수로 전달할 경우 method에서 변수를 변경해도 원본은 변하지않는다.
			 *  
			 *  배열이나 Class를 객체로 생성한 후 method에 매개변수로 전달할 경우 
			 *  return받지 않아도 변경된 값을 사용할 수 있다.
			 */
		}

		System.out.println("==============================================");
		System.out.println("학번\t국어\t영어\t수학\t총합\t평균");
		System.out.println("----------------------------------------------");

		for (GradeVO gradeVO : gradel) {
			viewScore(gradeVO);
		}

	}

	public static void makeScore(GradeVO gradeVO) {

		Scanner scan = new Scanner(System.in);

		System.out.print("학번>>");
		String strNum = scan.nextLine();
		gradeVO.setStrNum(strNum);

		System.out.print("국어점수>>");
		int intKor = Integer.valueOf(scan.nextLine());
		gradeVO.setIntKor(intKor);

		System.out.print("영어점수>>");
		int intEng = Integer.valueOf(scan.nextLine());
		gradeVO.setIntEng(intEng);

		System.out.print("수학점수>>");
		int intMath = Integer.valueOf(scan.nextLine());
		gradeVO.setIntMath(intMath);

		int intSum = intKor + intEng + intMath;         // intSum = gradeVO.getIntKor;
		float floatAvg = (float) intSum / 3;            // intSum += gradeVO.getIntEng;
		gradeVO.setIntSum(intSum);                      // intSum += gradeVO.getIntMath;
		gradeVO.setFloatAvg(floatAvg);

	}

	public static void viewScore(GradeVO gradeVO) {
		System.out.print(gradeVO.getStrNum() + "\t");
		System.out.print(gradeVO.getIntKor() + "\t");
		System.out.print(gradeVO.getIntEng() + "\t");
		System.out.print(gradeVO.getIntMath() + "\t");
		System.out.print(gradeVO.getIntSum() + "\t");
		System.out.print(gradeVO.getFloatAvg() + "\n");

	}

}
