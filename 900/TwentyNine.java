import java.io.*;

public class TwentyNine {
    public static void solve(int n,int[] arr){
        for(int i = 1; i < n-1; i++){
            if((arr[i] > arr[i-1]) && (arr[i] > arr[i+1])){
                System.out.println("Yes");
                System.out.println(i + " " + (i+1) + " " + (i+2));
                return;
            }
        }
        System.out.println("No");
    }
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] parts = br.readLine().trim().split(" ");
            int[] arr = new int[n];

            for (int index = 0; index < n; index++) {
                arr[index] = Integer.parseInt(parts[index]);
            }

            solve(n, arr);
        }
    }
}
