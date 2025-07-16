import java.io.*;

public class HalloumiBoxes{
    public static boolean isSorted(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1])
                return false;
        }
        return true;
    }
    public static void solve(int n,int k,int[] arr){
        if(k == 1 && !isSorted(arr))
            System.out.println("NO");
        else
            System.out.println("YES");

    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while(t-- > 0){
            String parts[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(parts[0]);
            int k = Integer.parseInt(parts[1]);
            int arr[] = new int[n];
            String parts1[] = br.readLine().trim().split(" ");
            for (int index = 0; index < arr.length; index++) {
                arr[index] = Integer.parseInt(parts1[index]);
            }
            
            solve(n,k,arr);
        }

    }

    
}