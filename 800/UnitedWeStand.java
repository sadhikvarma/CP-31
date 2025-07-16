import java.io.*;
import java.util.Arrays;

public class UnitedWeStand {
    public static void solve(int n, int[] arr) {
        Arrays.sort(arr);
        int max = arr[n - 1];
        int count = 0;
        int j = 0;
        int b[] = new int[n];
        int c[] = new int[n];
        for (int i = 0; i < n; i++) {
            if((arr[i] == max))
            {
                b[count++] = arr[i];
            } 
            else 
            {
                c[j++] = arr[i];
            }
        }
        
        if(j == 0)
        {
            System.out.println("-1");
            return;
        }
        else{
            System.out.println(j + " " + count);
            for(int i = 0; i < j; i++) {
                System.out.print(c[i] + " ");
            }
            System.out.println();
            for(int i = 0; i < count; i++) {
                System.out.print(b[i] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] parts = br.readLine().trim().split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(parts[i]);
            }
            solve(n, arr);
        }
        
    }
}
