class Solution {
    public int removeDuplicates(int[] nums) {
     int i=0;
     int j=1;
     int c=0;
   while(j<nums.length){
      if(nums[j]==nums[i]){
         c+=1;
        }
        else{
            nums[i+1]=nums[j];
            i=i+1;
        }
    j=j+1;
   }
   return (nums.length - c);
   
    }
}