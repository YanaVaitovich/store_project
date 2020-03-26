package by.vaitovich.dao;

import by.vaitovich.entity.Brand;
import by.vaitovich.entity.Admin;

import java.util.List;

public interface BrandDao {
    void save(Brand brand);
    List<Brand> finfAll();
    void find (long id);
    void update(Brand brand);
    void delete(long id);
}
