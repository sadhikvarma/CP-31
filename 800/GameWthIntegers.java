import java.io.*;

public class GameWthIntegers {
    public static void solve(int n){
        if(((n-1)%3 == 0) || (n+1)%3 == 0)
            System.out.println("First");
        else
        System.out.println("Second");
    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            solve(n);
        }

    }
}
