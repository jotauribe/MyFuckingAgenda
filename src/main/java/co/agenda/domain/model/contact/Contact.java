package co.agenda.domain.model.contact;

import co.agenda.domain.model.person.Person;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/**
 * Created by Guess on 7/4/2017.
 */

@Entity
public class Contact {

@EmbeddedId
private ContactIdentity contactIdentity;
@Embedded
private Person person;

protected Contact(){}

}
