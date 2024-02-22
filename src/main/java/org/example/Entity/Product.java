package org.example.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
@Entity
@Getter
@Setter

public class Product {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String code;
        private String label;
        private Double price;
        @ManyToMany(mappedBy = "products")
        private List<PetStore> petStores;
}
