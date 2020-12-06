package jp.tkugimot.gofdesignpatternjava.templatemethod;

public class BankAccount {
    private String bankCode;
    private String bankBranchCode;
    private String bankAccountNumber;

    public BankAccount(
            String bankCode,
            String bankBranchCode,
            String bankAccountNumber
    ) {
        this.bankCode = bankCode;
        this.bankBranchCode = bankBranchCode;
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getBankCode() {
        return bankCode;
    }

    public String getBankBranchCode() {
        return bankBranchCode;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }
}
