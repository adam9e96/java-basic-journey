package ch04_controlflow.sec04_if_elseif;

import java.util.Scanner;
import java.util.Random;

public class RockScissorPaper {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		random.setSeed(System.currentTimeMillis());
		
		int pc, user;
		pc = random.nextInt(3)+1;

		String pcC, userC;
		

		System.out.print("바위(1), 가위(2), 보(3): ");
		user = scanner.nextInt();
		
		if (pc==1) {
			pcC = "바위(1)";
		}
		else if(pc==2){
			pcC = "가위(2)";
		}
		else {
			pcC = "보(3)";
		}
		if (user==1) {
			userC = "바위(1)";
		}
		else if(user==2){
			userC = "가위(2)";
		}
		else {
			userC = "보(3)";
		}
		System.out.println("컴 :"+pcC+"\n나: "+userC);
		
		
		System.out.println((pc == user)?"비겼다" :((pc > user || ((pc==1)&&(user==3)) ) ? "승리":"패배"));
		
		
		
		/*
		if (pc ==user) {
			System.out.println("비겼다");
		}else if (pc < user || ((pc==1)&&(user==3)) ) {
			System.out.println("승리");
		}else {
			System.out.println("패배");
		}
		*/
		
		/*
		System.out.print("가위(1), 바위(2), 보(3): ");
		user = scanner.nextInt();
		
		if (pc==1) {
			pcC = "가위(1)";
		}
		else if(pc==2){
			pcC = "바위(2)";
		}
		else {
			pcC = "보(3)";
		}
		if (user==1) {
			userC = "가위(1)";
		}
		else if(user==2){
			userC = "바위(2)";
		}
		else {
			userC = "보(3)";
		}
		System.out.println("컴 :"+pcC+"\n나: "+userC);
	
		if (pc ==1) {
			if (user == 1) {
				System.out.println("비겼다");
			}
			else if(user == 2) {
				System.out.println("승리");
			}
			else {
				System.out.println("패배");
			}
		}
		else if(pc ==2) {
			if (user == 2) {
				System.out.println("비겼다");
			}
			else if(user == 3) {
				System.out.println("승리");
			}
			else {
				System.out.println("패배");
			}
		}
		else {
			if (user == 3) {
				System.out.println("비겼다");
			}
			else if(user == 1) {
				System.out.println("승리");
			}
			else {
				System.out.println("패배");
			}
		}
		*/
		scanner.close();
	}

}
