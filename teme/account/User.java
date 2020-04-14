package com.java.training.d03.teme.account;

public class User extends AbstractAccount {
    public User(String typeOfAccount, String name, String password, String email) {
        super(typeOfAccount, name, password, email);


    }

    @Override
    public void displayBasic() {
        System.out.println("Basic information about the account: " + getTypeOfAccount() + " " + getName());
    }
}
