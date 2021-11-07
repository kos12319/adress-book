package com.company;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Contact> addresslist= new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        //διμιουργία desearilization για φόρτωση λίστας
        try {
            FileInputStream in = new FileInputStream("addressbook.out");
            ObjectInputStream ois = new ObjectInputStream(in);
            addresslist = (ArrayList<Contact>) (ois.readObject());
        } catch (Exception e) {
            System.out.println("Problem serializing: " + e);
        }//διμιουργία μενού
        while (true) {
            System.out.println("Please enter a choise: ");
            System.out.println("1.Insert a new contact");
            System.out.println("2.View contacts");
            System.out.println("3.Search contact by name");
            System.out.println("4.Edit contact by name");
            System.out.println("5.Delete contact by name");
            System.out.println("6.Exit Address Book");
            String userInput = scanner.nextLine();
            if (userInput.equals("1")) {
                Insert.insert(addresslist);
            }
            else if (userInput.equals("2")) {
                View.view(addresslist);
            }
            else if (userInput.equals("3")) {
                Search.search(addresslist);
            }
            else if (userInput.equals("4")) {
                Edit.edit(addresslist);
            }
            else if (userInput.equals("5")){
                Delete.delete(addresslist);
            }
            else if (userInput.equals("6")){
                ExitSave.exit(addresslist);
                break;
            }
    }}}