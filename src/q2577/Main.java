package q2577;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int calc = a * b * c;

        int[] arr = new int[10];

        String temp = String.valueOf(calc);

        for (int i = 0; i < temp.length(); i++) {
            int num = temp.charAt(i) - '0';
            arr[num]++;
        }

        StringBuilder sb = new StringBuilder();

        for (int j : arr) {
            sb.append(j).append("\n");
        }

        System.out.println(sb);


    }
}
