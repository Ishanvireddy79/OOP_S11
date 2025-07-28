package practical1;

public class String_comparisions {
	public static void main(String[]args) {
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello");
		String str4 = "hello";
		System.out.println("str1 == str2:"+(str1 == str2));
		System.out.println("str1 == str3:"+(str1 = str3));
		System.out.println("str1.equals(str3):"+str1.equals(str3));
		System.out.println("str1.equalsIgnoreCase(str4):"+str1.compareTo(str4));
		System.out.println("str1.comapreTo(str4):"+str1.compareTo(str4));
		System.out.println("str1.compareTo(str2):"+str1.compareTo(str2));
	}
}
