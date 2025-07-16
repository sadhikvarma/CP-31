import java.io.*;

public class TargetPractice {
    public static void solve(String[][] arr,int[][] harcoded){
        int score = 0;
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                if(arr[i][j].equals("X"))
                    score += harcoded[i][j];
            }
        }
        System.out.println(score);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] hardcoded = {
            {1,1,1,1,1,1,1,1,1,1},
            {1,2,2,2,2,2,2,2,2,1},
            {1,2,3,3,3,3,3,3,2,1},
            {1,2,3,4,4,4,4,3,2,1},
            {1,2,3,4,5,5,4,3,2,1},
            {1,2,3,4,5,5,4,3,2,1},
            {1,2,3,4,4,4,4,3,2,1},
            {1,2,3,3,3,3,3,3,2,1},
            {1,2,2,2,2,2,2,2,2,1},
            {1,1,1,1,1,1,1,1,1,1}
        };
        String arr[][] = new String[10][10];
        int t = Integer.parseInt(br.readLine().trim());

        while(t-- > 0){
            for (int i = 0; i < 10; i++) {
            String line = br.readLine(); // Read the entire line for the current row
                for (int j = 0; j < 10; j++) {
                    arr[i][j] = String.valueOf(line.charAt(j)); 
                }
            }
            solve(arr,hardcoded);
        }
    }
}
