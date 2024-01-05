import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int count = 0;
        Set<String> arr = new HashSet<>();
        
        for(int i = 0; i<N; i++){
            arr.add(br.readLine());
        }
        
        for(int i=0; i<M; i++){
            String str = br.readLine();
            
            if(arr.contains(str)){
                count++;
            }
            
        }
        
        System.out.println(count);
        
        
    }
}