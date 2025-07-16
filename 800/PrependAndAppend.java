import java.io.*;

public class PrependAndAppend{
    public static void solve(int n, String s){
       int left = 0;
       int right = n - 1;
       int len = 0;
       while(left <= right){
            if ((s.charAt(left) == '0' && s.charAt(right) == '1') || (s.charAt(left) == '1' && s.charAt(right) == '0')){
                len += 2;
                left++;
                right--;
            }
            else{
                System.out.println(n - len);
                return;
            }
        }
        System.out.println(n - len);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while(t-- > 0){
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine().trim();

            solve(n,s);
        }

    }
}