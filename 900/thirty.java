import java.io.*;

public class thirty{
    public static void solve(String s){
        int count_zero = 0;
        int count_one = 0;
        
        for(char ch : s.toCharArray()){
            if(ch == '0')
                count_zero++;
            if(ch == '1')
                count_one++;
        }
        int possible = Math.min(count_zero,count_one);

        if((possible % 2) == 1)
            System.out.println("DA");
        else
            System.out.println("NET");

    }
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while(t-- > 0){
            String s = br.readLine().trim();

            solve(s);
        }
    }
}