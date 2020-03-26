package by.vaitovich.dao;

import by.vaitovich.entity.Product;
import by.vaitovich.entity.Admin;

import java.util.List;

public interface ProductDao {
    void save(Product product);
    List<Product> finfAll();
    void find (long id);
    void update(Product product);
    void delete(long id);
}
