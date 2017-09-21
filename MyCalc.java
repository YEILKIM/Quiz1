package quiz;

import java.util.Scanner;



public class MyCalc {

	public static void main(String[] args) {
		int m;
		
		Scanner scanner= new Scanner(System.in);

		System.out.println("Select one of the option numbers from above:");
		m = scanner.nextInt();
		switch(m){
		case 1:
			getNumbers(fnum, snum);
			convertNumbers(fnum,snum);
			addNumbers(num1,num2);
			break;
		case 2:
				getNumbers(fnum, snum);
				convertNumbers(fnum,snum);
				subNumbers(num1,num2);
				break;
		case 3:
				getNumbers(fnum, snum);
				convertNumbers(fnum,snum);
				multNumbers(num1,num2);
				break;
		case 4:
				getNumbers(fnum, snum);
				convertNumbers(fnum,snum);
				divNumbers(num1,num2);
				break;
		case 5:
				break;
		}
	}
	
	static void showMenu(){
		System.out.println("Calculator Options Menu\n1. Add two integers\n2. Substract an integer from an integer\n3. Multilply two integers\n 4. Divide an integer into an intger\n5. Exit");	
	}
	
	
	static void getNumbers(String fnum,String snum){
		 fnum = getFirstNumber();
		 snum = getSecondNumber();
	
		static String getFirstNumber(){
			String fnum;
			Scanner scanner= new Scanner(System.in);
			System.out.println("Input first number:");
			fnum = scanner.nextLine();
		}
		static String getSecondNumber(){
			String snum;
			Scanner scanner = new Scanner(System.in);
		System.out.println("Input second number:");
		snum = scanner.nextLine();
		}
			}
	static void convertNumbers(String fnum, String snum){
			double num1 = Double.parseDouble(fnum);
			double num2 = Double.parseDouble(snum);
		}
		static void addNumbers(double num1, double num2){
			double rel= num1 + num2;
			System.out.println(num1+"+"+num2+"="+rel);
	}
		static void subNumbers(double num1, double num2){
			double rel = num1-num2;
		System.out.println(num1+"-"+num2+"="+rel);
	}
		static void multNumbers(double num1, double num2){
			double rel = num1 * num2;
			System.out.println(num1+"*"+num2+"="+rel);
		}
		static void divNumbers(double num1, double num2){
			double rel = num1/num2;
			System.out.println(num1+"/"+num2+"="+rel);
		}
		
}
