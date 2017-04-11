package co.agenda.domain.model.contact;

import co.agenda.domain.model.person.Telephone;

/**
 * Created by Guess on 7/4/2017.
 */
public interface ContactRepository {
    void addContact(Contact aPerson);
    void removeContact(Telephone telephone);
}
