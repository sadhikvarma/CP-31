import java.io.*;
public class thirtyone{

    public static void solve(long n){
        int count = 0;
        int count_2 = 0;
        int count_3 = 0;

        while( n > 0 && n%2 == 0){
            count_2++;
            n /= 2;
        }

        while(n > 0 && n%3 == 0){
            count_3++;
            n /= 3;
        }

        if((n > 1 )|| (count_2 > count_3))
            System.out.println("-1");

        else{
            System.out.println((count_3-count_2) + count_3);
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