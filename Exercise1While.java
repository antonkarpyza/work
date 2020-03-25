package lecture.week2.loop.exercise;

/*
Напишите программу для суммирования  чисел от 1 до 100, которые делятся на 7.
Выведите сумму. Используйте цикл while.
*/

public class Exercise1While {

    public static void main(String[] args) {

        int sum=0;

        int i=1;

        while(i<100){

            if(i%7==0){

                sum += i;
            }

                i++;

        }
        System.out.println(sum);
    }

}
