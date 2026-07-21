class Solution {
    public void permutation(int[] nums,int idx,List<List<Integer>> arr){
        if(idx == nums.length){
           List<Integer> temp = new ArrayList<>();
           for(int x:nums) temp.add(x);
           arr.add(temp);
           return;
        }
       for(int i = idx;i<nums.length;i++){
        swap(nums,idx,i);
        permutation(nums,idx+1,arr);
        swap(nums,idx,i);
       }
    }
    public void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> arr = new ArrayList<>();
        permutation(nums,0,arr);
        return arr;
    }
}
