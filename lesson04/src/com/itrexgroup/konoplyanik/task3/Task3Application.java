package com.itrexgroup.konoplyanik.task3;

import java.util.Scanner;

import com.itrexgroup.konoplyanik.task3.model.Request;
import com.itrexgroup.konoplyanik.task3.service.Task3Service;

public class Task3Application {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		final Scanner scanner = new Scanner(System.in);
	    final String requestData = scanner.nextLine();
	    final Request notCompletedRequest = new Request(requestData);
	    System.out.println(Task3Service.commonRequestHandler.handle(notCompletedRequest).getData());
	    
	}

}
