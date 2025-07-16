import java.io.*;

public class ArrayColouring {

    public static void solve(int n, int[] arr) {
        int countOdd = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                countOdd++;
            }
        }
        if(countOdd%2 != 0)
            System.out.println("NO");
        else
            System.out.println("YES");
    }
    

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] parts = br.readLine().trim().split(" ");
            
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(parts[i]);
            }
            solve(n, arr);
        }
    }
}