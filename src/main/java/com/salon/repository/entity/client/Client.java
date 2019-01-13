package com.salon.repository.entity.client;

import com.salon.repository.entity.abstractEntity.user.AbstractUser;
import com.salon.repository.entity.address.Address;
import com.salon.repository.entity.checklist.CheckList;
import com.salon.repository.entity.discount.Discount;
import com.salon.repository.entity.profile.Profile;
import com.salon.repository.entity.role.Role;
import com.salon.repository.entity.salon.Salon;
import com.salon.utility.EnumStatus;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "client")
public class Client extends AbstractUser implements Serializable {
    private Long id;
    private Address address;
    private Discount discount;
    private Salon salon;
    private List<CheckList> checkList;

    public Client(){

    }

    public Client(Role role, Profile profile, EnumStatus status,
                  Long id, Address address, Discount discount) {
        super(role, profile, status);
        this.id = id;
        this.address = address;
        this.discount = discount;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_id", nullable = false, unique = true)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "address_id")
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "discount_id")
    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "salon_id")
    public Salon getSalon() {
        return salon;
    }

    public void setSalon(Salon salon) {
        this.salon = salon;
    }

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "worker_skills",
            joinColumns = {@JoinColumn(name = "worker_id")},
            inverseJoinColumns = {@JoinColumn(name = "skills_id")})
    public List<CheckList> getCheckList() {
        return checkList;
    }

    public void setCheckList(List<CheckList> checkList) {
        this.checkList = checkList;
    }
}
