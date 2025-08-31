import java.io.*;
import java.util.*;

public class four{
    public static void solve(List<List<Integer>> arr){
       for(List<Integer> list : arr){
           Collections.sort(list);
       }
       long sum = 0;
       int min = Integer.MAX_VALUE;
       for(List<Integer> list : arr){
           sum += list.get(1);
           min = Math.min(min, list.get(1));
       }
       sum = sum - min;

       for(List<Integer> list : arr){
           min = Math.min(min, list.get(0));
       }
        System.out.println(sum + min);
        
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            List<List<Integer>> arr = new ArrayList<>();
            while(n-- > 0){
                int m = Integer.parseInt(br.readLine());
                String[] str = br.readLine().split(" ");
                List<Integer> temp = new ArrayList<>();
                for(int i = 0; i < m; i++){
                    temp.add(Integer.parseInt(str[i]));
                }
                arr.add(temp);
            }
            solve(arr);
        }

    }
}