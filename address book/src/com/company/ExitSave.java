package com.company;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
//Διμιουργία μεθόδου exit και serialization
public class ExitSave {
    public static void exit (ArrayList<Contact> addresslist){
        System.out.println("Exiting program");
        try {
            FileOutputStream out = new FileOutputStream("addressbook.out");
            ObjectOutputStream oos = new ObjectOutputStream(out);
            oos.writeObject(addresslist);
            oos.flush();
        } catch (Exception e) {
            System.out.println("Problem serializing: " + e);
        }
    }
}
