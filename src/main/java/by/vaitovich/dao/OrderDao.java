package by.vaitovich.dao;

import by.vaitovich.entity.Order;
import by.vaitovich.entity.Admin;

import java.util.List;

public interface OrderDao {
    void save(Order order);
    List<Admin> finfAll();
    void find (long id);
    void update (Order order);
    void delete(long id);
}
