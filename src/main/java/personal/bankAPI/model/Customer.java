package personal.bankAPI.model;

import lombok.Data;

@Data
public class Customer {
    private String firstName;
    private String lastName;
    private String pesel;
    private Integer id;
}
