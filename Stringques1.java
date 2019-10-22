//To print all characters of string 
public static void printchars(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			System.out.println(ch);
		}
		System.out.println();
	}
    //To print all substrings of string
	//for example string =abc
	//so substrings are a,ab,abc,b,bc,c
	//string of n length have n(n+1)/2
	public static void substring(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				String s = str.substring(i, j);
				System.out.println(s);
			}

		}
	}
   //Check whether a string is palindrome or not 
   //for example malayalam
	public static void ispalindrome(String str) {
		int left = 0;
		int right = str.length() - 1;
		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {
				System.out.println("not palindrome");
				return;
			}
			left++;
			right--;
		}
		System.out.println("palindrome");
	}

	public static boolean ispalindrome1(String str) {
		int left = 0;
		int right = str.length() - 1;
		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
    //To print all palindromic substring from a given string
	public static void allpalsubstring(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				String s = str.substring(i, j);
				boolean curr = ispalindrome1(s);
				if (curr == true) {
					System.out.println(s);
				}
			}
		}
	}
