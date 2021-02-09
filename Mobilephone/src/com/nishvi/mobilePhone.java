package com.nishvi;

import java.util.ArrayList;

public class mobilePhone {
    public ArrayList<Contact> ContactList =new ArrayList<Contact>();
    public void addContact(String name, String number){
        Contact contact = Contact.addContact(name, number);
        ContactList.add(contact);
        System.out.println("Added sucessfully");
    }
    public void printContact(){
        for(int i=0;i<ContactList.size();i++){
            System.out.println(ContactList.get(i).getName()+" -> "+ContactList.get(i).getphoneNumber()+" \r");
        }
    }
    public int findContact(String name){
        for(int i=0;i<ContactList.size();i++){
            Contact contact = ContactList.get(i);
            if(contact.getName().equals(name))
                return i;
        }
        return -1;
    }
    public void updateContacts(int d,Contact newContact){
        ContactList.set(d,newContact);
        System.out.println("Updated successfully");

    }
    public void totalContacts(){
        System.out.println("Total number of contacts : "+ ContactList.size());
    }
    public void removeContact(int index){
        System.out.println(ContactList.get(index).getName()+" with phone number "+ContactList.get(index).getphoneNumber()+" deleted successfully");
        ContactList.remove(index);
    }
}
