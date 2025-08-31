import java.io.*;

public class thirtyOne {
    public static void solve(int n,String s){
        for(int i = 0; i < n-1 ; i++){
            if(s.charAt(i) > s.charAt(i+1)){
                System.out.println("YES");
                System.out.print((i+1) + " " + (i+2));
                System.out.println();
                return ;
            }
        }
        System.out.println("NO");
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        String s = br.readLine().trim();

        solve(n,s);
    }
}
