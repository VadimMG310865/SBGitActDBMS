package org.hibernate.sprng_boot_pr_jpa.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class Orders {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "ordsum")
    private int ordsum;

//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "iduser")
//    private Users iduser;

    @Column(name = "iduser")
    private int iduser;

    @Column(name = "ordnum")
    private String ordnum;

    public Orders() { }

    public Orders(int ordsum, int iduser, String ordnum) {
        this.iduser = iduser;
        this.ordnum = ordnum;
        this.ordsum = ordsum;
    }

    //    public Orders(int ordsum,  Users iduser, String ordnum) {
//        this.iduser = iduser;
//        this.ordnum = ordnum;
//        this.ordsum = ordsum;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrdsum() {
        return ordsum;
    }

    public void setOrdsum(int ordsum) {
        this.ordsum = ordsum;
    }

//    public Users getIduser() {
//        return iduser;
//    }

//    public void setIduser(Users iduser) {
//        this.iduser = iduser;
//    }

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public String getOrdnum() {
        return ordnum;
    }

    public void setOrdnum(String ordnum) {
        this.ordnum = ordnum;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", ordsum=" + ordsum +
                ", iduser=" + iduser +
                ", ordnum='" + ordnum + '\'' +
                '}';
    }
}
