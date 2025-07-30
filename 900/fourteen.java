import java.io.*;

public class fourteen {
    public static void solve(long n){
        if(n < 4 || n%2 != 0){
            System.out.println("-1");
        }
        else{
            long max = n/4;
            long min = n/6;
            if(n%6 != 0)
                min++;
            System.out.println(min + " "+ max);
        }
            
    }
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while(t-- > 0){
            long n = Long.parseLong(br.readLine().trim());
            
            solve(n);
        }
    }
}
