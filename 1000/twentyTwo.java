import java.io.*;

public class twentyTwo{
    public static void solve(long a,long b) {
        long min = Integer.MAX_VALUE;
        for(int i = 0; i <= 31 ; i++){
            long ops = i;
            long b1 = b + i;
            long a1 = a;
            if(b1 == 1)
                continue;
            while(a1 > 0){
                a1 = a1/b1;
                ops++;
            }
            min = Math.min(min,ops);
        }
        System.out.println(min);
    }
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while(t-- > 0){

            String parts[] = br.readLine().trim().split(" ");
            long a = Long.parseLong(parts[0]);
            long b = Long.parseLong(parts[1]);
            solve(a,b);
        }
    }
}