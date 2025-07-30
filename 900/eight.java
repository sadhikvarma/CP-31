import java.io.*;

public class eight {

    public static void solve(int n ,String s){
        int count = 1;
        int max = 1;

        for(int i = 1; i < n;i++){
            if(s.charAt(i) == s.charAt(i-1)){
                count++;
            }
            else    
                count = 1;
            max = Math.max(max,count);
        }
        System.out.println(max+1);
    }
     public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine().trim();

            solve(n,s);
        }
    }
}
