package org.example.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.util.List;
@Entity
@Getter
@Setter

public class Cat extends Animal {
    private String chipid;



    public Cat() {
        super();
    }

}

