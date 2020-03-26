package by.vaitovich.entity;

import java.util.Date;
import java.util.Objects;

public class Admin {
    private long id;
    private String surname;
    private String name;
    private String patronymic;
    private String address;
    private String mail;
    private String phone;
    private String password;
    private Date registrationDate;

    public Admin(long id, String surname, String name, String patronymic, String address, String mail, String phone, String password, Date registrationDate) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.mail = mail;
        this.phone = phone;
        this.password = password;
        this.registrationDate = registrationDate;
    }

    public Admin(String surname, String name, String patronymic, long id) {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Admin admin = (Admin) o;
        return id == admin.id &&
                Objects.equals(surname, admin.surname) &&
                Objects.equals(name, admin.name) &&
                Objects.equals(patronymic, admin.patronymic) &&
                Objects.equals(address, admin.address) &&
                Objects.equals(mail, admin.mail) &&
                Objects.equals(phone, admin.phone) &&
                Objects.equals(password, admin.password) &&
                Objects.equals(registrationDate, admin.registrationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, surname, name, patronymic, address, mail, phone, password, registrationDate);
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", address='" + address + '\'' +
                ", mail='" + mail + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", registrationDate=" + registrationDate +
                '}';
    }
}
