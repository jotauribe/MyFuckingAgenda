package co.agenda.infrastructure.domain.model.contact;

import co.agenda.domain.model.contact.Contact;
import co.agenda.domain.model.contact.ContactRepository;
import co.agenda.domain.model.person.Telephone;

import javax.persistence.EntityManager;

/**
 * Created by Guess on 6/4/2017.
 */
public class HibernateContactRepository implements ContactRepository{

    private EntityManager entityManager;

    @Override
    public void addContact(Contact aPerson) {

    }

    @Override
    public void removeContact(Telephone telephone) {

    }
}
