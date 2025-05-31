class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> results=new ArrayList<>();
        backtrack(results,nums,0,new ArrayList<>());
        return results;
    }

    private void backtrack(List<List<Integer>> results,int[] nums,int index,List<Integer> current){
        results.add(new ArrayList<>(current));
        for(int i=index;i<nums.length;i++){
            current.add(nums[i]);
            backtrack(results,nums,i+1,current);
            current.remove(current.size()-1);
        }
        
    }
}