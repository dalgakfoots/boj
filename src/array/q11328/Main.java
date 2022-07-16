package array.q11328;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int[] arr = new int[26];
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            String origin = st.nextToken();
            for (int j = 0; j < origin.length(); j++) {
                int charAt = origin.charAt(j) - 'a';
                arr[charAt]++;
            }

            String after = st.nextToken();

            int cnt = 0;
            for (int j = 0; j < after.length(); j++) {
                int charAt = after.charAt(j) - 'a';
                if(arr[charAt] > 0) {
                    cnt++;
                    arr[charAt]--;
                } else {
                    cnt--;
                }
            }

            if (cnt == origin.length()) {
                sb.append("Possible").append("\n");
            } else {
                sb.append("Impossible").append("\n");
            }

        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
