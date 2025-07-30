import java.io.*;

public class twenty{
    public static void solve(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder(s);
        if(n == 1){
            System.out.println(s);
            return;
        }
        if(sb.charAt(0) == sb.charAt(n-1))
            System.out.println(sb.toString());
        else
            System.out.println(sb.substring(0,n-1)+String.valueOf(sb.charAt(0)));
    }
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while(t-- > 0){
            String s = br.readLine().trim();
            solve(s);
        }
    }

}