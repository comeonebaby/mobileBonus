public class Main {
    public static void main(String[] args) {

        int startBalance = 100; // начальный счет клиента

        int topUpAmount = 2300; // сумма пополнения

        int bonusAmount = 0; // сумма бонуса

        if (topUpAmount > 1000) {

            bonusAmount = (topUpAmount / 100); // расчет суммы бонуса

        }
        int finalBalance = startBalance + topUpAmount + bonusAmount; // итоговый счет

        System.out.println("Итоговый счет: " + finalBalance);
        System.out.println("Бонусные рубли: " + bonusAmount);



    }

}