package q201.wordFlip2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String readLine = br.readLine();

        boolean isTag = false;
        StringBuilder result = new StringBuilder();
        StringBuilder forFlip = new StringBuilder();

        for (int i = 0; i < readLine.length(); i++) {
            char target = readLine.charAt(i);

            if (target == '<') isTag = true;

            if (isTag) {
                if(forFlip.length() != 0) {
                    String flip = flip(forFlip.toString());
                    result.append(flip);
                    forFlip = new StringBuilder();
                    result.append(target);
                } else {
                    result.append(target);
                }
            } else {
                if (target == ' ') {
                    String flip = flip(forFlip.toString());
                    result.append(flip).append(target);
                    forFlip = new StringBuilder();
                } else {
                    forFlip.append(target);
                }
            }

            if (i == readLine.length() - 1) {
                String flip = flip(forFlip.toString());
                result.append(flip);
                forFlip = new StringBuilder();
            }

            if (target == '>') isTag = false;
        }

        System.out.println(result);

    }

    public static String flip(String s) {
        Stack<Character> stack = new Stack<>();
        char[] temp = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }

        for (int i = 0; i < s.length(); i++) {
            temp[i] = stack.pop();
        }

        String result = new String(temp);
        return result;
    }

}
