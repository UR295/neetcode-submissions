class Solution {
    public void subset(int[] nums,int idx,List<Integer> curr,List<List<Integer>> arr){
        if(idx == nums.length){
            arr.add(new ArrayList<>(curr));
            return;
        }
        subset(nums,idx+1,curr,arr);
        curr.add(nums[idx]);
        subset(nums,idx+1,curr,arr);
        curr.remove(curr.size()-1);
    }
    public List<List<Integer>> subsets(int[] nums) {
       List<List<Integer>> arr = new ArrayList<>();
       subset(nums,0,new ArrayList<>(),arr);
       return arr;
    }
}
