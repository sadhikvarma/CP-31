import java.io.*;

public class UnitArray{
    
    public static void solve(int n, int[] arr,int count_1, int count_2) {
        int flips = 0;
       if(count_1 < count_2){
            flips = (count_2 - count_1 + 1) / 2;
            count_1 += flips;
            count_2 -= flips;
       }
       if(count_2%2 != 0){
            flips++; 
            count_1++;
            count_2--;
       }
       System.out.println(flips);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] parts = br.readLine().trim().split(" ");
            int[] arr = new int[n]; 
            int count_1 = 0, count_2 = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(parts[i]);
                if (arr[i] == 1) {
                    count_1++;
                } else {
                    count_2++;
                }
            }

            solve(n, arr , count_1,count_2);
        }
        
    }
}