package q13300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[][] arr = new int[2][7];


        for (int i = 0; i < N; i++) {
            StringTokenizer inner = new StringTokenizer(br.readLine(), " ");
            int gender = Integer.parseInt(inner.nextToken());
            int grade = Integer.parseInt(inner.nextToken());
            arr[gender][grade]++;
        }

        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
//                System.out.println("arr["+i+"]["+j+"] = " + arr[i][j]);
                int num = arr[i][j];

                int div = num / K;
                int mod = num % K != 0 ? 1 : 0;

                result = result + div + mod;
            }
        }

        System.out.println(result);



    }
}