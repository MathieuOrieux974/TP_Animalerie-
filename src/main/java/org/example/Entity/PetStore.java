package org.example.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class PetStore {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String name;
        private String managerName;
        private Double price;

        @ManyToMany
        @JoinTable(
                name = "petstore_product",  // Nom de la table de jointure
                joinColumns = @JoinColumn(name = "petstore_id")
        )
        private List<Product> products;

        @OneToMany(mappedBy = "petStore", cascade = CascadeType.ALL)
        private List<Animal> animals;

        @OneToOne()
        private Address address;
}