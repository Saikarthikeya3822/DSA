class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int max_area=0;
        while(l<=r){
            int area=(Math.min(height[r],height[l]))*(r-l);
            if(area>max_area){
                max_area=area;
            }
            if(height[l]<=height[r]){
                l=l+1;
            }
            else{
                r=r-1;
            }
        }
        return max_area;
        
    }
}