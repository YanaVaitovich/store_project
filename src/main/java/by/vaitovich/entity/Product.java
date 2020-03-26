package by.vaitovich.entity;

import java.util.Date;
import java.util.Objects;

public class Product {
    private long id;
    private double price;
    private String title;
    private String code;
    private String characteristics;
    private Brand brand;
    private Date datetime;
    private String description;

    public Product(long id, String price, String title, String code, String characteristics, String brand, java.sql.Date datetime, String description) {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(String characteristics) {
        this.characteristics = characteristics;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id &&
                Double.compare(product.price, price) == 0 &&
                Objects.equals(title, product.title) &&
                Objects.equals(code, product.code) &&
                Objects.equals(characteristics, product.characteristics) &&
                Objects.equals(brand, product.brand) &&
                Objects.equals(datetime, product.datetime) &&
                Objects.equals(description, product.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, price, title, code, characteristics, brand, datetime, description);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", price=" + price +
                ", title='" + title + '\'' +
                ", code='" + code + '\'' +
                ", characteristics='" + characteristics + '\'' +
                ", brand=" + brand +
                ", datetime=" + datetime +
                ", description='" + description + '\'' +
                '}';
    }
}
