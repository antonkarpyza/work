package lecture.week2.loop.exercise;

/*
Даны 2 числа. Напишите программу, чтобы найти значение одного числа, возведенного в степень другого.
Используйте цикл for.
*/

public class Exercise3For {

    public static void main(String[] args) {
        int s=1;


        for(int a = 3, b = 4; b>0 ; b--){
            s*=a;

        }
        System.out.println(s);
    }

}
