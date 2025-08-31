import java.io.*;

public class nine {
    public static void solve(long n){
        long a = 1;
        long b = n-1;
        for(long i = 2 ; i*i <= n; i++){
            if(n%i == 0){
                a = n/i;
                b = n - a;
                break;
            }
        }
        System.out.println(a + " " + b);
    }
    public static void main(String args[]) throws  IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

       while(t-- > 0){

            long n = Long.parseLong(br.readLine().trim());

            solve(n);
       }
    }
}
