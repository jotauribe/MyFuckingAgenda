package co.agenda.domain.model.user;

import co.agenda.domain.model.person.Person;
import common.AlwaysValidEntity;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/**
 * Created by Guess on 6/4/2017.
 */
@Entity
public class User implements AlwaysValidEntity{

    @EmbeddedId
    private UserIdentity userId;

    @Column(name = "username", unique = true, nullable = false)
    private String userName;

    @Column(name = "password", columnDefinition = "varchar(64)", nullable = false)
    private String passwordHash;

    @Embedded
    private Person person;

    protected User() {
    }

    public User(String aUserName, String aPasswordHash, UserIdentity aUserIdentity, Person aPerson){
        setUserName(aUserName);
        setPasswordHash(aPasswordHash);
        setId(aUserIdentity);
    }

    public UserIdentity identity(){
        return this.userId;
    }

    protected void setUserName(String userName){
        assertArgumentNotNull(userName, "An id is required");
        this.userName = userName;
    }

    protected void setPasswordHash(String passwordHash){
        assertArgumentNotNull(passwordHash, "A password is required");
        assertArgumentLength(passwordHash, 8, 32, "Password lenght must to be between 8 and 32 characters");
        this.passwordHash = passwordHash;
    }

    protected void setId(UserIdentity id){
        assertArgumentNotNull(id, "An id is required");
        this.userId = id;
    }

    protected  void setPerson(Person aPerson){
        assertArgumentNotNull(aPerson, "A non null person object must be provided");
        this.person = aPerson;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return userId.equals(user.userId);
    }

    @Override
    public int hashCode() {
        return userId.hashCode();
    }
}
