import java.io.*;

public class eleven{
    public static void solve(int n,long[] arr){
        int count = 0;
        if((int)(arr[0]) == 1) {
            count++;
            arr[0] = 2;
        }
        
        for(int i = 1;i < n;i++){
            if((int)(arr[i]) == 1) {
                count++;
                arr[i] = 2;
            }
            if((arr[i]%arr[i-1]) == 0){
                count++;
                arr[i] += 1;
            }
        }
        
        for (long num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while(t-- > 0){
            int n = Integer.parseInt(br.readLine().trim());
            String parts[] = br.readLine().trim().split(" ");
            long arr[] = new long[n];

            for (int index = 0; index < n; index++) {
                arr[index] = Long.parseLong(parts[index]);
            }

            solve(n,arr);
        }
    }
}