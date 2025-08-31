import java.io.*;
import java.util.*;

public class fourteen {

    public static void solve(int n, int[] s) {
        List<List<Integer>> groups = new ArrayList<>();
        List<Integer> currentGroup = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (currentGroup.isEmpty() || s[i] == s[currentGroup.get(0)]) {
                currentGroup.add(i);
            } else {
                groups.add(new ArrayList<>(currentGroup));
                currentGroup.clear();
                currentGroup.add(i);
            }
        }

        if (!currentGroup.isEmpty()) {
            groups.add(currentGroup);
        }

        int[] res = new int[n];

        for (List<Integer> group : groups) {
            int size = group.size();
            if (size == 1) {
                System.out.println(-1);
                return;
            }

            for (int i = 0; i < size; i++) {
                int from = group.get(i);
                int to = group.get((i + 1) % size);
                res[from] = to + 1; 
            }
        }

        for (int val : res) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] parts = br.readLine().trim().split(" ");
            int[] s = new int[n];
            for (int i = 0; i < n; i++) {
                s[i] = Integer.parseInt(parts[i]);
            }
            solve(n, s);
        }
    }
}
