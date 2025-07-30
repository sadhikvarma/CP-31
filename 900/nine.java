import java.io.*;

public class nine {
    public static int gcd(int a, int b){
        while(b != 0){
            int temp = a%b;
            a = b;
            b = temp;
        }
        return a;
    }
    public static void solve(int n,int[] arr){
        int ans = Math.abs(arr[0]-1);

        for (int i = 1; i < arr.length; i++) {
            ans = gcd(ans,Math.abs(arr[i] - (i+1)));
        } 
        System.out.println(ans);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] parts = br.readLine().trim().split(" ");
            int arr[] = new int[n];

            for(int i = 0;i < n;i++){
                arr[i] = Integer.parseInt(parts[i]);
            }

            solve(n, arr);
        }
    }
}
