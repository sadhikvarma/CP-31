import java.io.*;

public class thirteen {
    public static void solve(int n,long arr[]){
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0 && (i == 0 || arr[i - 1] == 0)) {
                count++;
            }
        }
        System.out.println(Math.min(2,count));
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
