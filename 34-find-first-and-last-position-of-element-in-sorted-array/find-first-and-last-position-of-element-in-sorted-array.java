class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length==0){
            return new int[]{-1,-1};
        }
        int start=0;
        int end=nums.length-1;
        while(start<end  || start ==end){
            int mid=start + (end-start)/2;
            if(nums[mid] <target){
                start=mid+1;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else{
                int stp=mid;
                int endp=mid;
                int i=0;
                int j=mid+1;
                while(i <=mid){
                    if(nums[i]==target){
                        stp=i;
                        break;
                    }
                    i=i+1;
                }
                while(j <=end){
                    if(nums[j]==target){
                        endp=j;
                    }
                    j=j+1;
                }
            return new int[]{stp,endp};
                
                
            }
        }
        
     return new int[]{-1,-1};   
    }
}