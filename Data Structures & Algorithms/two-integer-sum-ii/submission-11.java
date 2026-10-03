class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // Notice: No hardcoded bounds checking here!
        int startIndex = 0;
        int lastIndex = numbers.length - 1;

        while (startIndex < lastIndex) {
            int currentSum = numbers[startIndex] + numbers[lastIndex];

            if (currentSum == target) {
                // Returns 1-indexed output mapping directly
                return new int[]{startIndex + 1, lastIndex + 1};
            } else if (currentSum < target) {
                startIndex++; // Sum too small -> slide left pointer up
            } else {
                lastIndex--;  // Sum too big -> slide right pointer down
            }
        }
        
        return null;
    }
}