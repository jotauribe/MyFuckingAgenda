package co.agenda.domain.model.contact;

import common.AlwaysValidEntity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by Guess on 5/4/2017.
 */

@Embeddable
public class FullName implements AlwaysValidEntity, Serializable{

    @Column private String name;
    @Column private String lastName;

    public FullName(){}

    public FullName(String name, String lastName){
        setName(name);
        setLastName(lastName);
    }

    private void setName(String name){
        assertArgumentNotNull(name, "Name can not be null");
        assertArgumentLength(name, 16, 1, "Invalid Name Length");
        this.name = name;
    }

    private void setLastName(String lastName){
        assertArgumentNotNull(lastName, "Last Name can not be null");
        assertArgumentLength(lastName, 32, 1, "Invalid Last Name Length");
        this.lastName = lastName;
    }

    public String name(){

        return this.name;

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

        return new FullName(this.name, lastName);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FullName fullName = (FullName) o;

        if (!name.equals(fullName.name)) return false;
        return lastName.equals(fullName.lastName);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + lastName.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "FullName{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
