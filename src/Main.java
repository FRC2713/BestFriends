import java.util.Scanner;

public class Main {
    public static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);

        byte[]  array = new byte [30000];
              int block = 0;

            switch (scan.nextByte()){

                case '>' :
                    block++;
                    break ;

                case '<' :
                    block--;
                    break;

                case '+' :
                    array[block]++;
                    break;

                case '-' :
                    array[block]--;
                    break;

                case '.' :
                    System.out.print(array[block]);
                    break ;

                case ','  :
                    array[block]= scan.nextByte();
                    break;

                case '[' :
                   // if
                //{
                 //   array[block]=0;
               // }
                    break;

                case ']' :
                    break;

    }


    }
}
