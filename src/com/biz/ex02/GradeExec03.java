package com.biz.ex02;

import java.util.ArrayList;
import java.util.List;

import com.biz.ex02.service.GradeService;
import com.biz.ex02.vo.GradeVO;

public class GradeExec03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<GradeService> gradeList = new ArrayList();

		for (int i = 0; i < 5; i++) {
			GradeService gs = new GradeService();
			gs.makeScore();

		}

	}

}
