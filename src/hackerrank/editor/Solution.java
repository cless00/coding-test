package hackerrank.editor;

import java.util.Scanner;
import java.util.Stack;

public class Solution {

    // input:
    //50
    //1 zsfncpxdzl
    //3 4
    //3 6
    //2 1
    //3 7
    //3 2
    //4
    //2 4
    //2 6
    //4
    //4
    //1 l
    //1 hpe
    //3 6
    //2 7
    //4
    //3 6
    //4
    //3 6
    //1 zipsqagri
    //1 vuqxstnj
    //4
    //3 13
    //4
    //3 10
    //3 6
    //1 uzdpy
    //1 bupqp
    //1 kn
    //2 6
    //3 8
    //1 iiuvfbn
    //4
    //2 1
    //2 12
    //4
    //3 7
    //4
    //2 9
    //3 1
    //1 axbhx
    //1 wovbfyvt
    //3 11
    //3 7
    //3 2
    //4
    //1 tjmqp
    //4
    //2 6
    //3 4

    // result:
    //n
    //p
    //x
    //s
    //p
    //p
    //p
    //i
    //l
    //p
    //d
    //x
    //z
    //b
    //x
    //s
    //n

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Editor editor = new Editor();

        Scanner sc = new Scanner(System.in);
        int q = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < q; i++) {
            String line = sc.nextLine();
            int op = Integer.parseInt(line.substring(0, 1));

            if (op == 1) {
                editor.append(line.substring(2));

            } else if (op == 2) {
                editor.delete(Integer.parseInt(line.substring(2)));

            } else if (op == 3) {
                editor.print(Integer.parseInt(line.substring(2)) - 1);

            } else if (op == 4) {
                editor.undo();
            }
        }

        sc.close();
    }

    private static class Editor {
        private Stack<String> text = new Stack<>();

        public Editor() {
            text.push("");
        }

        public void append(String w) {
            text.push(text.peek() + w);
        }

        public void delete(int k) {
            if (text.size() < 1) {
                return;
            }
            String str = text.peek();
            if (str.length() > k) {
                str = str.substring(0, str.length() - k);
            } else {
                str = "";
            }
            text.push(str);
        }

        public void print(int k) {
            String str = text.peek();
            if (str.length() <= k) {
                return;
            }
            System.out.println(str.toCharArray()[k]);
        }

        public void undo() {
            if (text.size() < 2) {
                return;
            }
            text.pop();
        }
    }
}
