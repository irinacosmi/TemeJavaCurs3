package com.java.training.d03.teme.account;

import java.util.Objects;

public abstract class AbstractAccount {

    private static final String TYPE;
    private static final String NAME;
    private static final String PASSWORD;
    private static final String EMAIL;

    static {

        TYPE = "Type";
        NAME = "Name";
        PASSWORD = "Password";
        EMAIL = "Email";

        System.out.println(TYPE + " " + NAME  + " " + PASSWORD  + " " + EMAIL);
    }

    private final String typeOfAccount;
    private final String name;
    private final String password;
    private final String email;

    public AbstractAccount(String typeOfAccount, String name, String password, String email) {
        this.typeOfAccount = typeOfAccount;
        this.name = name;
        this.password = password;
        this.email = email;
    }

    public String getTypeOfAccount() {
        return typeOfAccount;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public abstract void displayBasic();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractAccount that = (AbstractAccount) o;
        return Objects.equals(typeOfAccount, that.typeOfAccount) &&
                Objects.equals(name, that.name) &&
                Objects.equals(password, that.password) &&
                Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeOfAccount, name, password, email);
    }

    @Override
    public String toString() {
        return typeOfAccount + " " + name  + " " + password + " " + email;
    }
}
