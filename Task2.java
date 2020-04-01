package lecture.week3.stringBuffer.excercise;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        StringBuilder mas []=new StringBuilder[3];

        for(int i = 0; i < mas.length;i++){
            System.out.println("Введите слова: ");
            mas[i]=new StringBuilder(scan.nextLine());

        }

    }


}
