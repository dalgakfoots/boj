package array.q3273;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] strArrN = br.readLine().split(" ");
        int[] intArr = new int[n];
        for(int i =0;i<n;i++) intArr[i] = Integer.parseInt(strArrN[i]);

        int x = Integer.parseInt(br.readLine());

        int index=0;
        Arrays.sort(intArr); // 이진 검색 사용을 위한 정렬
        for(int i=0;i<n;i++) index+=Arrays.binarySearch(intArr,(x-intArr[i]))>=0 ? 1:0;
        System.out.println(index/2);
    }
}
