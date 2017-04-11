package co.agenda.infrastructure.domain.model.user;

import co.agenda.domain.model.user.User;
import co.agenda.domain.model.user.UserRepository;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Guess on 8/4/2017.
 */

@Stateless
public class HibernateUserRepository implements UserRepository{

    @PersistenceContext(unitName = "DefaultMySqlPersistentUnit")
    private EntityManager entityManager;

    @Override
    public void addUser(User aUser) {
        entityManager.persist(aUser);
    }
}
