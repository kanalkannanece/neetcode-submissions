class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int startIndex = 0;
        int lastIndex = numbers.length - 1;

        while (startIndex < lastIndex) {
            int currentSum = numbers[startIndex] + numbers[lastIndex];

            if (currentSum == target) {
                return new int[]{startIndex + 1, lastIndex + 1};
            } else if (currentSum < target) {
                startIndex++; 
            } else {
                lastIndex--;
            }
        }
        
        return null;
    }
}