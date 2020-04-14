//****************************
// ContactList.java
//****************************

import java.util.Collections;
import java.util.ArrayList;

public class ContactList {
    private ArrayList<Contact> contacts;  

    // Constructor to create an empty list
    public ContactList() {
        contacts = new ArrayList<Contact>();
    }

    public int add(Contact newEntry) {
        int index = Collections.binarySearch(contacts,newEntry);
        if(index < 0) {
            index = -(index+1);
            contacts.add(index,newEntry);
        }
        return index;
    }

    public void addAll(ContactList additionalContacts) {
        for(int i = 0; i < additionalContacts.size(); i++) {
            add(additionalContacts.get(i));
        }
    }
    
    public Contact get(int index) {
        if(index < contacts.size()) {
            return contacts.get(index);
        }
        return null;
    }
    
    void sort() {
        Collections.sort(contacts);
    }

    public void display() {
        for(Contact c : contacts) {
            System.out.println(c) ; // uses Contact toString method to format output
        }
    }

    public String nameOfIncomingCaller(String incomingNumber) {
        for(Contact c : contacts) {
            if(c.getNumber().compareTo(incomingNumber) == 0) {
                return c.getName();
            }
        }
        return null;
    }
    
    public String nameForDialledNumber(String dialledNumber) {
        for(Contact c : contacts) {
            if(c.getNumber().compareTo(dialledNumber) == 0) {
                return c.getName();
            }
        }
        return null;
    } 
    
    public String toString() {
        return contacts.toString();
    }
    
    public int size() {
        return contacts.size();
    }
}

