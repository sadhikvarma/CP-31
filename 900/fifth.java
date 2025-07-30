import java.io.*;

public class fifth {
    public static void solve(int n,int[] arr){
        if(n%2 == 0){
            System.out.println("2");
            System.out.println("1 " + n);
            System.out.println("1 "+ n);
        }
        else{
            System.out.println("4");
            System.out.println("1 " + (n-1));
            System.out.println("1 "+ (n-1));
            System.out.println((n-1)+ " "  + n);
            System.out.println((n-1)+ " " + n);

        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] parts = br.readLine().trim().split(" ");
            int arr[] = new int[n];

            for(int i = 0;i < n;i++){
                arr[i] = Integer.parseInt(parts[i]);
            }

            solve(n, arr);
        }
    }
}
