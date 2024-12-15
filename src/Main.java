//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int balance = 10;
        int payment = 1212;

        int percent;
        if (payment >= 1000) {
            percent = 1;
        } else {
            percent = 0;
        }
        // int percent = payment ? 1 : 0;

        int bonus = payment * percent / 100;

        int amount = +balance + payment + bonus;

        System.out.println("Итоговая сумма: " + amount);

        System.out.println("Бонус: " + bonus);
    }
}