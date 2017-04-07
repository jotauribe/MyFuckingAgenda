package co.agenda.domain.model.user;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Guess on 6/4/2017.
 */
@Entity
public class User {

    @EmbeddedId
    private UserIdentity userId;
    @Column
    private String name;

    public User(String aName, UserIdentity aUserIdentity){
        this.name = aName;
        this.userId = aUserIdentity;
    }

    public User() {
    }

    public UserIdentity identity(){
        return this.userId;
    }


}
