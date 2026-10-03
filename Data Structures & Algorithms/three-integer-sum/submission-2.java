class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        //if(null == nums || nums.length < 3)
        //return null;

        int startPosition = 0;
    
        List<List<Integer>> response = new ArrayList<>(); 
        Arrays.sort(nums);
        while (startPosition < nums.length-2){
             int leftPointer = startPosition + 1;
             int rightPointer = nums.length-1 ;
            if(startPosition > 0 && nums[startPosition] == nums[startPosition-1]){
                startPosition++;
                continue;
            }


            while(leftPointer < rightPointer){

                int sum = nums[startPosition] + nums[leftPointer] + nums[rightPointer]; 

                if( sum == 0 ){
                     List<Integer> answer= new ArrayList<>(); 
            answer.add(nums[startPosition]);
            answer.add(nums[leftPointer]);
            answer.add(nums[rightPointer]);

            response.add(answer);

            while (leftPointer < rightPointer && nums[leftPointer] == nums[leftPointer+1]){
                leftPointer++;
            }

            while (leftPointer < rightPointer && nums[rightPointer] == nums[rightPointer-1]){
                rightPointer--;
            }

            leftPointer++;
            rightPointer--;



                } else if (sum < 0){
                    leftPointer++;
                }else{
                    rightPointer--;
                }

            }
startPosition++;
        }

        return response;

    }
}
