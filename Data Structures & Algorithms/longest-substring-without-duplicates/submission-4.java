class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int length = s.length();
        int left = 0;
        int maxSize = 0;
        Set<Character> window = new HashSet<>();

        for(int right=0; right <length; right++){

            while(window.contains(s.charAt(right))){
                window.remove(s.charAt(left));
                left++;
            }

            window.add(s.charAt(right));

            maxSize = Math.max(maxSize,(right - left + 1));

        }

        return maxSize;

    }
}
