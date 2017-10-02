
public class FidessaOA1_2 {
	public static void triangle(int a, int b, int c) {
		if (a <= 0 || b <= 0 || c <= 0) {
			System.out.println("None of them");
			return;
		}
		if (a + b <= c || b + c <= a || c + a <= b) {
			System.out.println("None of them");
			return;
		}
		if (a == b && b == c) {
			System.out.println("dengbian");
		} else if (a == b || b == c || c == a) {
			System.out.println("dengyao");
		} else {
			System.out.println("None");
		}
		return;
	}
	
	public static void main(String[] args) {
		triangle(1,1,1);
		triangle(6,6,7);
		triangle(3,4,5);
		triangle(1,2,3);
		triangle(0,2,3);
	}
}
