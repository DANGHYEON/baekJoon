import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main{


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 0;
        Integer[] arr = new Integer[n];

        for (int i =0; i<n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr,Collections.reverseOrder());

        for (int i =0; i<n; i++){
            result = Math.max(result,arr[i] * (i+1));
        }

        System.out.println(result);

    }

}