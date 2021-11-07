package com.company;

import java.util.ArrayList;
import java.util.Scanner;
//διμιουργία μεθόδου delete contact
public class Delete {
    public static void delete (ArrayList<Contact> addresslist){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give full name to delete");
        String x= scanner.nextLine();
        Contact temp = null; //ορισμός προσωρινης επαφής για εύρεση επαφής με όνομα
        for(Contact c : addresslist){
            if(c.getName() != null && c.getName().contains(x)) {
                temp=c;

                System.out.println("Contact has been deleted");
            }
        }
        if (temp!=null){addresslist.remove(temp);
        }
        else {
            System.out.println("no contact");
        }
    }
}
