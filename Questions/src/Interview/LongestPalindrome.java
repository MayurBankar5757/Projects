package Interview;
public class LongestPalindrome {
	
    public static void main(String[] args) {
    	
    	// Asked google ,amazon
        String input = "babad";
        String longestPalindrome = longestPalindrome(input);
        System.out.println("Longest palindrome: " + longestPalindrome); // Output: "bab" or "aba"
    }

    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }

        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            // For odd length palindromes (centered at i)
            int len1 = expandAroundCenter(s, i, i);
            // For even length palindromes (centered between i and i+1)
            int len2 = expandAroundCenter(s, i, i + 1);
            // Find the maximum length palindrome centered at current position
            int maxLength = Math.max(len1, len2);
            // Update start and end pointers if we found a longer palindrome
            if (maxLength > end - start) {
                start = i - (maxLength - 1) / 2;
                end = i + maxLength / 2;
            }
        }

        // Extract the longest palindrome substring
        return s.substring(start, end + 1);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // Return the length of the palindrome found
        return right - left - 1;
    }
}
