import java.util.Scanner;

public class PascalTriangle {
	
	private static void printReverse(long triangle[][], int num) {
		//Print Reverse
		for (int i = num - 1; i >= 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.printf("%d ", triangle[i][j]);
			}
			System.out.printf("%d\n", triangle[i][i]);
		}		
	}
	
	public static void main(String[] args) {
		//Read rows from input
		Scanner sc = new Scanner(System.in);  
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		sc.close();
		
		//Init Triangle
		long triangle[][] = new long[num][num];
		triangle[0][0] = 1;
		
		//Construct triangle
		for (int i = 1; i < num; i++) {
			triangle[i][0] = 1;
			for(int j = 1; j <= i; j++) {
				triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
			}
		}
		
		//Print
		for (int i = 0; i < num; i++) {
			for(int j = 0; j < i; j++) {
				System.out.printf("%d ", triangle[i][j]);
			}
			System.out.printf("%d\n", triangle[i][i]);
		}
	}

}
