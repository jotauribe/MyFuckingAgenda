package co.agenda.domain.model.contact;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by Guess on 7/4/2017.
 */

@Embeddable
public class ContactIdentity implements Serializable {
    @Column(name = "id", columnDefinition = "varchar(32)")
    String identity;
}
