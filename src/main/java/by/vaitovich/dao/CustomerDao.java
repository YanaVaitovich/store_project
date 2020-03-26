package by.vaitovich.dao;

import by.vaitovich.entity.Customer;
import by.vaitovich.entity.Admin;

import java.util.List;

public interface CustomerDao {
    void save(Customer customer);
    List<Admin> finfAll();
    void find (long id);
    void update(Customer customer);
    void delete(long id);
}
