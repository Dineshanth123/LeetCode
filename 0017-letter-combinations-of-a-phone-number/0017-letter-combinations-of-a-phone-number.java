class Solution {
    public List<String> letterCombinations(String digits) {
        String[] arr={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        
        
    }
}class Solution {
    public List<String> letterCombinations(String digits){
        List<String> results=new ArrayList<>();
        if(digits==null || digits.isEmpty()){
            return results;
        }
        
        String[] mapping={
            "","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"
        };
        
        backtrack(results,digits,mapping,0,new StringBuilder());
        return results;
    }
    
    private void backtrack(List<String> results,String digits,String[] mapping,int index,StringBuilder current) {
        if(index==digits.length()){
            results.add(current.toString());
            return;
        }
        
        String letters=mapping[digits.charAt(index)-'0'];
        for(char letter : letters.toCharArray()){
            current.append(letter); 
            backtrack(results,digits,mapping,index+1,current); 
            current.deleteCharAt(current.length()-1); 
        }
    }
}