import java.io.*;

public class SequenceGame  {
    public static void solve(int n, int[] arr) {
        int[] con = new int[2*n];
        int len = 0;
        con[0] = arr[0];
        len++;
        for (int i = 1; i < n; i++) {
            if (arr[i] >= arr[i - 1]) {
                con[len++] = arr[i];
            }



            
            else {
                con[len++] = Math.max(arr[i],1);
                con[len++] = arr[i];
            }
        }
        System.out.println(len);
        for (int i = 0; i < len; i++) {
            System.out.print(con[i] + " ");   
        }
        System.out.println();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while(t-- > 0){
            int n = Integer.parseInt(br.readLine().trim());
            String parts[] = br.readLine().trim().split(" ");
            int arr[] = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(parts[i]);
            }
            solve(n,arr);
        }
    }
}
