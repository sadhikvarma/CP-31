import java.io.*;
import java.util.*;

public class thirty{

    public static void solve(int[] arr,int n){

        Integer[] boxedArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);

        Arrays.sort(boxedArr,(a,b)->{
            return Integer.compare(b,a);
        });
        for(int num : boxedArr){
            System.out.print(num + " ");
        }
        System.out.println();
    }
     public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while(t-- > 0){
            int n = Integer.parseInt(br.readLine().trim());
            String parts1[] = br.readLine().trim().split(" ");
            int arr[] = new int[n];

            for (int index = 0; index < n; index++) {
                arr[index] = Integer.parseInt(parts1[index]);
            }

            solve(arr,n);
        }
    }
}