package dsa;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int left = 0,right = height.length-1;
        int maxWater = Integer.MIN_VALUE;
        while(left<right){
            //            maxArea = Math.max(maxArea, (right - left) * Math.min(height[left], height[right]));
            int min = Math.min(height[left],height[right]);
            int width = right - left;
            int area = min * width;
            if(area>maxWater){maxWater = area;}
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        System.out.println(maxWater );
    }
}
