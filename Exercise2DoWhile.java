package lecture.week2.loop.exercise;

/*
Напишите программу для рассчета произведения чисел от 1 до 10.
Используйте цикл do while.
*/

public class Exercise2DoWhile {

    public static void main(String[] args) {

        int n = 1;
        int sum=1;

        do{
            sum*=n;
            n++;
        }
        while(n<=10);

        System.out.println(sum);
    }

}
