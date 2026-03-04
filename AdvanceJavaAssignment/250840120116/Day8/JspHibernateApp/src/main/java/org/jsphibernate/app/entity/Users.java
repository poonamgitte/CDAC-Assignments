package org.jsphibernate.app.entity;

public class Users {

    private String userName;
    private String password;
    private String name;
    private String email;
    private String mobile;
    private String role;

    public Users() {}

    public Users(String userName, String password, String name,
                 String email, String mobile, String role) {
        this.userName = userName;
        this.password = password;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.role = role;
    }

    public String getUserName() { return userName; }
    public void setUserName(String userName) { this.userName = userName; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getMobile() { return mobile; }
    public void setMobile(String mobile) { this.mobile = mobile; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    @Override
    public String toString() {
        return "Users [userName=" + userName +
                ", password=" + password +
                ", name=" + name +
                ", email=" + email +
                ", mobile=" + mobile +
                ", role=" + role + "]";
    }
}
