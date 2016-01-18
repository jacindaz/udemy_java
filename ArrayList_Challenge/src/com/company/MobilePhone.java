package com.company;
import java.util.ArrayList;

/**
 * Created by jacindazhong on 1/16/16.
 */
public class MobilePhone {
    // has ArrayList of Contacts
    //
    // Add a menu of options that include:
    //   - store, modify, remove, query
    //   - contact names
    //
    // MobilePhone should do everything with Contact objects only
    // be sure not to expose the inner workings of the ArrayList to MobilePhone
    //   e.g. no ints, no .get(i)

    // if I wanted it to be an array of Contact names (that are strings),
    // can create ArrayList like this:
    // private ArrayList<String> contactsListStrings = new ArrayList<String>();

    private ArrayList<Contact> contactsList;
    public MobilePhone() {
        contactsList = new ArrayList<Contact>();
    }

    public void addContact(String newName, String newPhone) {
        contactsList.add(new Contact(newName, newPhone));
    }

    public void removeContact(String fieldToModify, String fieldValue) {
        int contactIndex = findContactIndex(fieldToModify, fieldValue);

        if(contactIndex != -1 ) {
            contactsList.remove(contactsList.get(contactIndex));
        } else {
            System.out.println("\nI'm sorry, that contact does not exist.");
        }
    }

    public void modifyContact(String fieldToModify, String fieldOldValue, String fieldNewValue) {
        int oldContactIndex = findContactIndex(fieldToModify, fieldOldValue);

        if(oldContactIndex != -1) {
            if(fieldToModify.equals("name")) {
                contactsList.get(oldContactIndex).setName(fieldNewValue);
            } else if(fieldToModify.equals("phoneNumber")) {
                contactsList.get(oldContactIndex).setPhoneNumber(fieldNewValue);
            }
        } else {
            System.out.println("Sorry, we did not find a matching contact to modify.");
        }
    }

    public int findContactIndex(String fieldName, String fieldValue) {
        for(int i = 0; i < contactsList.size(); i++) {
            if(fieldName.equals("name") && contactsList.get(i).getName().equals(fieldValue)) {
                return i;
            } else if(fieldName.equals("phoneNumber") && contactsList.get(i).getPhoneNumber().equals(fieldValue)) {
                return i;
            }
        }
        return -1;
    }

    public void printContacts() {
        if(contactsList.size() == 0) {
            System.out.println("There are no contacts yet!");
        } else {
            System.out.println();
            for(int i = 0; i < contactsList.size(); i++) {
                Contact currentContact = contactsList.get(i);
                System.out.println("Contact " + (i + 1) + ": " + currentContact.getName() + " (phone: " + currentContact.getPhoneNumber() + ")");
            }
            System.out.println();
        }
    }

    public ArrayList<Contact> getContactsList() {
        return contactsList;
    }
}

