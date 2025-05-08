class Solution {
    public int reverse(int x) {
        int min=Integer.MIN_VALUE;
        int max=Integer.MAX_VALUE;
        long res=0;
        while(x!=0){
            res=res*10+(x%10);
            x=x/10;
            if(res>max||res<min){
                return 0;
            }
        }
        return (int)res;
        
    }
}