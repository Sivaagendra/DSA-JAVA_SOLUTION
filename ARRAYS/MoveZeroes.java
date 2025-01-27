class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
              if(nums[i]!=0){
               list.add(nums[i]);
            }
        }
        int i=0;
        for(int element:list)
        {
            nums[i]=element;
            i++;
        }
        for(int j=list.size();j<n;j++)
        {
            nums[j]=0;
        }

    }
}
