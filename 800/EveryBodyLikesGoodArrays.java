import java.io.*;

public class EveryBodyLikesGoodArrays {
    public static void solve(int[] arr,int n){
        int count_parity = 0;
        for(int i = 1;i < n;i++){
            if((arr[i]%2 == arr[i-1]%2 )){
                count_parity++;
            }
        }
        System.out.println(count_parity);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] parts = br.readLine().trim().split(" ");
            int[] arr = new int[n];

            for(int i = 0;i < n;i++){
                arr[i] = Integer.parseInt(parts[i]);
            }
            solve(arr, n);
        }
    }
}
