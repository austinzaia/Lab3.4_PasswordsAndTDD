import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PasswordsAndTDD {
	public static Scanner sc = new Scanner(System.in);
	public static ArrayList<String> passwordList = new ArrayList<String>(
			Arrays.asList("admin", "BUGGY55", "RAYLEIGH77", "SCOpper88", "CROCUS99", "R0gER3"));

	public static void main(String[] args) {
		String word = sc.nextLine();
		passwordValidate(word);
		for (String string : passwordList) {
			System.out.println(string);
		}
	}

	public static boolean inList(String word) {
		if (passwordList.contains(word)) {
			return false;
		} else {
			return true;
		}
	}

	public static boolean passwordLength(String word) {
		if (word.length() < 7 || word.length() > 12) {
			return false;
		} else {
			return true;
		}
	}

	public static boolean passwordNumber(String word) {
		char ch;
		boolean isNum = false;
		for (int i = 0; i < word.length(); i++) {
			ch = word.charAt(i);
			if (Character.isDigit(ch) && ch != '6') {
				isNum = true;
			}
		}
		return isNum;
	}

	public static boolean passwordSpace(String word) {
		if (word.contains(" ")) {
			return false;
		} else
			return true;
	}

	public static boolean passwordVowel(char c) {
		char[] vowels = { 'A', 'E', 'I', 'O', 'U', 'Y' };
		String a = String.valueOf(c);
		String b = new String(vowels);
		if (b.contains(a)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean passwordCapitalVowel(String word) {
		boolean vowels = false;
		int num = 0;
		for (char c : word.toCharArray()) {
			if (passwordVowel(c)) {
				num++;
			}
			if (num >= 2) {
				vowels = true;
			}
		}
		return vowels;
	}

	public static boolean passwordValidate(String word) {
		if ((passwordLength(word) && passwordNumber(word) && passwordSpace(word) && passwordCapitalVowel(word)
				&& inList(word)) == true || (word.equalsIgnoreCase("mod") && inList(word) == true)
				|| (word.equalsIgnoreCase("admin") && inList(word) == true)) {
			passwordList.add(word);
			return true;
		} else {
			return false;
		}
	}
}
