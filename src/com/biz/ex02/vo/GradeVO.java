package com.biz.ex02.vo;

public class GradeVO {

	private String strNum; // 학번
	private int intKor; // 국어점수
	private int intEng; // 영어점수
	private int intMath; // 수학점수
	private int intSum; // 총점
	private float floatAvg; // 평균

	public String getStrNum() {
		return strNum;
	}

	public void setStrNum(String strNum) {
		this.strNum = strNum;
	}

	public int getIntKor() {
		return intKor;
	}

	public void setIntKor(int intEng) {
		this.intKor = intEng;
	}

	public int getIntEng() {
		return intEng;
	}

	public void setIntEng(int intEng) {
		this.intEng = intEng;
	}

	public int getIntMath() {
		return intMath;
	}

	public void setIntMath(int intMath) {
		this.intMath = intMath;
	}

	public int getIntSum() {
		return intSum;
	}

	public void setIntSum(int intSum) {
		this.intSum = intSum;
	}

	public float getFloatAvg() {
		return floatAvg;
	}

	public void setFloatAvg(float floatAvg) {
		this.floatAvg = floatAvg;
	}

	@Override
	public String toString() {
		return "결과 [학번 = " + strNum + ", 국어점수 = " + intKor + ", 영어점수 = " + intEng + ", 수학점수 = " + intMath
				+ ", 총점 = " + intSum + ", 평균 = " + floatAvg + "]";
	}

}
