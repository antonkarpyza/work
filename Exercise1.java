package lecture.week2.array.exercise;

/*
Задание 14 из тетради.
В задаче на поиск максимальной оценки, вывести не саму оценку, а ее номер.
*/

public class Exercise1 {

    public static void main(String[] args) {

        int x[]={5,2,10,4,0,6,3};
        int max=0;
        int maxind=0;

        for(int a=0;a<x.length;a++){

            if(x[a]>max){
                max=x[a];

                maxind=a;
            }
        }
        System.out.println(maxind);
    }
}
