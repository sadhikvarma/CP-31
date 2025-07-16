import java.io.*;

public class WeNeedZero {
    public static void solve(int[] arr, int n){
        int res = arr[0];
        for(int i = 1; i < n; i ++){
            res ^= arr[i];
        }
        if(n%2 == 0){
            if(res == 0){
                System.out.println("0");
                return;
            } else {
                System.out.println("-1");
                return;
            }
        }
        else{
            System.out.println(res);   
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String parts[] = br.readLine().trim().split(" ");
            int arr[] = new int[n];

            for(int i = 0;i < n;i++){
                arr[i] = Integer.parseInt(parts[i]);
            }
            solve(arr,n);
        }
    }
}
