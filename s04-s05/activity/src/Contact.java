import java.util.ArrayList;

public class Contact {
    private String name;
    private ArrayList<String> contactNumber;
    private ArrayList<String> address;

    public Contact() {
        this.contactNumber = new ArrayList<>();
        this.address = new ArrayList<>();
    }

    public Contact(String name, String contactNumber, String address) {
        this();
        this.name = name;
        this.contactNumber.add(contactNumber);
        this.address.add(address);
    }

    public void addContactNumber(String contactNumber) {
        this.contactNumber.add(contactNumber);
    }

    public void addAddress(String address) {
        this.address.add(address);
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getContactNumbers() {
        return contactNumber;
    }

    public void setContactNumbers(ArrayList<String> contactNumbers) {
        this.contactNumber = contactNumbers;
    }

    public ArrayList<String> getAddresses() {
        return address;
    }

    public void setAddresses(ArrayList<String> addresses) {
        this.address = addresses;
    }
}
