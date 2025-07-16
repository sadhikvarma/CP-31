import java.io.*;

public class ForbiddenInteger {
    
    public static void solve(int n, int k, int x) {
        if(x != 1){
            System.out.println("YES");
            System.out.println(n);
            for (int index = 0; index < n; index++) {
                System.out.print("1 ");
            }
            System.out.println();
        } 
        else {
            if (k == 1) {
                System.out.println("NO");
            } 
            else if(k == 2) {
                if(n%2 == 0) {
                    System.out.println("YES");
                    System.out.println(n/2);
                    for (int index = 0; index < n/2; index++) {
                        System.out.print("2 ");
                    }
                    System.out.println();
                } else {
                    System.out.println("NO");
                }
            }
            else{
                System.out.println("YES");
                if(n % 2 == 0) {
                    System.out.println(n/2);
                    for (int index = 0; index < n / 2; index++) {
                        System.out.print("2 ");
                    }
                    System.out.println();
                } 
                else {
                    System.out.println(((n-3)/2)+ 1);
                    System.out.print("3 ");
                    if(n > 3) {
                        for (int index = 0; index < (n - 3) / 2; index++) {
                        System.out.print("2 ");
                    }
                    }
                    System.out.println();
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String[] parts = br.readLine().trim().split(" ");
            int n = Integer.parseInt(parts[0]);
            int k = Integer.parseInt(parts[1]);
            int x = Integer.parseInt(parts[2]);
            solve(n, k, x);
        }
    }
}
