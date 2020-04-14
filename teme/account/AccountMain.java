package com.java.training.d03.teme.account;

public class AccountMain {
    public static void main(String[] args) {

        User user = new User("bank", "Ana","156An3A", "ana@gmail.com");
        User user1 = new User("email", "George", "hdjadh", "georg@yahoo.com");
        Admin admin = new Admin("admin", "Admin", "***","-");



        System.out.println(admin.toString());
        System.out.println(user.toString());
        user.displayBasic();
        admin.displayBasic();

        hashCode(user, admin);
        System.out.println(user.equals(user));
        System.out.println(user1.equals(user));

        System.out.println(user instanceof User);
        System.out.println(admin instanceof Admin);


        AbstractAccount abs = (AbstractAccount) user;
        abs.displayBasic();

    }

    private static void hashCode(User user, Admin admin) {
        System.out.println(user.hashCode());
        System.out.println(admin.hashCode());
    }


}
