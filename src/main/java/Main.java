public class Main {
    public static void main(String[] args) {
        int a = 3;
        int b = 6;
//      Арифметика
        int sum = a + b;
        System.out.println("Сложение " + sum);
        int subtr = b - a;
        System.out.println("Вычитание  " + subtr);
        int mult = a * b;
        System.out.println("Умножение " + mult);
        int div = b / a;
        System.out.println("Деление " + div);

//      Сравнение
        boolean j = a < b;
        System.out.println("a<b " + j);
        boolean jj = a > b;
        System.out.println("a>b " + jj);

//      Логические операции
        boolean aa = true;
        boolean bb = false;
        System.out.println(aa && bb);
        System.out.println(aa || bb);
        System.out.println(!aa);

//      Тернарный оператор
        int min = (a > b) ? a : b;
        System.out.println("min = " + min);

//      Переполнение
        byte n = 30;
        byte m = 40;
        System.out.println("Переполнение " + (n * m));

//      Разные типы данных
        double x = 6.66;
        int y = 1;
        System.out.println(x + y);

    }


}
