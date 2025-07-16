import java.io.*;

public class AmbitiousKid {
    public static void solve(int[] arr,int n){
        int min = Math.abs(arr[0]);
        for(int num: arr){
            if(num == 0){
                System.out.println(0);
                return;
            }
            else if(Math.abs(num) < min){
                min = Math.abs(num);
            }
        }
        System.out.println(min);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        String parts[] = new String[n];
        int arr[] = new int[n];
        parts = br.readLine().trim().split(" ");

        for (int index = 0; index < n; index++) {
            arr[index] = Integer.parseInt(parts[index]);
        }
        solve(arr,n);
        
    }
}
