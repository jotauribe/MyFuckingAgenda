package co.agenda.application.service.user;

import co.agenda.domain.model.person.EmailAddress;
import co.agenda.domain.model.person.FullName;
import co.agenda.domain.model.person.Person;
import co.agenda.domain.model.person.Telephone;
import co.agenda.domain.model.user.User;
import co.agenda.domain.model.user.UserIdentity;
import co.agenda.domain.model.user.UserRepository;

import javax.inject.Inject;

/**
 * Created by Guess on 8/4/2017.
 */
public class CreateUserUseCase {
    @Inject
    private UserRepository userRepository;

    public void execute(NewUserData data) {
        FullName fullName = new FullName(data.getFirstName(), data.getLastName());
        Telephone telephone = new Telephone(data.getTelephone());
        EmailAddress emailAddress = new EmailAddress(data.getEmail());
        Person person = new Person(fullName, telephone, emailAddress);
        UserIdentity userIdentity = UserIdentity.createFromRandomUuid();
        User user = new User(data.getUsername(), data.getPasswordHash(), userIdentity, person);
    }
}
