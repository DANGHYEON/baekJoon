import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main{


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        int result = 1;


        for (int i =0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int taping = (int)(arr[0] - 0.5 + l);

        for (int i =1; i<n; i++){
            if (arr[i] > taping){
                taping = (int)(arr[i] - 0.5 + l);
                result++;
            }
        }


        System.out.println(result);

    }

}