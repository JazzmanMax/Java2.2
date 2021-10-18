public class Main {
    public static void main(String[] args) {
        int clientsAccount = 300;
        int deposit = 20_000;
        int bonusGift = 1;
        int gift = 100;

        int total;
        int bonus;

        if (deposit >= 1000) {
            bonus = deposit / gift * bonusGift;
                    }
        else {
            bonus = 0;
            }

        total = clientsAccount + bonus + deposit;

        System.out.println("Количество бонусных рублей = " + bonus);
        System.out.println("Итоговый счет клиента = " + total);
    }
}
