package co.agenda.application.service.user;

/**
 * Created by Guess on 12/4/2017.
 */
public class NewUserData {
    private String username;
    private String firstName;
    private String lastName;
    private String passwordHash;
    private String email;
    private String telephone;

    public NewUserData(String userName,
                       String firstName,
                       String lastName,
                       String passwordHash,
                       String email,
                       String telephone){
        this.username = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.passwordHash = passwordHash;
        this.email = email;
        this.telephone = telephone;
    }

    public String getUsername() {
        return username;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }
}
