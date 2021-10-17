public class Main {
    public static void main(String[] args) {
        int clientsAccount = 300;
        int deposit = 2000;
        int bonusGift = 1;
        int gift = 100;

        int total;
        int bonus;

        if (deposit >= 1000) {
            bonus = deposit / gift * bonusGift;
            total = clientsAccount + bonus + deposit;
        }
        else {
            bonus = 0;
            total = clientsAccount + deposit;
        }
        System.out.println("Количество бонусных рублей = " + bonus);
        System.out.println("Итоговый счет клиента = " + total);
    }
}
