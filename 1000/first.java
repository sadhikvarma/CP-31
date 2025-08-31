import java.io.*;

public class first{
    public static void solve(String s){
        int count_zero = 0;
        int count_one = 0;
        int ts = 0;
        int n = s.length();

        for(char ch : s.toCharArray()){
            if(ch == '0')
                count_zero++;
            else
                count_one++;
        }
        
        for(int i = 0 ; i < n ; i++){
            if(s.charAt(i) == '0' && count_one > 0){
                ts++;
                count_one--;
            }
            else if(s.charAt(i) == '1' && count_zero > 0){
                ts++;
                count_zero--;
            }
            else
                break;
        }
        System.out.println(n-ts);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String s = br.readLine().trim();
            solve(s);
            
        }
    }
}