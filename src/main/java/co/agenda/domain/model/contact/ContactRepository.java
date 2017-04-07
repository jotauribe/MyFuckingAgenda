package co.agenda.domain.model.contact;

/**
 * Created by Guess on 5/4/2017.
 */
public interface ContactRepository {

    void addContact(Contact aContact);
    void removeContact(Telephone telephone);
}
