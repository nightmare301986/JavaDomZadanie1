/*Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69. 
Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет. 
Под знаками вопросов - одна и та же цифра. 
Ввод: 2? + ?5 = 69 
Вывод: 24+45=69*/

import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите сумму (например: 2?+?5=69): ");                //Приглашение ко вводу и т.д.
        String summa = in.nextLine().replaceAll("\\s+", "");
        String strArray[] = new String[10];
        for (int i = 0; i <= 9; i++) {                                            //Формирование массива предполагемых сумм
            String newString2 = summa.replace('?', Character.forDigit(i, 10));
            strArray[i] = newString2;
        }

        int schet1 = 0;
        for (int i = 0; i <= strArray.length - 1; i++) {                         //Работа со сформированным массивом

            String[] ws = strArray[i].split("\\+|-|=");                    //Деление на числа всех сумм (элементов массива)
            String l1 = ws[0].toString();
            int ln = Integer.parseInt(l1);
            String l2 = ws[1].toString();
            int ln2 = Integer.parseInt(l2);
            String l3 = ws[2].toString();
            int ln3 = Integer.parseInt(l3);
            if (ln + ln2 == ln3 | ln3 - ln2 == ln | ln3 - ln == ln2) {          //Поиск верной суммы
                System.out.println("Искомая сумма найдена! - ");
                System.out.println(strArray[i]);
                schet1++;
            }
            if (schet1 == 0 && i == strArray.length - 1) {                      //Вывод сообщения при отсутствии решения
                System.out.println("Решений у данной суммы нет!");
            }
        }

        in.close();
    }
}