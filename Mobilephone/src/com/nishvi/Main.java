package com.nishvi;

import java.util.Scanner;

public class Main {
public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        boolean quit = false;
        mobilePhone mobile = new mobilePhone();
        System.out.println("////////////*********Process starts**********////////////");
        menu();
        while(!quit) {
            System.out.println("******//// Enter Your Choice////*****\nPress 7 to display menu");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 0:
                    System.out.println("Process shutting down");
                    quit=true;
                    break;
                case 1:
                    System.out.println("Enter the name");
                    String name = sc.nextLine();
                    System.out.println("Enter the phoneNumber");
                    String phoneNumber = sc.nextLine();
                    int z= mobile.findContact(name);
                    if(z<0) {
                        mobile.addContact(name, phoneNumber);
                    }
                    else
                        System.out.println("Contact already exists with name "+name);
                    break;
                case 2:
                        System.out.println("Enter the existing name");
                        String existingName = sc.nextLine();
                        int x = mobile.findContact(existingName);
                        if (x < 0)
                            System.out.println("No existing Contact with name " + existingName + ". Add a new contact by pressing 1");
                        else {
                            System.out.println("Enter the new name");
                            String newName = sc.nextLine();
                            System.out.println("Enter the new phoneNumber");
                            String newPhoneNumber = sc.nextLine();
                            int y = mobile.findContact(newName);
                            if (y < 0) {
                                Contact newContact = new Contact(newName, newPhoneNumber);
                                mobile.updateContacts(x, newContact);
                            } else
                                System.out.println("Contact name" + newName + " is already found in the list. So, Choose another name");
                        }
                    break;
                case 3:
                    System.out.println("Enter the name to search");
                    String searchName = sc.nextLine();
                    int a = mobile.findContact(searchName);
                    if(a>=0)
                        System.out.println(searchName+" is Exists at position "+ a+1);
                    else
                        System.out.println(searchName + "does not exists in the contact list");
                    break;
                case 4:
                    System.out.println("The List of Contact:\n");
                    mobile.printContact();
                    break;
                case 5:
                    mobile.totalContacts();
                    break;
                case 6:
                    System.out.println("Enter the contact name to delete");
                    String DeleteName = sc.nextLine();
                    int d = mobile.findContact(DeleteName);
                    if(d>=0){
                        mobile.removeContact(d);
                    }
                    else
                        System.out.println("Contact does not found");
                    break;
                case 7:
                    menu();
            }
        }

    }
    public static void menu() {
        System.out.println("Press the required option\n1-> Add a new contact\n2-> Update the existing contact\n3-> Search a contact\n" +
                "4-> print the contacts\n5-> Total contacts\n6-> Delete the contact\n");
    }
}