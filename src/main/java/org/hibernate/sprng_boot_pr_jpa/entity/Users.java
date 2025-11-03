package org.hibernate.sprng_boot_pr_jpa.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "balanse")
    private int balanse;

//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iduser", fetch = FetchType.LAZY)
//    private List<Orders> users;

    public Users() {
    }

    public Users(String name, int balanse) {
        this.balanse = balanse;
        this.name = name;
    }

    public Users(int balanse) {
        this.balanse = balanse;
    }

    public int getId() {return id;}

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalanse() {
        return balanse;
    }

    public void setBalanse(int balanse) {
        this.balanse = balanse;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balanse=" + balanse +
                '}';
    }
}
