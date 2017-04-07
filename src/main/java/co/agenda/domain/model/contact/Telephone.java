package co.agenda.domain.model.contact;

import common.AlwaysValidEntity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import java.io.Serializable;

/**
 * Created by Guess on 5/4/2017.
 */
@Embeddable
public class Telephone implements AlwaysValidEntity, Serializable {

    /**
     * identifier serve as a description for the number.
     * Example: Main, Home, Work, Etc.
     */
    @Column private String number;

    public Telephone(String number){
        setNumber(number);
    }

    private void setNumber(String number){
        assertArgumentNotNull(number, "Telephone number can not be null");
    }

    public Telephone changeNumber(String number){

        return new Telephone(number);

    }

    public String number(){
        return this.number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Telephone telephone = (Telephone) o;

        return number.equals(telephone.number);
    }

    @Override
    public int hashCode() {
        return number.hashCode();
    }

    @Override
    public String toString() {
        return "Telephone{" +
                "number='" + number + '\'' +
                '}';
    }
}