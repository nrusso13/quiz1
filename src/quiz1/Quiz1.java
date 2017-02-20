package quiz1;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many touchdowns did the Quarterback have?");
		float TD = input.nextInt();
		System.out.println("How many completions did the QB have?");
		float COMP = input.nextInt();
		System.out.println("How many passing attempts did the QB have?");
		float ATT = input.nextInt();
		System.out.println("How many interceptions did the QB have?");
		float INT = input.nextInt();
		System.out.println("HOw many yards did the QB have? ");
		float YARDS = input.nextInt();
		
		float A = (float) (((COMP/ATT)-0.3)*5);
		float B = (float) (((YARDS/ATT)-3)*0.25);
		float C = (float) ((TD/ATT)*20);
		float D = (float) (2.375 - ((INT/ATT)*25));
		
		if (A<0) {A=0;}
		else if (A >2.375) {A = (float) 2.375;}
		else {A=A;}
		
		if (B<0) {B=0;}
		else if (B >2.375) {B = (float) 2.375;}
		else {B=B;}
		
		if (C<0) {C=0;}
		else if (C >= 2.375) {C = (float) 2.375;}
		else {C=C;}
		
		if (D<0) {D=0;}
		else if (D >=2.375) {D = (float) 2.375;}
		else {D=D;}
		
		float QBRATING = ((A+B+C+D)/6)*100;
		
		System.out.println("This QB's rating is " + String.format("%.1f", QBRATING));
		
		

	}

}
