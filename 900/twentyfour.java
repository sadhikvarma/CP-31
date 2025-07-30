import java.io.*;

public class twentyfour {
    public static void solve(long a,long b){

        if(a == b){
            System.out.println("0" + " " + "0");
            return;
        }
            
        long rem = (a-b);
        long res = Math.min(b%rem , (rem-(b%rem)));

        System.out.println(rem + " " + res);
    }
    public static void main(String args[]) throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine().trim());

            while(t-- > 0){
            String parts1[] = br.readLine().trim().split(" ");

            long a = Long.parseLong(parts1[0]);
            long b = Long.parseLong(parts1[1]);
            
            if(a > b)
                solve(a,b);
            else
                solve(b,a);
        }
    }
}
