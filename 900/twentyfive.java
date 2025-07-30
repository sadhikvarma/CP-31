import java.io.*;

public class twentyfive{
    public static void solve(int n , int m,int i, int j){
        
        System.out.println("1 " + "1 " + n +" " + m);
    }
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while(t-- > 0){
            String parts[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(parts[0]);
            int m = Integer.parseInt(parts[1]);
            int i = Integer.parseInt(parts[2]);
            int j = Integer.parseInt(parts[3]);
            solve(n,m,i,j);
        }
    }
}