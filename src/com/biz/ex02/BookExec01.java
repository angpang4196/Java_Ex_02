package com.biz.ex02;

public class BookExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BookService bs = new BookService();
		bs.makeBookInfo();
		
		for(int i = 0; i < 10; i++) {
			bs.viewBookInfo();
		}

	}

}
