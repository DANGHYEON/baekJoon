class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = arr1.clone();
        
        
        for(int i =0; i<answer.length; i++){
            for(int j=0; j<answer[0].length; j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        
        
        
        return answer;
        
    }
}