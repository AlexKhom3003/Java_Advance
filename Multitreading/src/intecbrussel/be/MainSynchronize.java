package intecbrussel.be;

public class MainSynchronize {
    public static void main(String[] args) {
        ExampleSynchronize2 bankrekening = new ExampleSynchronize2();

        Thread salarisToevoegen = new Thread(() -> {
            try {
                Thread.sleep(1000);
                bankrekening.addAmountPerMonth(3500);
                System.out.println("Salaris toevoegd. ");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        //Thread2:
        Thread rekenIngenBetalen = new Thread(() -> {
            bankrekening.payBills(1000);
            System.out.println("Rekeningen betaald. ");
        });
        salarisToevoegen.start();
        rekenIngenBetalen.start();

        try {
            salarisToevoegen.join();
            rekenIngenBetalen.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Bankrekening Status: ");
        System.out.println("Totaal Geld " + bankrekening.getMoneyBankAccount());
        System.out.println("Genoeg Geld aanwezig? " + bankrekening.isEnoughOnBankAccount());
    }
}
