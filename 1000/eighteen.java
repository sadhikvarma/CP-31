import java.io.*;

public class eighteen{
    public static void solve(int w, int h, long[][] sides) {
        long maxArea = 0;

        long[] bottom = sides[0];
        maxArea = Math.max(maxArea, (bottom[bottom.length - 1] - bottom[0]) * h);

        long[] top = sides[1];
        maxArea = Math.max(maxArea, (top[top.length - 1] - top[0]) * h);

        long[] left = sides[2];
        maxArea = Math.max(maxArea, (left[left.length - 1] - left[0]) * w);

        long[] right = sides[3];
        maxArea = Math.max(maxArea, (right[right.length - 1] - right[0]) * w);

        System.out.println(maxArea);
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while(t-- > 0){
            String[] dims = br.readLine().trim().split(" ");
            int w = Integer.parseInt(dims[0]);
            int h = Integer.parseInt(dims[1]);

            long[][] sides = new long[4][];
            for (int i = 0; i < 4; i++) {
                String[] parts = br.readLine().trim().split(" ");
                int k = Integer.parseInt(parts[0]);
                long[] coords = new long[k];
                for (int j = 0; j < k; j++) {
                    coords[j] = Long.parseLong(parts[j + 1]);
                }
                sides[i] = coords;
            }

            solve(w, h, sides);
        }
    }
}

