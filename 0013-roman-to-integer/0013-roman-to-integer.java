class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        int sum=0;
        int st=0;
        int len=s.length();
        char[] arr=s.toCharArray();
        int i=0;
        while(i<len-1){
            if(hm.get(arr[i])>=hm.get(arr[i+1])){
                    sum=sum+hm.get(arr[i]);
                    i++;
                }
                else{
                    st=st+hm.get(arr[i+1])-hm.get(arr[i]);
                    i=i+2;
                }
        }
        if(i==len-1){
            sum=sum+hm.get(arr[i]);
        }
        return sum+st;
        

        
    }
}