package itallodavid.github.accesscontrol.models.embedded;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Getter @Setter
public class Address {

    @Column(nullable = false)
    private String street;

    @Column(length = 150, nullable = false)
    private String district;

    @Column(length = 2, nullable = false)
    private String state;

    @Column(length = 50, nullable = false)
    private String country;

    @Column(length = 8, nullable = false)
    private String zipCode;
}
