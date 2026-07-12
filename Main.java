//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        for (int g = 10; g >= 0; g--) {
            System.out.println(g);
        }

        for (int y = 0; y <= 17; y = y + 2) {
            System.out.println(y);
        }
        for (int z = 10; z >= -10; z--) {
            System.out.println(z);
        }

        for (int v = 1904; v < 2096; v = v + 4) {
            System.out.println(v + " год является високосным ");
        }

        for (int q = 7; q <= 98; q = q + 7) {
            System.out.println(q);
        }

        for (int s = 1; s <= 512; s = s * 2) {
            System.out.println(s);
        }

        int salary = 29000;
        int total = 0;
        for (int d = 1; d <= 12; d++) {
            total = total + salary;
            {
                System.out.println("Месяц " + d + " сумма накоплений равна " + total);
            }

        }


        int incomePerMonth = 29000;
        int totalOne = 0;
        for (int u = 1; u <= 12; u++) {
            totalOne += incomePerMonth;
            totalOne += incomePerMonth * 0.01;
            System.out.println("Месяц " + u + " сумма накоплений равна " + totalOne);
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println("2*" + i + "=" + (2 * i));
        }




    }
    }




















