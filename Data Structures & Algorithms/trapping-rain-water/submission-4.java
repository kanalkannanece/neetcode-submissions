class Solution {
    public int trap(int[] height) {
        
        int startPosition = 0;
        int lastPosition = height.length - 1;
        int maxLeftWallHeight = 0;
        int maxRightWallHeight = 0;
        int totalCapacity = 0;
        int currentCapacity = 0;

        while(startPosition < lastPosition){
currentCapacity = 0;
        

        if(height[startPosition] <= height[lastPosition]){
        if(maxLeftWallHeight > 0 && maxLeftWallHeight > height[startPosition]) {
        currentCapacity = Math.max(maxLeftWallHeight,height[startPosition]) - Math.min(maxLeftWallHeight,height[startPosition]);
        }
        totalCapacity = totalCapacity + currentCapacity;

                maxLeftWallHeight  = Math.max (maxLeftWallHeight,height[startPosition]);
 //       System.out.println("startPosition: " + startPosition + " Capcity :"+totalCapacity+ " CurrentCapacity: " + currentCapacity);
        startPosition++;
        continue;

        }

        if(height[startPosition] > height[lastPosition]){
if(maxRightWallHeight > 0 && maxRightWallHeight > height[lastPosition]) {
currentCapacity = Math.max(maxRightWallHeight,height[lastPosition]) - Math.min(maxRightWallHeight,height[lastPosition]);
}

totalCapacity = totalCapacity + currentCapacity;

                maxRightWallHeight  = Math.max (maxRightWallHeight,height[lastPosition]);

//System.out.println("lastPosition: " + lastPosition + " Capcity :"+totalCapacity + " CurrentCapacity: " + currentCapacity);
         lastPosition --;   
        }




        } 

return totalCapacity;

    }
}
