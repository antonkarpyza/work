package lecture.week3.stringBuffer.excercise;

// Задание 1
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        System.out.println("Введите буквы:");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        int wCounter=0;
        int aCounter=0;
        int zCounter=0;


        StringBuilder strBuilder = new StringBuilder(str);

        for (int i = 0;i<str.length();i++){
            if(strBuilder.charAt(i)=='w'){
                wCounter++;
            }  else if (strBuilder.charAt(i) == 'a')
            aCounter++;
            else if (strBuilder.charAt(i) == 'z')
                zCounter++;

        }

        System.out.println("буква w встречается:" + wCounter + " раз");
        System.out.println("буква a встречается:" + aCounter + " раз");
        System.out.println("буква z встречается:" + zCounter + " раз");

    }

}
