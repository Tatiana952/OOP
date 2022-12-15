/*
Прошу вас написать приложение, которое хранит информацию о фильмах
и позволяет получaть все детали о них.
+реализовать поиск по части имени фильма

Основа: проектирование
в конце семинара объяснение
 */

import java.util.Scanner;

public class Programm {
    public static void main(String[] args) throws Exception{
        Scanner s = new Scanner(System.in);
        boolean flag =true;
        while(flag == true) {
            System.out.println("\nChoose mode.\n1.Find info about film\n2.Add new film\n3.View database");
            System.out.print("Mode: ");
            int mode = s.nextInt();
            System.out.println();
            if (mode == 1) {
                Base.FindInfo();
            } else if (mode == 2) {
                GetFilmData.getFilmAL();
            } else if (mode == 3) {
                Base.PrintBase();

            } else {
                System.out.println("Error");
            }

            System.out.print("\nDo you want anything else?\n1 - Yes      2 - No\n");
            int els = s.nextInt();
            if (els == 2) {
                flag = false;
                System.out.println("Bye! Have a nice day!");
            }
        }

    }

}
