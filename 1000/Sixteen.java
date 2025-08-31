import java.io.*;

public class Sixteen{
    public static void solve(int n ,int r,int b){
        StringBuilder sb = new StringBuilder("");
        int parts = b+1;
        int chunks = (int)(r/parts);
        int extra = (int)(r%parts);
        for(int i = 0;i < parts; i++){
            for(int j = 0; j < chunks ; j++){
                sb.append('R');
                r--;
            }
            if(extra-- > 0){
                sb.append('R');
                r--;
            }
            if(b-- > 0)
                sb.append('B');
            
        }
        while(r-- > 0){
            sb.append('R');
        }
        System.out.println(sb);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String parts[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(parts[0]);
            int r = Integer.parseInt(parts[1]);
            int b = Integer.parseInt(parts[2]);
            solve(n,r,b);
        }
    }
}