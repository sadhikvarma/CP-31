import java.io.*;

public class BlankSpace {
    public static void solve(int n, int[] arr) {
        int max = 0;
        int count = 0;
        for(int i = 0;i < n;i++){
            if(arr[i] == 0){
                count++;
                if(max < count){
                    max = count;
                }
            }
            else{
                count = 0;
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            
            String[] arrParts = br.readLine().trim().split(" ");
            int[] arr = new int[n];
            
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(arrParts[i]);
            }
            
            solve(n, arr);
        }
        
    }
}
