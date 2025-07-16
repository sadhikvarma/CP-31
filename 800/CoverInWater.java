import java.io.*;

public class CoverInWater {
    public static void count(char c,String s){
        int count = 0;
        if(s.charAt(0) == c)
            count++;
        if(s.charAt(1) == c)
            count++;
        System.out.println(count);
    }
    public static void solve(int n,String s){
        boolean continuous_three_dots = false;
        int count = 0;

        for( int i = 0;i < n;i++){
            if(s.charAt(i) == '.' && (i+1 < n) && (s.charAt(i+1) == '.') && (i+2 < n)&&s.charAt(i+2) == '.'){
                continuous_three_dots = true;
                break;
            }
            if(s.charAt(i) == '.')
                count++;
        }
        if(continuous_three_dots)
            System.out.println(2);
        else
            System.out.println(count);

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine().trim();
            solve(n,s);
        }
    }
}
