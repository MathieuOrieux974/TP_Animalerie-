package org.example.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Banque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    @OneToMany
    @JoinColumn(name = "client_id")
    private List<Client> client;

    public Banque() {

    }

    public Banque(Long id, String name, List<Client> client) {
        this.id = id;
        this.name = name;
        this.client = client;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Client> getClient() {
        return client;
    }

    public void setClient(List<Client> client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Banque{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", client=" + client +
                '}';
    }
}