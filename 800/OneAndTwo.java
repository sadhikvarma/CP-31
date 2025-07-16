import java.io.*;

public class OneAndTwo{
    public static void solve(int n, int[] arr) {
        int countOne = 0;
        int countTwo = 0;

        for(int i = 0; i < n; i++) {
            if(arr[i] == 1) {
                countOne++;
            } else if(arr[i] == 2) {
                countTwo++;
            }
        }

        if(countTwo == 0){
            System.out.println("1");
            return;
        }
        else if(countTwo%2 != 0){
            System.out.println("-1");
            return;
        }
        else{
            int count = 0;
            for(int i = 0; i < n; i++) {
                if(arr[i] == 2) {
                    count++;
                }
                if(count == (countTwo / 2)) {
                    System.out.println(i + 1);
                    return;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while(t-- > 0){
            int n = Integer.parseInt(br.readLine().trim());
            String[] parts = br.readLine().trim().split(" ");
            
            int arr[] = new int[n];

            for(int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(parts[i]);
            }
            solve(n,arr);
        }
        
    }
}