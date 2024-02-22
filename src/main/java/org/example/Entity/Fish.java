package org.example.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
    @Entity
    @Getter
    @Setter

    public class Fish extends Animal {
        @Enumerated(EnumType.STRING)
        private FishLivEnv fishLivEnv;



        public Fish() {
            super();
        }

    }

