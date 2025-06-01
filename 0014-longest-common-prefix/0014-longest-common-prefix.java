class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res="";
        int len=strs.length;
        int len1=Integer.MAX_VALUE;
        for(String h:strs){
            len1=Math.min(len1,h.length());
        }
        for(int i=0;i<len1;i++){
            int j=1;
            int count=0;
            while(j!=len){
                if(strs[j].charAt(i)==strs[0].charAt(i)){
                    count++;
                    j++;
                }else{
                    break;
                }

            }
            
        if(count==(len-1)){
            res=res+strs[0].charAt(i);

        }else{
            break;
        }

        }
        return res;
        

        
    }
}