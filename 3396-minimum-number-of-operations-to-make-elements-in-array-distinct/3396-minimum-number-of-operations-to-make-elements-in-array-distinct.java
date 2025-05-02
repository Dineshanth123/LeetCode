class Solution {
    public int minimumOperations(int[] nums) {
        int count=0;
        ArrayList<Integer> li=new ArrayList<>();
        for(int num:nums){
            li.add(num);
        }
        while(true){
            Set<Integer> se=new HashSet<>(li);
            if(li.size()==se.size()){
                break;
            }
            for(int i=0;i<3&&!li.isEmpty();i++){
                li.remove(0);
            }
            count++;
           
        }
        return count;
        
    }
}