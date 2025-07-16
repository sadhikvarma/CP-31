import java.io.*;

public class WalkingMaster {
    public static void solve(int a, int b, int c, int d) {
        long dy = d - b;
        long dx_diff = dy - (c - a);
        

        if(a == c && b == d){
            System.out.println("0");
            return;
        }
        else if(dy < 0 || dx_diff < 0){
            System.out.println("-1");
            return;
        }
        else{
            System.out.println(dy+dx_diff);         
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String parts[] = br.readLine().trim().split(" ");
            int a = Integer.parseInt(parts[0]);
            int b = Integer.parseInt(parts[1]);
            int c = Integer.parseInt(parts[2]);
            int d = Integer.parseInt(parts[3]);
            solve(a,b,c,d);
        }
    }
}
