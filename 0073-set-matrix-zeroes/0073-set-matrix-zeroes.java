class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        List<Integer> rows=new ArrayList<>();
        List<Integer> cols=new ArrayList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        for(Integer x:rows){
            for(int i=0;i<n;i++){
                matrix[x][i]=0;
        }}
        for(Integer x:cols){
            for(int i=0;i<m;i++){
                matrix[i][x]=0;
        }}
        
    }
}