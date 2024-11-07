package homeworksss.homework24.system1;

//
//Task 2
//Платежные системы
//Создайте интерфейс PaymentSystem с методами:

//withdrawMoney(double amount) (снятие со счета) - списываются деньги со счета
//depositTransfer(double amount) (поступление денег на счет);
//checkBalance() (остаток на счете).

//Напишите классы BankAccount и ElectronicWallet, которые реализуют данный интерфейс.

//Банк предоставляет счета, например, в евро, а электронный кошелек в другой валюте

//Убедитесь, что каждый класс корректно выполняет каждую из операций.


public class BankApplication {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(10000, "ABank");

        System.out.println(bankAccount);

        bankAccount.withdrawMoney(100000);
        System.out.println(bankAccount.checkBalance());

        bankAccount.withdrawMoney(150);
        bankAccount.depositTransfer(50000);
        System.out.println(bankAccount.checkBalance());

        homeworksss.homework24.system1.ElectronicWallet wallet = new homeworksss.homework24.system1.ElectronicWallet(2, "Bin wallet");
        System.out.println(wallet);

        wallet.withdrawMoney(.5);
        System.out.println(wallet.checkBalance());

    }
}

















