class Solution {
    public boolean isPalindrome(String s) {
        int reverse = s.length() - 1;
        int totalsize = s.length();
        int maximumIteration = s.length() / 2;
        for (int i = 0; i < maximumIteration; i++) {
            if (Character.isWhitespace(s.charAt(i)) || !Character.isLetterOrDigit(s.charAt(i))) {
                totalsize--;
                maximumIteration = totalsize / 2;
                continue;
            }

            if (Character.isWhitespace(s.charAt(reverse))
                || !Character.isLetterOrDigit(s.charAt(reverse))) {
                reverse--;
                i--;
                totalsize--;
                maximumIteration = totalsize / 2;
                continue;
            }
            char forward = Character.toLowerCase(s.charAt(i));
            char backward = Character.toLowerCase(s.charAt(reverse));
            System.out.println(forward + " " + backward);
            if (forward != backward) {
                return false;
            }
            reverse--;
        }
        return true;
    }
}
