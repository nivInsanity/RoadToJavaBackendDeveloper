package MobilePhoneContacts;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MobilePhoneTest {

    @Test
    void addNewContactTest() {
        MobilePhone mobilePhone = new MobilePhone("123456789");
        Contact contact = Contact.createContact("Alice", "31415926");

        boolean added = mobilePhone.addNewContact(contact);
        assertTrue(added, "Adding a Contact.createContact should return true.");

        boolean duplicateAdded = mobilePhone.addNewContact(contact);
        assertFalse(duplicateAdded, "Adding a duplicate contact should return false.");
    }

    @Test
    void removeContactTest() {
        MobilePhone mobilePhone = new MobilePhone("123456789");
        Contact contact = Contact.createContact("John", "12345678");
        mobilePhone.addNewContact(contact);

        boolean removed = mobilePhone.removeContact(contact);
        assertTrue(removed, "Removing an existing contact should return true.");

        boolean removeNonExistent = mobilePhone.removeContact(contact);
        assertFalse(removeNonExistent, "Removing a non-existent contact should return false.");
    }

    @Test
    void updateContactTest() {
        MobilePhone mobilePhone = new MobilePhone("123456789");
        Contact oldContact = Contact.createContact("Alice", "31415926");
        Contact newContact = Contact.createContact("Alice", "27182818");

        mobilePhone.addNewContact(oldContact);

        boolean updated = mobilePhone.updateContact(oldContact, newContact);
        assertTrue(updated, "Updating an existing contact should return true.");

        Contact queriedContact = mobilePhone.queryContact("Alice");
        assertNotNull(queriedContact, "The updated contact should exist.");
        assertEquals("27182818", queriedContact.getPhoneNumber(), "The phone number should be updated.");

        boolean updateNonExistent = mobilePhone.updateContact(
                Contact.createContact("Bob", "16180339"),
                Contact.createContact("Bob", "14142135")
        );
        assertFalse(updateNonExistent, "Updating a non-existent contact should return false.");
    }

    @Test
    void queryContactTest() {
        MobilePhone mobilePhone = new MobilePhone("123456789");
        Contact contact = Contact.createContact("Michael", "11223344");

        mobilePhone.addNewContact(contact);

        Contact queriedContact = mobilePhone.queryContact("Michael");
        assertNotNull(queriedContact, "Queried contact should not be null.");
        assertEquals("Michael", queriedContact.getName(), "The name should match.");
        assertEquals("11223344", queriedContact.getPhoneNumber(), "The phone number should match.");

        Contact nonExistentContact = mobilePhone.queryContact("Haley");
        assertNull(nonExistentContact, "Querying a non-existent contact should return null.");
    }

    @Test
    void printContactsTest() {
        MobilePhone mobilePhone = new MobilePhone("123456789");

        mobilePhone.addNewContact(Contact.createContact("Sarah", "44332211"));
        mobilePhone.addNewContact(Contact.createContact("David", "99887766"));

        mobilePhone.printContacts();
    }
}