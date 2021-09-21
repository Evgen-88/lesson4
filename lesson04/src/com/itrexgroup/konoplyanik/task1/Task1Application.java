package com.itrexgroup.konoplyanik.task1;

import com.itrexgroup.konoplyanik.task1.service.Task1Service;

public class Task1Application {

	public static void main(String[] args) {
		
		System.out.println(Task1Service.isDifferent(1, 1, 1));
		
		System.out.println(Task1Service.isDifferent(2, 3, 4));
		
	}

}
