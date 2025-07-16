import java.io.*;

public class ExtremelyRound {
    public static int solve(int n){
        if(n < 10)
            return n;
        else{
            int len = String.valueOf(n).length();
            int res = 9*(len-1); //for 800 count till 100 as it will be 9 multiples for 800 there are 8 numbers
            res += n/((int)(Math.pow(10,len-1)));
            return res;
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while(t-- > 0){
            int n = Integer.parseInt(br.readLine().trim());
            int res = solve(n);
            System.out.println(res);
        }

    }
}
