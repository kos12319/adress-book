package com.company;

import java.util.ArrayList;
//μέθοδος προβολής επαφών
public class View {
    public static void view(ArrayList<Contact> addresslist){
        for (Contact c : addresslist){
            System.out.println("Full Name:"+c.getName());
            System.out.println("Address:"+c.getAddress());
            System.out.println("Birthdate:"+c.getBirthDate());
            System.out.println("Email:"+c.getEmail());
            System.out.println("Phone number:"+c.getPhoneNumber());
            System.out.println("-------------------------------");
        }
    }
}
