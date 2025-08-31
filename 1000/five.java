import java.io.*;
import java.util.*;

public class five{
    public static void solve(long[] arr, int n, long k) {
        long[] modArr = new long[n];
        ArrayList<Integer> zeroModIndices = new ArrayList<>();
        ArrayList<int[]> remainderList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            modArr[i] = arr[i] % k;
        }

        for (int i = 0; i < n; i++) {
            if (modArr[i] == 0) {
                zeroModIndices.add(i + 1);  
            } else {
                remainderList.add(new int[]{i + 1, (int) modArr[i]}); 
            }
        }

        Collections.sort(remainderList, (a, b) -> {
            if (b[1] != a[1]) {
                return Integer.compare(b[1], a[1]); 
            } else {
                return Integer.compare(a[0], b[0]); 
            }
        });

        for (int index : zeroModIndices) {
            System.out.print(index + " ");
        }
        for (int[] pair : remainderList) {
            System.out.print(pair[0] + " ");
        }

        System.out.println();
    }

    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while(t-- > 0){
            String[] parts = br.readLine().split(" ");
            int n = Integer.parseInt(parts[0]);
            long k = Long.parseLong(parts[1]);
            String parts1[] = br.readLine().trim().split(" ");
            long arr[] = new long[n];

            for (int index = 0; index < n; index++) {
                arr[index] = Long.parseLong(parts1[index]);
            }

            solve(arr,n,k);
        }
    }
}