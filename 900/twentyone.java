import java.io.*;

public class twentyone{
    public static int solve(String n,String check){
        int ops = 0;
        int check_index = check.length() - 1;
        StringBuilder sb = new StringBuilder(n);
        int len = n.length();

        for(int i = len-1; i >= 0 ; i--){
            if(n.charAt(i) == check.charAt(check_index)){
                check_index--;
                if(check_index < 0)
                    break;
            }
            else{
                ops++;
            }
        }

        if(check_index > 0)
            ops = Integer.MAX_VALUE;

        return ops;
    }
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while(t-- > 0){

            String s  = br.readLine().trim();
            String[] parts = {"25","00","50","75"};
            int min = Integer.MAX_VALUE;

            for(String check : parts){
                min = Math.min(min,solve(s,check));
            }
            
            System.out.println(min);
        }
    }
}