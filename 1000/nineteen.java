import java.io.*;
import java.util.*;

public class nineteen {
    public static void solve(int[] arr, int n){
        int[] pos = new int[n + 1];
        pos[0] = 0; 

        int[][] data = new int[n][2];
        for(int i = 0; i < n; i++) {
            data[i][0] = arr[i];
            data[i][1] = i + 1; 
        }

        Arrays.sort(data, (a, b) -> Integer.compare(b[0], a[0]));

        int coord = 1;
        for(int i = 0; i < n; i++) {
            if(i % 2 == 0)
                pos[data[i][1]] = coord;
            else {
                pos[data[i][1]] = -coord;
                coord++;
            }
        }

        long sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += 2L * arr[i - 1] * Math.abs(pos[i]);
        }

        System.out.println(sum);
        for(int i = 0; i <= n; i++) {
            System.out.print(pos[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String[] parts = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++){
                arr[i] = Integer.parseInt(parts[i]);
            }
            solve(arr, n);
        }
    }
}
