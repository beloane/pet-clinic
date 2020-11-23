package belo.springframework.petclinic.model;

import lombok.Data;

import java.time.LocalDate;
@Data
public class Pet extends BaseEntity{

    private PetType petType;
    private Owner owner;
    LocalDate date;
}
