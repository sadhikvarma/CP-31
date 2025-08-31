import java.io.*;

public class twenty {
    public static void solve(int a,int b){
        int xor = 0;
        int len = a;
        int cmp = (a-1)%4;
        // pattern for consecutive xor's changes after every four numbers observe pattern n,1,n+1,0
        if(cmp == 0)
            xor = (a-1);
        else if(cmp == 1)
            xor = 1;
        else if(cmp == 2)
            xor = a;
        else
            xor = 0;

        if(xor == b)
            System.out.println(len);
        else{
            if((xor^b) != a)
                System.out.println(len+1);
            else 
                System.out.println(len+2);
        }
    }
    public static void main(String[] args) throws  IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0){
            String parts[] = br.readLine().trim().split(" ");
            int a = Integer.parseInt(parts[0]);
            int b = Integer.parseInt(parts[1]);
            solve(a, b);
        }
    }
}
