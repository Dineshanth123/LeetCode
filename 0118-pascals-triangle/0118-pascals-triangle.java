class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> li=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> lii=new ArrayList<>();
            lii.add(1);
            for(int j=1;j<i;j++){
                lii.add(li.get(i-1).get(j-1)+li.get(i-1).get(j));
            }
            if(i>0){
                lii.add(1);
            }
            li.add(lii);
        }
        return li;
        
        
        
    }
}