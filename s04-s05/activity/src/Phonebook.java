import java.util.ArrayList;

public class Phonebook {
    private ArrayList<Contact> contacts;

    public Phonebook() {
        contacts = new ArrayList<>();
    }

    public Phonebook(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    // Getter and Setter methods
    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public boolean isEmpty() {
        return contacts.isEmpty();
    }
}
