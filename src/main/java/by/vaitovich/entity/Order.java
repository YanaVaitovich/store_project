package by.vaitovich.entity;

import java.util.List;
import java.util.Objects;

public class Order {
    private String id;
    private List<Product> products;
    private Customer customer;
    private String phone;
    private String address;
    private String comment;
    private OrderStatus orderStatus;

    public Order(String id, List<Product> products, Customer customer, String phone, String address, String comment, OrderStatus orderStatus) {
        this.id = id;
        this.products = products;
        this.customer = customer;
        this.phone = phone;
        this.address = address;
        this.comment = comment;
        this.orderStatus = orderStatus;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id) &&
                Objects.equals(products, order.products) &&
                Objects.equals(customer, order.customer) &&
                Objects.equals(phone, order.phone) &&
                Objects.equals(address, order.address) &&
                Objects.equals(comment, order.comment) &&
                orderStatus == order.orderStatus;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, products, customer, phone, address, comment, orderStatus);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", products=" + products +
                ", customer=" + customer +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", comment='" + comment + '\'' +
                ", orderStatus=" + orderStatus +
                '}';
    }
}
