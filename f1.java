public class f1 {
public static void main(String[] args) {
    //write a code to check if a string is a palindrome
    String str = "racecar";
    str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    int left = 0;
    int right = str.length() - 1;
    boolean isPalindrome = true;
    while (left < right) {
        if (str.charAt(left) != str.charAt(right)) {
            isPalindrome = false;
            break;
        }
        left++;
        right--;
    }
    if (isPalindrome) {
        System.out.println("The string is a palindrome.");
    } else {
        System.out.println("The string is not a palindrome.");
    }

}
    
}