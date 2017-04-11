package co.agenda.domain.model.person;

import common.AlwaysValidEntity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by Guess on 5/4/2017.
 */

@Embeddable
public class FullName implements AlwaysValidEntity, Serializable{

    @Column(name = "firstname", columnDefinition = "VARCHAR(64)")
    private String firstName;
    @Column(name = "lastname", columnDefinition = "VARCHAR(64)")
    private String lastName;

    protected FullName(){}

    public FullName(String firstName, String lastName){
        setFirstName(firstName);
        setLastName(lastName);
    }

    private void setFirstName(String name){
        assertArgumentNotNull(name, "Name can not be null");
        assertArgumentLength(name, 16, 1, "Invalid Name Length");
        this.firstName = name;
    }

    private void setLastName(String lastName){
        assertArgumentNotNull(lastName, "Last Name can not be null");
        assertArgumentLength(lastName, 32, 1, "Invalid Last Name Length");
        this.lastName = lastName;
    }

    public String name(){
        return this.firstName;
    }

    public String lastName(){
        return this.lastName;
    }

    public FullName change(String name, String lastName){
        return new FullName(name, lastName);
    }

    public FullName changeName(String name){
        return new FullName(name, this.lastName);
    }

    public FullName changeLastName(String lastName){
        return new FullName(this.firstName, lastName);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FullName fullName = (FullName) o;

        if (!firstName.equals(fullName.firstName)) return false;
        return lastName.equals(fullName.lastName);
    }

    @Override
    public int hashCode() {
        int result = firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "FullName{" +
                "name='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
