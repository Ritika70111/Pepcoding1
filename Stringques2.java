 //Introduction of stringbuilder and syntax of stringbuilder 
	public static void stbuild() {
		StringBuilder sb = new StringBuilder("hello");
		System.out.println(sb.length());
		System.out.println(sb.charAt(2));
		sb.setCharAt(2, 'p');
		System.out.println(sb.charAt(2));
		sb.append('o');
		System.out.println(sb);
	}

	private static void swap(StringBuilder sb, int left, int right) {
		char l = sb.charAt(left);
		char r = sb.charAt(right);
		sb.setCharAt(left, r);
		sb.setCharAt(right, l);
	}
   //To reverse the string using stringbuilder
	//for example abcd ; toggled string dcba
	public static String togglestr(String str) {
		StringBuilder sb = new StringBuilder(str);
		int left = 0;
		int right = sb.length() - 1;
		while (left <= right) {
			swap(sb, left, right);
			left++;
			right--;
		}
		return sb.toString();//to convert it into string
	}
    //changing each bits of string i.e if each bit in upper case 
	//convert it into lower case and vice versa
	//for example Avf -> aVF
	public static void togglethebits(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				char uc = (char) ('A' + ch - 'a');
				System.out.print(uc);
			} else if (ch >= 'A' && ch <= 'Z') {
				char uc = (char) ('a' + ch - 'A');
				System.out.print(uc);
			}
		}
	}

	public static String togglethebits1(String str) {
		StringBuilder sb = new StringBuilder(str);
		for (int i = 0; i < sb.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				ch = (char) ('A' + ch - 'a');
			} else {
				ch = (char) ('a' + ch - 'A');
			}
			sb.setCharAt(i, ch);
		}
		return sb.toString();
	}
    // Question: if index is even (0,2,4...)->subtract 1 from ascii and denote it
	//  if index is odd (1,3,5...)->ADD 1 in ascii and denote it
	//for example : string -> bb ;ac 
	public static void Modify(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (i % 2 == 0) {
				// even
				ch = (char) (ch - 1);
				System.out.print(ch);
			} else {
				// odd
				ch = (char) (ch + 1);
				System.out.print(ch);
			}
		}
	}
   // same question using stringbuilder
	public static String Modify1(String str) {
		StringBuilder sb = new StringBuilder(str);
		for (int i = 0; i < sb.length(); i++) {
			char ch = sb.charAt(i);
			if (i % 2 == 0) {
				ch = (char) (ch - 1);
			} else {
				ch = (char) (ch + 1);
			}
			sb.setCharAt(i, ch);
		}
		return sb.toString();
	}
    //Question: pick consecutive bits and write difference in ascii inbetween
	//example: string adwpr-> a3d19w-7p2r
	public static String Modify2(String str) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length() - 1; i++) {
			char ch = str.charAt(i);
			char ch1 = str.charAt(i + 1);
			int diff = ch1 - ch;
			sb.append(ch);
			sb.append(diff);
		}
		sb.append(str.charAt(str.length() - 1));
		return sb.toString();
	}
