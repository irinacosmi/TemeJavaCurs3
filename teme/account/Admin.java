package com.java.training.d03.teme.account;

public class Admin extends AbstractAccount {
    public Admin(String typeOfAccount, String name, String password, String email) {
        super(typeOfAccount, name, password, email);
    }

    @Override
    public void displayBasic() {
        System.out.println("Admmin is " + getName());
    }
}
