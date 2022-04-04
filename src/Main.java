import java.util.Objects;
import java.util.Scanner;

public class Main {
    private static int block = 0;
    private static byte[] array = new byte[30000];
    public static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        translate(input);
    }
    public static void translate(String input) {
        Scanner scan = new Scanner(System.in);
        String cmd;
        String loopedCmd = " ";
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            cmd = input.substring(i, i+1);
            switch (cmd) {

                case ">":
                    block++;
                    break;

                case "<":
                    block--;
                    break;

                case "+":
                    array[block]++;
                    break;

                case "-":
                    array[block]--;
                    break;

                case ".":
                    System.out.print(array[block]);
                    break;

                case ",":
                    array[block] = scan.nextByte();
                    break;

                case "[":
                    // if
                    //{
                    //   array[block]=0;
                    // }
/* inf loop
                    while(loopedCmd.substring(loopedCmd.length() - 1) != "]") {
                        loopedCmd += input.substring(i+1, i+2);
                        count++;
                    }
                    while(array[block] != 0) {
                        translate(loopedCmd.substring(1, loopedCmd.length()-1));
                    }
                    i += count;
                    loopedCmd = " ";

 */
                    break;

                case "]":
                    break;
            }

        }
    }

}
