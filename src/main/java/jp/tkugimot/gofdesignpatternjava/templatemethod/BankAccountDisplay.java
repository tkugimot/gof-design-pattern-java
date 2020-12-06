package jp.tkugimot.gofdesignpatternjava.templatemethod;

public class BankAccountDisplay extends AbstractDisplay {
    private BankAccount bankAccount;

    public BankAccountDisplay(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void open() {
        System.out.println("---bank account open---");
    }

    public void print() {
        System.out.println(
                String.format(
                        "bank-code: %s, bank-branch-code: %s, bank-account-number: %s",
                        bankAccount.getBankCode(),
                        bankAccount.getBankBranchCode(),
                        bankAccount.getBankAccountNumber()
                )
        );
    }

    public void close() {
        System.out.println("---bank account close---");
    }
}
