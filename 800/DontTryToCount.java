import java.io.*;

public class DontTryToCount {
     public static void solve(int n, int m, String x, String s) {
        if (x.contains(s)) {
            System.out.println(0);
            return;
        }

        for (int i = 0; i < 6; i++) {
            x = x + x;  
            if (x.contains(s)) {
                System.out.println(i + 1);  
                return;
            }
        }

        System.out.println(-1);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        while(t-- > 0){
            String parts[] = br.readLine().split(" ");
            int n = Integer.parseInt(parts[0]);
            int m = Integer.parseInt(parts[1]);
            String x = br.readLine().trim();
            String s = br.readLine().trim();
            solve(n,m,x,s);
        }
    }
}
