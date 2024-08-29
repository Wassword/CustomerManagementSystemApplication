package customer;
import org.springframework.stereotype.Component;

@Component
public class Customer {
    private int id;
    private String name;
    private String email;
    private String contactNumber;

    // Constructors, Getters, and Setters
    public Customer() {}

    public Customer(int id, String name, String email, String contactNumber) {
        this.id = id;
        this.name = name;
        this.email= email;
        this.contactNumber = contactNumber;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Override
    public boolean equals(Object o) {
        if( this== o) return true;
        if( o == null || getClass() != o.getClass()) return false;
        Customer customer = ( Customer ) o;
        return id == customer.id;
    }
    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}
