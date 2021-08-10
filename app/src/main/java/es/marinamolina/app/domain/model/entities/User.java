package es.marinamolina.app.domain.model.entities;

import es.marinamolina.app.domain.model.valueobjects.EmailAddress;
import es.marinamolina.app.domain.model.valueobjects.Id;
import es.marinamolina.app.domain.model.valueobjects.PasswordHash;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
public class User {

    private final Id id;

    private final EmailAddress emailAddress;

    private PasswordHash passwordHash;

    private String name;

    private String surname;

}
