package co.agenda.domain.model.contact;

import common.AlwaysValidEntity;

import javax.persistence.*;

/**
 * Created by Guess on 5/4/2017.
 */

@Entity
@Table(name = "CONTACT")
public class Contact implements AlwaysValidEntity{

    @EmbeddedId private Telephone telephone;
    @Embedded private FullName fullName;

    public Contact(FullName aFullName, Telephone aTelephone){
        setFullName(aFullName);
        setTelephone(aTelephone);
    }

    public Contact() {
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

    

}
