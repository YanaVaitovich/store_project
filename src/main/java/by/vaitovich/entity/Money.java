package by.vaitovich.entity;

import java.util.Currency;
import java.util.Objects;
//включить методы конвертации и арифмитических операций
public class Money {
    private  double price;
    private Currency currency;

    public Money(double price, Currency currency) {
        this.price = price;
        this.currency = currency;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Currency getCurrency() {
        return currency;
    }

    @Override
    public String toString() {
        return "Money{" +
                "price=" + price +
                ", currency=" + currency +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return Double.compare(money.price, price) == 0 &&
                Objects.equals(currency, money.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, currency);
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}
