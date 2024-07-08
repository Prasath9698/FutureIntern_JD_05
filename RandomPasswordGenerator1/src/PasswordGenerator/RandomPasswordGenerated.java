package PasswordGenerator;


	import java.util.Scanner;
	import java.util.Random;
	public class RandomPasswordGenerated {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();

	        System.out.print("Enter desired password length: ");
	        int length = scanner.nextInt();

	        System.out.println("Select character types to include:");
	        System.out.println("1. Uppercase letters");
	        System.out.println("2. Lowercase letters");
	        System.out.println("3. Numbers");
	        System.out.println("4. Special characters");

	        boolean includeUppercase = scanner.nextBoolean();
	        boolean includeLowercase = scanner.nextBoolean();
	        boolean includeNumbers = scanner.nextBoolean();
	        boolean includeSpecialChars = scanner.nextBoolean();

	        String password = generatePassword(length, includeUppercase, includeLowercase, includeNumbers, includeSpecialChars, random);

	        System.out.println("Generated password: " + password);
	    }

	    public static String generatePassword(int length, boolean includeUppercase, boolean includeLowercase, boolean includeNumbers, boolean includeSpecialChars, Random random) {
	        String charset = "";

	        if (includeUppercase) {
	            charset += "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	        }

	        if (includeLowercase) {
	            charset += "abcdefghijklmnopqrstuvwxyz";
	        }

	        if (includeNumbers) {
	            charset += "0123456789";
	        }

	        if (includeSpecialChars) {
	            charset += "!@#$%^&*()_+-={}|[]:;<>?,./~";
	        }

	        StringBuilder password = new StringBuilder();

	        for (int i = 0; i < length; i++) {
	            password.append(charset.charAt(random.nextInt(charset.length())));
	        }

	        return password.toString();
	    
	}

}



	


