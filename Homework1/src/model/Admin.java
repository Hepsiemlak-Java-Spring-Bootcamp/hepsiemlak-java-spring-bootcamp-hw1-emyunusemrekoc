package model;

import java.util.List;

public class Admin  extends User{

    private String firstName;
    private String lastName;


    public Admin() {
    }

    public Admin(String email, String password, String photo, String biography, String phoneNumber, List<Message> messageBox, String firstName, String lastName) {
        super(email, password, photo, biography, phoneNumber, messageBox);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
