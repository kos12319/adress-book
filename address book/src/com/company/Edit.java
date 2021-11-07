package com.company;

import java.util.ArrayList;
import java.util.Scanner;
//μέθοδος επεξεργασίας επαφής
public class Edit {
    public static void edit (ArrayList<Contact> addresslist){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give full name to edit");
        String x= scanner.nextLine();
        Contact temp = null;
        //ψαξιμο επαφής στη λιστα μεσω temp
        for(Contact c : addresslist){
            if(c.getName() != null && c.getName().contains(x)) {
                temp=c;
                System.out.println("Give a full name");
                temp.setName(scanner.nextLine());
                System.out.println(" Give a phone number");
                String y= scanner.nextLine();
                temp.setPhoneNumber(Integer.parseInt(y));
                System.out.println("Give an address");
                temp.setAddress(scanner.nextLine());
                System.out.println("Give a birthdate");
                temp.setBirthDate(scanner.nextLine());
                System.out.println("Give an email");
                temp.setEmail(scanner.nextLine());


                System.out.println("Contact has been edited");
            }
        }
        if (temp!=null){System.out.println("Full Name:"+temp.getName());
            System.out.println("Address:"+temp.getAddress());
            System.out.println("Birthdate:"+temp.getBirthDate());
            System.out.println("Email:"+temp.getEmail());
            System.out.println("Phone number"+temp.getPhoneNumber());
        }
        else {
            System.out.println("no contact");
        }
    }
}
