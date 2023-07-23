
public class Main {
    public static void main(String[] args) {
        int balance = 100;  // остаток на счету
        int recharge = 1100; //пополнили счет
        int kofBonus = 100; // коэфициент для расчета бонуса
        System.out.println("На вашем счету было: " + balance + " руб.");
        System.out.println("Вы пополнили счет на: " + recharge + " руб.");
        int bonus;
        if (recharge > 1000) {
            bonus = recharge / kofBonus;
            System.out.println("Ваш бонус:" + bonus + " руб.");
            System.out.println("Итоговый остаток на вашем счету: " + (balance + recharge + bonus) + " руб.");
        } else {
            System.out.println("Ваш бонус 0 руб.");
            System.out.println("Итоговый остаток на вашем счету: " + (balance + recharge) + " руб.");
        }


    }
}