package co.agenda.domain.model.person;

import common.AlwaysValidEntity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Guess on 5/4/2017.
 */

@Embeddable
public class Person implements AlwaysValidEntity, Serializable{

    @Column private Telephone telephone;
    @Column private FullName fullName;
    @Column private EmailAddress emailAddress;

    public Person() {
    }

    /**
     *
     * @param aFullName New user full name
     * @param aTelephone New user telephone number
     * @param aEmailAddress New user email address
     */
    public Person(FullName aFullName, Telephone aTelephone, EmailAddress aEmailAddress){
        setFullName(aFullName);
        setTelephone(aTelephone);
        setEmailAddress(aEmailAddress);
    }

    private void setEmailAddress(EmailAddress aEmailAddress) {
        assertArgumentNotNull(aEmailAddress, "Full Name can not be null");
        this.emailAddress = aEmailAddress;
    }

    private void setFullName(FullName aFullName){
        assertArgumentNotNull(aFullName, "Full Name can not be null");
        this.fullName = aFullName;
    }

    private void setTelephone(Telephone aTelephone){
        assertArgumentNotNull(aTelephone, "Telephone can not be null");
        this.telephone = aTelephone;
    }

    public FullName fullName(){
        return fullName;
    }

    public Telephone telephone(){
        return telephone;
    }

    public EmailAddress emailAddress(){
        return emailAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (!telephone.equals(person.telephone)) return false;
        if (!fullName.equals(person.fullName)) return false;
        return emailAddress.equals(person.emailAddress);
    }

    @Override
    public int hashCode() {
        int result = telephone.hashCode();
        result = 31 * result + fullName.hashCode();
        result = 31 * result + emailAddress.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "telephone=" + telephone +
                ", fullName=" + fullName +
                ", emailAddress=" + emailAddress +
                '}';
    }
}
