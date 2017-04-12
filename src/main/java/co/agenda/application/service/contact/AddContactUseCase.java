package co.agenda.application.service.contact;

import co.agenda.domain.model.user.UserRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;


/**
 * Created by Guess on 5/4/2017.
 */
@Stateless
public class AddContactUseCase {
    @Inject
    private UserRepository userRepository;

    public void execute(){

    }


}
