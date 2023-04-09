package com.example.JPAMapping.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="Mobile_Payment")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="pmode",discriminatorType = DiscriminatorType.STRING)
public abstract class Mobile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;
    @Column(name="model")
    private String model;
    @Column(name="price")
    private long price;

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public long getPrice() {
        return price;
    }

    public Mobile() {
    }


    public void setPrice(long price) {
        this.price = price;
    }

    public Mobile(int id, String model, long price) {
        this.id = id;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
