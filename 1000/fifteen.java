import java.io.*;

public class fifteen {
    public static void solve(int n,int k,String s){
        int len = 0;
        int min = Integer.MAX_VALUE;
        
        for(int i = 0; i< k; i++){
            if(s.charAt(i) == 'W')
                len++;
        }
        min = Math.min(min,len);

        for(int i = k ;i < n ;i++){
            if(s.charAt(i-k) == 'W')
                len--;
            if(s.charAt(i) == 'W')
                len++;
            min = Math.min(min,len);
        }
        System.out.println(min);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while(t-- > 0){
            String parts[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(parts[0]);
            int k = Integer.parseInt(parts[1]);
            String s = br.readLine().trim();
            solve(n,k,s);
        }
    }
}
