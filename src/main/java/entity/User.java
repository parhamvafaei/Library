package entity;

import java.time.LocalDate;

public class User extends Person{
    private double wallet;
    private boolean isAcctive;
    private LocalDate createAccount;

    public User(int id, String name, Role role , double wallet, boolean isAcctive, LocalDate createAccount) {
        super(id , name , role );
        this.wallet = wallet;
        this.isAcctive = isAcctive;
        this.createAccount = createAccount;
    }
    public User(){

    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public boolean isAcctive() {
        return isAcctive;
    }

    public void setAcctive(boolean acctive) {
        isAcctive = acctive;
    }

    public LocalDate getCreateAccount() {
        return createAccount;
    }

    public void setCreateAccount(LocalDate createAccount) {
        this.createAccount = createAccount;
    }

}
