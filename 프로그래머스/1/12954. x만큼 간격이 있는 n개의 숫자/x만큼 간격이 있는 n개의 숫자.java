class Solution {
    public long[] solution(int x, int n) {
        long[] arr = new long[n];
        long y = x;
        
        for(int i =0; i<n; i++){
            arr[i] = y;
            y += x;
        }
        
        return arr;
        
    }
}