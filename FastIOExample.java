import java.io.*;
import java.util.StringTokenizer;

public class FastIOExample {
    public static void main(String[] args) throws IOException {
        // Fast input setup
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Fast output setup
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        // Reading a single integer
        int n = Integer.parseInt(br.readLine());

        // Reading a line of space-separated integers
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // Sample processing: print squares of all numbers
        out.println("Squares of the input numbers:");
        for (int num : arr) {
            out.println(num * num);
        }

        // Always flush and close the writer
        out.flush();
        out.close();
        br.close();
    }
}
