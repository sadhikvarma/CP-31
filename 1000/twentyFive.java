import java.io.*;
import java.util.*;

public class twentyFive {
    public static void solve(int n,long[] arr){
        //we can check uniqueness by set also more efficient
        Arrays.sort(arr);
        for(int i = 0;i < n-1; i++){
            if(arr[i] == arr[i+1]){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");

    }
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while(t-- > 0){
            int n = Integer.parseInt(br.readLine().trim());
            String parts[] = br.readLine().trim().split(" ");
            long[] arr = new long[n];

            for(int i = 0; i < n; i++){
                arr[i] = Long.parseLong(parts[i]);
            }
            solve(n,arr);
        }
    }
}
