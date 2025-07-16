import java.io.*;

public class LineTrip {
    public static void solve(int n,int x,int[] arr){
        int max_diff = arr[0];
        int lasTravel = 2*(x-arr[n-1]);

        for(int i = 1; i < n; i++){
            int diff = (arr[i] - arr[i-1]);
            if(diff > max_diff)
                max_diff = diff;
        }

        System.out.println(Math.max(max_diff, lasTravel));
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while(t-- > 0){
            String parts[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(parts[0]);
            int x = Integer.parseInt(parts[1]);
            int arr[] = new int[n];
            String parts1[] = br.readLine().trim().split(" ");
            for (int index = 0; index < arr.length; index++) {
                arr[index] = Integer.parseInt(parts1[index]);
            }
            
            solve(n,x,arr);
        }

    }
}
