package com.nishvi;

public class Contact {
    public String name;
    public String phoneNumber;

    public Contact (String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getphoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }
    public static Contact addContact(String name,String phoneNumber){
        return new Contact(name,phoneNumber);
    }
}
