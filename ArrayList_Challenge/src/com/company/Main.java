package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        ArrayList<Contact> testArray = new ArrayList<Contact>();
//        testArray.add(new Contact(){ public String name = "Jacinda"; public String phoneNumber = "111-111-1111"; });
        MobilePhone myPhone = new MobilePhone();
        myPhone.addContact("Jacinda", "123");
        myPhone.addContact("Yvan", "456");
        myPhone.printContacts();

        int choice = 0;
        printMenu();

        while(choice != 5) {
            System.out.println("\nEnter your choice:\n");
            choice = scanner.nextInt();

            // what does this do ???
            // scanner.nextLine();

            switch(choice) {
                case 0:
                    printMenu();
                    break;
                case 1:
                    myPhone.printContacts();
                    break;
                case 2:
                    addContact(myPhone);
                    break;
                case 3:
                    updateContact(myPhone);
                    break;
                case 4:
                    removeContact(myPhone);
                    break;
            }

        }
        System.out.println("\n==========================");
        System.out.println("Thanks for playing!");
        System.out.println("==========================");
    }

    public static void printMenu() {
        // methods:
        //  - quit
        //  - print list of contacts
        //  - add new contact
        //  - update existing contact
        //  - remove contact
        //  - search/find contact
        System.out.println("\nPress: ");
        System.out.println("0 - To print the menu");
        System.out.println("1 - To print the list of contacts");
        System.out.println("2 - To add a new contact");
        System.out.println("3 - To update an existing contact");
        System.out.println("4 - To remove a contact");
        System.out.println("5 - To quit this program");
    }

    public static void addContact(MobilePhone mobilePhoneInstance) {
        System.out.println("\nEnter the new contact's name: ");
        final String contactName = scanner.next();

        System.out.println("\nEnter the new contact's phone number: ");
        final String contactPhone = scanner.next();

        mobilePhoneInstance.addContact(contactName, contactPhone);
    }

    public static void updateContact(MobilePhone mobilePhoneInstance) {
        System.out.println("\nWould you like to find the contact by name or phone number? \nType 'name' or 'phoneNumber'.");
        final String nameOrPhone = scanner.next();

        String contactToModifyValue = "";

        if(nameOrPhone.equals("name")) {
            System.out.println("\nEnter the contact's name that you would like to modify:");
            contactToModifyValue = scanner.next();

            System.out.println("\nEnter the contact's new name: ");
        } else if(nameOrPhone.equals("phoneNumber")) {
            System.out.println("\nEnter the contact's phone number that you would like to modify:");
            contactToModifyValue = scanner.next();

            System.out.println("\nEnter the contact's new phone number: ");
        } else {
            System.out.println("I'm sorry, you did not enter a valid field to modify.");
            return;
        }

        final String contactNewValue = scanner.next();
        mobilePhoneInstance.modifyContact(nameOrPhone, contactToModifyValue, contactNewValue);
    }

    public static void removeContact(MobilePhone mobilePhoneInstance) {
        System.out.println("\nWould you like to find the contact by name or phone number? \nType 'name' or 'phoneNumber'.");
        final String nameOrPhone = scanner.next();

        if(nameOrPhone.equals("name")) {
            System.out.println("\nEnter the contact's name that you would like to remove:");
        } else if(nameOrPhone.equals("phoneNumber")) {
            System.out.println("\nEnter the contact's phone number that you would like to remove:");
        } else {
            System.out.println("I'm sorry, you did not enter a valid field to remove.");
            return;
        }

        final String contactToRemove = scanner.next();
        mobilePhoneInstance.removeContact(nameOrPhone, contactToRemove);
    }
}
