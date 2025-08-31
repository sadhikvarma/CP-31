import java.io.*;

public class twentySix {
    public static void solve(long x,long y,long k){
         long totalSticksNeeded = k * (y + 1); 
        long trades = (totalSticksNeeded - 1 + (x - 2)) / (x - 1); //Mathematical ceil division
        long torches = trades + k;
        System.out.println(torches);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0){
            String parts[] = br.readLine().trim().split(" ");
            long x = Long.parseLong(parts[0]);
            long y = Long.parseLong(parts[1]);
            long k = Long.parseLong(parts[2]);
            solve(x,y,k);
        }
    }
}
