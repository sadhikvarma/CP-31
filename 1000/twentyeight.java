import java.io.*;

public class twentyeight{
    public static void solve(String s,int n){
        int left = 0;
        int ops = 0;

        for(char ch : s.toCharArray()){
            if(ch == '(')
                left++;
            else if(ch == ')'){
                if(left > 0)
                    left--;
                else
                    ops++;
            }
        }
        System.out.println(ops);
    }
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while(t-- > 0){
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine().trim();

            solve(s,n);
        }
    }
}