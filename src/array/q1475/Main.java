package array.q1475;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10];

        int n = Integer.parseInt(br.readLine());
        // 6과 9는 혼용 가능
        String s = String.valueOf(n);

        for (int i = 0; i < s.length(); i++) {
            int num = s.charAt(i) - '0';
            if(num == 6) arr[9]++;
            else arr[num]++;
        }

        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > arr[index]) index = i;
        }


        int result = arr[index];

        if(index == 9) {
            int temp = arr[index] % 2 > 0 ? 1 : 0;
            result = (arr[index] / 2) + temp;
        }

        System.out.println(result);
    }
}
