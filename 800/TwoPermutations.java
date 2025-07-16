import java.io.*;

public class TwoPermutations{
    public static void solve(int n,int a,int b){
        if(n==a && n==b)
            System.out.println("Yes");
        else if(a+b+2 <= n)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
     public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while(t-- > 0){
            String parts[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(parts[0]);
            int a = Integer.parseInt(parts[1]);
            int b = Integer.parseInt(parts[2]);
            solve(n,a,b);
        }

    }
}