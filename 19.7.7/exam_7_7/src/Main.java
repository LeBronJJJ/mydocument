import java.util.LinkedList;
import java.util.Scanner;

/**
 * 输入一段英文 将其反向输出
 * exm: i am ironman
 * ironman am i
 */


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        //testing the input's format
        // System.out.println(str + "\n");

        String[] strs = str.split(" ");
        for (int i = strs.length - 1;i>0;i--){
            System.out.print(strs[i]+" ");
        }
        System.out.print(strs[0]);

    }
}
