package com.biz.ex02.vo;

public class UserVO {

	// member 변수를 private로 선언
	// 외부에서 직접 member 변수에 접근하지 못하도록 하는 것
	private String strIndex; // 학번
	private String strName; // 이름
	private String strGrade; // 학년
	private String strAddr; // 주소
	private String strCall; // 전화번호

	// private로 선언된 member변수에 접근할 수 있는 통로
	// getter and setter
	public String getStrIndex() {
		return strIndex;
	}

	public void setStrIndex(String strIndex) {
		this.strIndex = strIndex;
	}

	public String getStrName() {
		return strName;
	}

	public void setStrName(String strName) {
		this.strName = strName;
	}

	public String getStrGrade() {
		return strGrade;
	}

	public void setStrGrade(String strGrade) {
		this.strGrade = strGrade;
	}

	public String getStrAddr() {
		return strAddr;
	}

	public void setStrAddr(String strAddr) {
		this.strAddr = strAddr;
	}

	public String getStrCall() {
		return strCall;
	}

	public void setStrCall(String strCall) {
		this.strCall = strCall;
	}

	// 재정의, 다시 만들겠다.
	@Override
	public String toString() {
		return "UserVO [학번 : " + strIndex + ", 이름 : " + strName + ", 학년 : " + strGrade + ", 주소 : "
				+ strAddr + ", 전화번호 : " + strCall + "]";

	}

}
