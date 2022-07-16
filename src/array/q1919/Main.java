package array.q1919;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26];

        String first = br.readLine();
        for (int i = 0; i < first.length(); i++) {
            int charAt = first.charAt(i) - 'a';
            arr[charAt]++;
        }

        String second = br.readLine();
        for (int i = 0; i < second.length(); i++) {
            int charAt = second.charAt(i) - 'a';
            arr[charAt]--;
        }

        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                if(arr[i] < 0) cnt += arr[i] * -1;
                else cnt += arr[i];
            }
        }

        System.out.println(cnt);
    }
}
