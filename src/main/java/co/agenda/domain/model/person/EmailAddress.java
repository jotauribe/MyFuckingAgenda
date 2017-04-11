package co.agenda.domain.model.person;

import common.AlwaysValidEntity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by Guess on 7/4/2017.
 */

@Embeddable
public class EmailAddress implements AlwaysValidEntity, Serializable {

    @Column(name = "email", columnDefinition = "varchar(128)")
    protected String address;

    protected EmailAddress() {
    }

    public EmailAddress(String address){
        this.setAddress(address);
    }

    public String asString(){
        return this.address;
    }

    private void setAddress(String address){
        this.assertArgumentNotNull(address, "The email address can not be NULL");
        this.assertArgumentLength(address, 3, 100, "The email address mut be between 3-100 characters");
        //TODO: patter assessment
        this.address = address;
    }

    public EmailAddress changeAddress(String anAddress){
        return new EmailAddress(anAddress);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmailAddress that = (EmailAddress) o;

        return address.equals(that.address);
    }

    @Override
    public int hashCode() {
        return address.hashCode();
    }

    @Override
    public String toString() {
        return "EmailAddress{" +
                "address='" + address + '\'' +
                '}';
    }
}
