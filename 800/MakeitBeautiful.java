import java.io.*;
import java.util.*;

public class MakeitBeautiful {
    public static void solve(int[] arr,int n){
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[n-1];
        if(min == max){//all the elements in the array are same so we cant place
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
            System.out.print(max + " "+min+" ");
            for (int index = 1; index < n-1; index++) {
                System.out.print(arr[index]+ " ");
            }
            System.out.println();
        }
                
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] parts = br.readLine().trim().split(" ");
            int[] arr = new int[n];

            for(int i = 0;i < n;i++){
                arr[i] = Integer.parseInt(parts[i]);
            }
            solve(arr, n);
        }
    }
}
