import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String input = scanner.nextLine();

        boolean isPalindrome = isPalindrome(input);

        if (isPalindrome) {
            System.out.println( input + " is a palindrome.");
        } else {
            System.out.println( input + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        // Remove spaces and convert to lowercase
        str = str.replaceAll("\\s+", "").toLowerCase();

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
}
