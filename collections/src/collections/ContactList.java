package collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ContactList {

    private HashMap<String, Integer> contacts;

    public ContactList() {
        contacts = new HashMap<>();
    }
    public void addContact(String name, Integer phoneNumber) {
        contacts.put(name, phoneNumber);
    }
    public boolean hasKey(String name) {
        return contacts.containsKey(name);
    }
    public boolean hasValue(Integer phoneNumber) {
        return contacts.containsValue(phoneNumber);
    }
   
    public void printContacts() {
        Set<Map.Entry<String, Integer>> entrySet = contacts.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();

        System.out.println("Contact List:");
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("Name: " + entry.getKey() + ", Phone Number: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        ContactList contactList = new ContactList();

     
        contactList.addContact("Alice", 123456789);
        contactList.addContact("Bob", 987654321);
        contactList.addContact("Charlie", 555123456);

        System.out.println("Does Alice exist? " + contactList.hasKey("Alice")); 
        System.out.println("Does David exist? " + contactList.hasKey("David")); 

        System.out.println("Does 123456789 exist? " + contactList.hasValue(123456789)); 
        System.out.println("Does 111222333 exist? " + contactList.hasValue(111222333)); 
        contactList.printContacts();
    }
}

