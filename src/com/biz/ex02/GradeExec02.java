package com.biz.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.ex02.vo.GradeVO;

public class GradeExec02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<GradeVO> gradel = new ArrayList();

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			GradeVO gradeVO = new GradeVO();

			System.out.print("학번>>");
			gradeVO.setStrNum(scan.nextLine());

			System.out.print("국어점수>>");
			int intKor = Integer.valueOf(scan.nextLine());
			gradeVO.setIntKor(intKor);

			System.out.print("영어점수>>");
			int intEng = Integer.valueOf(scan.nextLine());
			gradeVO.setIntEng(intEng);

			System.out.print("수학점수>>");
			int intMath = Integer.valueOf(scan.nextLine());
			gradeVO.setIntMath(intMath);

			int intSum = intKor + intEng + intMath; // intSum = gradeVO.getIntKor;
			float floatAvg = (float) intSum / 3; // intSum += gradeVO.getIntEng;
			gradeVO.setIntSum(intSum); // intSum += gradeVO.getIntMath;
			gradeVO.setFloatAvg(floatAvg);

			gradel.add(gradeVO);

		}

		System.out.println("==============================================");
		System.out.println("학번\t국어\t영어\t수학\t총합\t평균");
		System.out.println("----------------------------------------------");

		for (int i = 0; i < gradel.size(); i++) {

			System.out.print(gradel.get(i).getStrNum() + "\t");
			System.out.print(gradel.get(i).getIntKor() + "\t");
			System.out.print(gradel.get(i).getIntEng() + "\t");
			System.out.print(gradel.get(i).getIntMath() + "\t");
			System.out.print(gradel.get(i).getIntSum() + "\t");
			System.out.print(gradel.get(i).getFloatAvg() + "\n");

		}

	}

}
