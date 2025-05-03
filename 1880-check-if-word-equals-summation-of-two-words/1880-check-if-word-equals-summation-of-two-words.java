class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        StringBuilder count1=new StringBuilder();
        StringBuilder count2=new StringBuilder();
        StringBuilder count3=new StringBuilder();
        for(char c:firstWord.toCharArray()){
            count1.append((c-97)+"");
        }
        for(char c:secondWord.toCharArray()){
            count2.append((c-97)+"");
        }
        for(char c:targetWord.toCharArray()){
            count3.append((c-97)+"");
        }
        int c1=Integer.parseInt(count1.toString());
        int c2=Integer.parseInt(count2.toString());
        int c3=Integer.parseInt(count3.toString());

        return (c1+c2==c3);
        
    }
}