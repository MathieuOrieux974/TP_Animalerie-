package org.example.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class Cat extends Animal {
    private String chip_id;



    public Cat() {
        super();
    }

}

