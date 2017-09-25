import java.util.Scanner;
class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int x1 = number / 5000;
		number = number - 5000*x1;
		int x2 = number / 1000;
		number = number - 1000*x2;
		int x3 = number / 500;
		number = number - 500*x3;
		int x4 = number / 100;
		number = number - 100*x4;
		int x5 = number / 50;
		number = number - 50*x5;
		int x6 = number / 10;
		number = number - 10*x6;
		int x7 = number / 5;
		number = number - 5*x7;
		int x8 = number / 2;
		number = number - 2*x8;
		int x9 = number / 1;
				
		System.out.println("Банкомат может выдать вам купюры следующего номинала:");
		System.out.println("5000р. - " + x1 + " шт.");
		System.out.println("1000р. - " + x2 + " шт.");
		System.out.println("500р. - " + x3 + " шт.");
		System.out.println("100р. - " + x4 + " шт.");
		System.out.println("50р. - " + x5 + " шт.");
		System.out.println("10р. - " + x6 + " шт.");
		System.out.println("5р. - " + x7 + " шт.");
		System.out.println("2р. - " + x8 + " шт.");
		System.out.println("1р. - " + x9 + " шт.");
	}
}