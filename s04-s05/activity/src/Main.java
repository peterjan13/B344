public class Main {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();

        Contact contact1 = new Contact("John Doe", "+639152468596", "my home in Quezon City");
        contact1.addContactNumber("+639228547963");
        contact1.addAddress("my office in Makati City");

        Contact contact2 = new Contact("Jane Doe", "+639162148573", "my home in Caloocan City");
        contact2.addContactNumber("+639173698541");
        contact2.addAddress("my office in Pasay City");

        phonebook.addContact(contact1);
        phonebook.addContact(contact2);

        for (Contact contact : phonebook.getContacts()) {
            System.out.println(contact.getName());
            System.out.println(contact.getName() + " has the following registered numbers:");
            for (String contactNumber : contact.getContactNumbers()) {
                System.out.println(contactNumber);
            }
            System.out.println(contact.getName() + " has the following registered addresses:");
            for (String address : contact.getAddresses()) {
                System.out.println(address);
            }
        }
    }
}
