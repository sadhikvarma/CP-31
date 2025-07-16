import java.io.*;

public class Buttons {
    public static void solve(int a, int b, int c) {
        if(c%2 == 1){
            if(b > a)
                System.out.println("Second");
            else
                System.out.println("First");
        }
        else{
            if(a > b)
                System.out.println("First");
            else 
                System.out.println("Second");
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String[] parts = br.readLine().trim().split(" ");
            int a = Integer.parseInt(parts[0]);
            int b = Integer.parseInt(parts[1]);
            int c = Integer.parseInt(parts[2]);
            solve(a,b,c);
        }
    }
}
