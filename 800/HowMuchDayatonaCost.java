import java.io.*;

public class HowMuchDayatonaCost {
    public static void solve(int n,int k,int[] arr){
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] == k){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        while(t-- > 0){
            String parts[] = br.readLine().split(" ");
            int n = Integer.parseInt(parts[0]);
            int k = Integer.parseInt(parts[1]);
            String parts1[] = br.readLine().trim().split(" ");
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(parts1[i]);
            }
            solve(n,k,arr);
        }
    }
}
