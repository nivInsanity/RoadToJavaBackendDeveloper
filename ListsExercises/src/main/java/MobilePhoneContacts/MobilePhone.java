package MobilePhoneContacts;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String phoneNumber) {
        this.myNumber = phoneNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {
        if (contact == null) {
            return false;
        }

        if (findContact(contact) != -1) {
            System.out.printf("Contact " + contact.getName() + " already exists!\n");
            myContacts.add(contact);
            return false;
        } else {
            myContacts.add(contact);
            return true;
        }
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        if (oldContact == null) {
            return false;
        }

        int contactIndex = findContact(oldContact);
        if (contactIndex == -1) {
            System.out.println("Contact " + oldContact.getName() + " not found!");
            return false;
        } else {
            myContacts.set(findContact(oldContact), newContact);
            return true;
        }
    }

    public boolean removeContact(Contact contact) {
        if (contact == null) {
            return false;
        }

        int contactIndex = findContact(contact);
        if (contactIndex == -1) {
            System.out.println("Contact " + contact.getName() + " not found!");
            return false;
        } else {
            myContacts.remove(contactIndex);
            return true;
        }
    }

    private int findContact(Contact contact) {
        for (int contactIndex = 0; contactIndex < myContacts.size(); contactIndex++) {
            if (myContacts.get(contactIndex).getName().equals(contact.getName())) {
                return contactIndex;
            }
        }
        return -1;
    }

    private int findContact(String contact) {
        for (int contactIndex = 0; contactIndex < myContacts.size(); contactIndex++) {
            if (myContacts.get(contactIndex).getName().equals(contact)) {
                return contactIndex;
            }
        }
        return -1;
    }

    public Contact queryContact(String name) {
        if (findContact(name) != -1) {
            return myContacts.get(findContact(name));
        } else {
            return null;
        }
    }

    public void printContacts() {
        System.out.println("Contact List:");
        int iterator = 1;

        for (Contact contact : myContacts) {
            System.out.println(iterator + ". " + contact.getName() + " -> " + contact.getPhoneNumber());
            iterator++;
        }
    }
}
