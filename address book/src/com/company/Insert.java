package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Insert {
//μέθοδος προσθήκης επαφής
    public static void insert(ArrayList<Contact> addresslist) {
        Scanner scanner = new Scanner(System.in);
        Contact c1 = new Contact();
        System.out.println("Give a full name:");
        c1.setName(scanner.nextLine()) ;
        System.out.println(" Give a phone number:");
        String x= scanner.nextLine();
        c1.setPhoneNumber(Integer.parseInt(x));
        System.out.println("Give an address:");
        c1.setAddress(scanner.nextLine());
        System.out.println("Give a birthdate(e.g:02/10/1986):");
        c1.setBirthDate(scanner.nextLine());
        System.out.println("Give an email:");
        c1.setEmail(scanner.nextLine());
        addresslist.add(c1);

    }

}