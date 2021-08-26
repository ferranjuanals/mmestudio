package es.marinamolina.app.domain.model.entities;

import es.marinamolina.app.domain.model.valueobjects.Id;
import es.marinamolina.app.domain.model.valueobjects.ProjectType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor
public class Project {

    private final Id id;

    private String name;

    private final Client client;

    private final Address address;

    private final LocalDate initialDate;

    private final LocalDate finalDate;

    private final ProjectType projectType;

    private String licenseType;

    private List<Invoice> invoices;

    private List<String> contractors;

}
