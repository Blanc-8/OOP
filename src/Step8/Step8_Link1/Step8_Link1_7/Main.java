package Step8.Step8_Link1.Step8_Link1_7;
// Моё решение сильно отличается от ответа, но вроде вполне неплохо работает и справляется с задачей даже тогда, когда мы сделаем много
// счетов. Обращение к каждому из них будет с синхронизацией.
public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount(5000);
        BankAccount bankAccount2 = new BankAccount(500);

        new Thread(new Runnable() {
            @Override
            public void run() {
                bankAccount1.addCash(800);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                bankAccount2.addCash(700);
            }
        }).start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                bankAccount1.makeCash(9000);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                bankAccount1.makeCash(800);
            }
        }).start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                bankAccount2.addCash(900);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                bankAccount2.addCash(2000);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                bankAccount2.makeCash(6000);
            }
        }).start();



    }
}
