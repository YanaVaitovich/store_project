package by.vaitovich.entity;

import java.util.Objects;

public class Brand {
    private long id;
    private String brandName;

    public Brand(long aLong, String brand) {
        this.brandName = brand;
    }

    public Brand(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBrand() {
        return brandName;
    }

    public void setBrand(String brand) {
        this.brandName = brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Brand brand1 = (Brand) o;
        return id == brand1.id &&
                Objects.equals(brandName, brand1.brandName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brandName);
    }

    @Override
    public String toString() {
        return "Brand{" +
                "id=" + id +
                ", brand='" + brandName + '\'' +
                '}';
    }
}