
/* Задача 4 Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
        Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
        ННч ММмин SSc.*/
package by.epam.learn.main;
import java.util.Scanner;
public class LearnMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int time;
        time = in.nextInt();
        int timeHours = time / 3600;
        int timeMinutes = (time - timeHours * 3600) / 60;
        int timeSeconds = time - timeHours * 3600 - timeMinutes * 60;
        System.out.println(timeHours + " H " + timeMinutes + " M " + timeSeconds + " S");
    }
}
/* Задача 5
        Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
        Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
        ННч ММмин SSc.*/
