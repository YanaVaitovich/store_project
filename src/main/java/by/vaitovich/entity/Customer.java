package by.vaitovich.entity;

import java.util.Date;
import java.util.Objects;

public class Customer {
    private long id;
    private String surname;
    private String name;
    private String patronymic;
    private String address;
    private String mail;
    private String phone;
    private String password;
    private Date registrationDate;
    private boolean inBlackList;

    public Customer(long id, String surname, String name, String patronymic, String address, String mail, String phone, String password, Date registrationDate, boolean inBlackList) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.mail = mail;
        this.phone = phone;
        this.password = password;
        this.registrationDate = registrationDate;
        this.inBlackList = inBlackList;
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

    public boolean isInBlackList() {
        return inBlackList;
    }

    public void setInBlackList(boolean inBlackList) {
        this.inBlackList = inBlackList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id &&
                inBlackList == customer.inBlackList &&
                Objects.equals(surname, customer.surname) &&
                Objects.equals(name, customer.name) &&
                Objects.equals(patronymic, customer.patronymic) &&
                Objects.equals(address, customer.address) &&
                Objects.equals(mail, customer.mail) &&
                Objects.equals(phone, customer.phone) &&
                Objects.equals(password, customer.password) &&
                Objects.equals(registrationDate, customer.registrationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, surname, name, patronymic, address, mail, phone, password, registrationDate, inBlackList);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", address='" + address + '\'' +
                ", mail='" + mail + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", registrationDate=" + registrationDate +
                ", inBlackList=" + inBlackList +
                '}';
    }
}

