import java.io.*;

public class twentyeight {
    public static void solve(int n,int k,int[] arr){
        long sum = 0;
        int index = n*k;
        while(k-- > 0){
            index -= ((n/2) + 1);
            sum += arr[index];

        }
        System.out.println(sum);
    }
    public static void main(String args[]) throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine().trim());

            while(t-- > 0){
            String parts1[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(parts1[0]);
            int k = Integer.parseInt(parts1[1]);
            
            String parts[] = br.readLine().trim().split(" ");
            int arr[] = new int[n*k];

            for (int index = 0; index < n*k; index++) {
                arr[index] = Integer.parseInt(parts[index]);
            }

            solve(n,k,arr);
        }
    }
}
