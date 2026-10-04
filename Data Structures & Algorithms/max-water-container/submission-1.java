class Solution {
    public int maxArea(int[] heights) {
        
    int startPosition = 0;
    int capacity = 0;
    int lastPosition = heights.length-1;

    while(startPosition < lastPosition){
    
    int minHeight = Math.min(heights[startPosition],heights[lastPosition]);
    int width = lastPosition - startPosition;
    //System.out.println(startPosition + " "+ lastPosition  );
    capacity =  Math.max(minHeight*width,capacity);

    //System.out.println(minHeight + " "+ width + " " + capacity );

    if(heights[startPosition] <= heights[lastPosition]){
        startPosition++;
        continue;
    }else if(heights[startPosition] > heights[lastPosition]){
        lastPosition--;
    }


    }
    return capacity;
    }
}
