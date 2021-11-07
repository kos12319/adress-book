package com.company;

import java.util.ArrayList;
import java.util.Scanner;
//μέθοδος αναζήτησης επαφής βάση ονόματος
public class Search {
    public static void search (ArrayList<Contact> addresslist){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a fullname to search");
        String x= scanner.nextLine();//χρήση μεταβλητής x για αναζήτηση επαφής μέσω ονόματος
        Contact temp = null;
        for(Contact c : addresslist){
            if(c.getName() != null && c.getName().contains(x)){
                System.out.println(c.getName());
                temp=c;
            }
        }if (temp!=null){
            System.out.println("Contact found");
        }
        else {
            System.out.println("Contact does not exist");
        }
    }
}
