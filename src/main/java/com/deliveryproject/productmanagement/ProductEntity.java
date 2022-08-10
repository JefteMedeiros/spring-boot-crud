package com.deliveryproject.productmanagement;

import javax.persistence.*;

@Entity
@Table(name = "product_table")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int Id;

    @Column(name = "name")
    private String Name;

    @Column(name = "amount")
    private String Amount;

    @Column(name = "category")
    private String category;

    @Column(name = "ref")
    private int Ref;

    public ProductEntity() {

    }

    public ProductEntity(int id, String name, String amount, String category, int ref) {
        Id = id;
        Name = name;
        Amount = amount;
        this.category = category;
        Ref = ref;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAmount() {
        return Amount;
    }

    public void setAmount(String amount) {
        Amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getRef() {
        return Ref;
    }

    public void setRef(int ref) {
        Ref = ref;
    }
}
