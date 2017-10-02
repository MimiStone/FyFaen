public class FidessaOA1_1 {
	public static char findFirstRepeatChar(String s) {
		int freq[] = new int[128];
		for (int i = 0; i < s.length(); i++) {
			freq[s.charAt(i)]++;
		}
		for (int i = 0; i < s.length(); i++) {
			if(freq[s.charAt(i)] > 0) {
				return s.charAt(i);
			}
		}
		return ' ';
	}
	
	public static void main(String[] args) {
		String s = "ABbbbbbbbbbbbbBA";
		System.out.println(findFirstRepeatChar(s));
	}
}
