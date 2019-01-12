package com.salon.repository.bean.worker;

public class WorkerBean {
    private Long id;
    private String name;
    private String phone;
    private String email;
    private String login;
    private String password;

    public WorkerBean() {
    }

    public WorkerBean(Long id, String name, String phone,
                      String email, String login, String password) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.login = login;
        this.password = password;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
