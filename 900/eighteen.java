import java.io.*;

public class eighteen {
    public static void solve(long a, long b, long c) {
        if ((a + c) % 2 == 0 && ((a + c) / 2) % b == 0 && (a + c) / 2 > 0)
            System.out.println("Yes");
        else if ((2 * b - a) % c == 0 && (2 * b - a) / c > 0)
            System.out.println("Yes");
        else if ((2 * b - c) % a == 0 && (2 * b - c) / a > 0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while(t-- > 0){
            String parts[] = br.readLine().trim().split(" ");
            long a = Long.parseLong(parts[0]);
            long b = Long.parseLong(parts[1]);
            long c = Long.parseLong(parts[2]);

            solve(a,b,c);
        }
    }
}
