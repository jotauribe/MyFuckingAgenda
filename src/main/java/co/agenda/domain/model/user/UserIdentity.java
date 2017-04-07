package co.agenda.domain.model.user;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.UUID;

/**
 * Created by Guess on 6/4/2017.
 */

@Embeddable
public class UserIdentity implements Serializable {

    @Column
    private String identity;

    public UserIdentity() {}

    private UserIdentity(String aIdentity){
        this.identity = identity;
    }

    public static UserIdentity createFromRandomUuid(){
        return new UserIdentity(UUID.randomUUID().toString());
    }

    public String asString(){
        return identity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserIdentity that = (UserIdentity) o;

        return identity.equals(that.identity);
    }

    @Override
    public int hashCode() {
        return identity.hashCode();
    }
}

