import java.io.*;

public class ServalAndMochasArray {
    public static void solve(int n,int[] arr){
        for(int i = 0;i < n;i++){
            for(int j = i+1;j < n;j++){
                if(gcd(arr[i], arr[j]) <= 2){
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while(t-- > 0){
            int n = Integer.parseInt(br.readLine().trim());
            String parts[] = br.readLine().trim().split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(parts[i]);    
            }
            solve(n,arr);
        }

    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
