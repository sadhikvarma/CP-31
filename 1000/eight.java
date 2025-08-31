import java.io.*;
import java.util.*;

public class eight{
    public static void solve(int n , String s){
        int[] prefixDistinct = new int[n];
        int[] suffixDistinct = new int[n];

        Set<Character> seen = new HashSet<>();

        for (int i = 0; i < n; i++) {
            seen.add(s.charAt(i));
            prefixDistinct[i] = seen.size();
        }

        seen.clear();

        for (int i = n - 1; i >= 0; i--) {
            seen.add(s.charAt(i));
            suffixDistinct[i] = seen.size();
        }

        int maxDistinct = 0;

        for (int i = 0; i < n - 1; i++) {
            int current = prefixDistinct[i] + suffixDistinct[i + 1];
            maxDistinct = Math.max(maxDistinct, current);
        }

        System.out.println(maxDistinct);
    }
    
    public static void main(String args[]) throws  IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

       while(t-- > 0){

            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine().trim();

            solve(n,s);
       }
    }
}