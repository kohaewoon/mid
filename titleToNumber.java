package day3;

public class titleToNumber {
	public int titleToNumber(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            result = result * 26 + 1 + s.charAt(i) - 'A';
        }
        return result;
    }
}