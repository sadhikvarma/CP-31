import java.io.*;
import java.util.*;

public class eleven{
    public static void solve(int n ,int d,int[] arr){
        Arrays.sort(arr);
        int left = 0;
        int right = n-1;
        int count = 0;
        int num = 2;
        while(left <= right){
            if(arr[left] > d){
                left++;
                count++;
            }
            else if(arr[right] > d){
                right--;
                count++;
            }
            else if((arr[right]*num > d) && (left != right)){
                count++;
                right--;
                left++;
                num = 2;
            }
            else{
                num++;
                left++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = 1;

        while(t-- > 0){
            String[] parts = br.readLine().trim().split(" ");
            int n = Integer.parseInt(parts[0]);
            int d = Integer.parseInt(parts[1]);

            String[] parts1 = br.readLine().trim().split(" ");
            int arr[] = new int[n];

            for(int i = 0 ; i< n; i++){
                arr[i] = Integer.parseInt(parts1[i]);
            }
            solve(n,d,arr);
        }
    }
}