package com.salon.repository.entity.profile;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "profile")
public class Profile implements Serializable {
    private Long profileId;
    private String name;
    private String phone;
    private String email;
    private String login;
    private String password;


    public Profile() {
    }

    public Profile(Long profileId, String name, String phone,
                   String email, String login, String password) {
        this.profileId = profileId;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.login = login;
        this.password = password;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "profile_id", nullable = false, unique = true)
    public Long getProfileId() {
        return profileId;
    }

    public void setProfileId(Long profileId) {
        this.profileId = profileId;
    }

    @Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "phone", nullable = false)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Column(name = "email", nullable = false)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "login", nullable = false)
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Column(name = "password", nullable = false)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}