public class Palindrome {
    public static boolean palindrome (String s) {
        int start = 0;
        int end = s.length() - 1;
        return palindromeRecurse(s, start + 1, end - 1);

    }
    public static boolean palindromeRecurse (String s, int start, int end) {
        if (start > s.length() / 2) return true;
        if (s.charAt(start) != s.charAt(end)) return false;
        return palindromeRecurse(s, start + 1, end - 1);

    }
}

