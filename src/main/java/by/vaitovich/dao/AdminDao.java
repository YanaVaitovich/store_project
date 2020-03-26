package by.vaitovich.dao;

import by.vaitovich.entity.Admin;

import java.sql.SQLException;
import java.util.List;

public interface AdminDao {

    Long save(Admin admin);
    List<Admin> finfAll() throws SQLException;
    void find (long id);
    void update(Admin admin);
    void delete(long id) throws SQLException;
}
