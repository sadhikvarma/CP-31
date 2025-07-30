import java.io.*;

public class Six {
    public static void solve(long n){
        int count = 1;
        
        while(true){
            if((n % count) == 0)
                count++;
            else    
                break;
        }
        System.out.println(count-1);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            long n = Long.parseLong(br.readLine().trim());

            solve(n);
        }
    }
}
