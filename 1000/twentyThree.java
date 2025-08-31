import java.io.*;

public class twentyThree {
    public static int nextPrime(int n){
        for(int i = n;i > 0;i++){
            boolean isPrime = true;
            for(int j = 2; j*j <= i;j++){
                if(i%j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
                return i;
        }
        return 0;
    }
    public static void solve(int d) {
        int second = d+1;
        second = nextPrime(second);

        int three = second+d;
        three = nextPrime(three);

        long res = second*three;
        System.out.println(Math.min((int)(Math.pow(second,3)),res));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            solve(n);
        }
    }
}
