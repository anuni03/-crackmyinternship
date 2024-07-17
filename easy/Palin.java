/*
Given a string s, return true if the s can be palindrome after deleting at most one character from it.

 

Example 1:

Input: s = "aba"
Output: true
Example 2:

Input: s = "abca"
Output: true
Explanation: You could delete the character 'c'.
Example 3:

Input: s = "abc"
Output: false
 

Constraints:

1 <= s.length <= 105
s consists of lowercase English letters.
 * 
 */

package easy;

import java.util.Scanner;

class VPalin {
    public boolean isPalin(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return isPalin(s, i + 1, j) || isPalin(s, i, j - 1);
            i++;
            j--;
        }
        return true;
    }
}

public class Palin {
    public static void main(String[] args) {
        VPalin vp = new VPalin();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (vp.validPalindrome(str)) {
            System.out.println("Valid Palindrome after removing one character");
        } else {
            System.out.println("Not Valid Palindrome");
        }
    }
}
