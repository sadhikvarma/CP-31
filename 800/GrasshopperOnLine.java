import java.io.*;

public class GrasshopperOnLine {
    public static void solve(int x,int k){
        if(x%k != 0){
            System.out.println("1");
            System.out.println(x);
        }
        else{
            System.out.println("2");
            System.out.println(x-1 + " " + 1);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        
        while (t-- > 0) {
            String[] parts = br.readLine().trim().split(" ");
            int x = Integer.parseInt(parts[0]);
            int k = Integer.parseInt(parts[1]);
            solve(x, k);
        }
    }
}
