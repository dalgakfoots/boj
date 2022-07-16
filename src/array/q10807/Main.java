package array.q10807;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        ArrayList<Integer> arr = new ArrayList();

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr.add(num);
        }

        int v = Integer.parseInt(br.readLine());

        long count = arr.stream()
                .filter(e -> e == v)
                .count();
        System.out.println(count);
    }
}
