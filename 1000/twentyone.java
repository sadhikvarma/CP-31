import java.io.*;

public class twentyone{
    public static void solve(String a, String b) {
        int a_len = a.length();
        int b_len = b.length();
        int max_len = 0;

    
        for (int i = 0; i < a_len; i++) {
            for (int j = a_len; j >= i+1+max_len; j--) {
                String sub = a.substring(i, j);
                if (b.contains(sub)) {
                    max_len = Math.max(max_len, j - i);
                    break;
                }
            }
        }

        System.out.println((a_len - max_len) + (b_len - max_len));
    }
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while(t-- > 0){
            String a = br.readLine().trim();
            String b = br.readLine().trim();

            solve(a,b);
        }
    }
}