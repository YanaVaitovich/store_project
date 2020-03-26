package by.vaitovich.dao;

import by.vaitovich.entity.Admin;
import by.vaitovich.entity.Brand;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BrandDaoImpl implements BrandDao{
    private static final String TABLE_NAME = "brands";
    private static BrandDao INSTANCE = null;

    private BrandDaoImpl() {}

    public static BrandDaoImpl getInstance() {
        if (INSTANCE == null) {
            synchronized (BrandDaoImpl.class) {
                if (INSTANCE == null) {
                    INSTANCE = new BrandDaoImpl();
                }
            }
        }
        return (BrandDaoImpl) INSTANCE;
    }
    @Override
    public void save(Brand brand) {

    }

    @Override
    public List<Brand> finfAll() {
        List<Brand> abilities = new ArrayList<>();
        try (Connection connection = ConnectionManager.getConnection()) {
            try (PreparedStatement preparedStatement = connection.prepareStatement(
                    "SELECT * FROM " + TABLE_NAME)) {
                try (ResultSet resultSet = preparedStatement.executeQuery()){
                    while (resultSet.next()) {
                        abilities.add(new Brand(resultSet.getLong(TABLE_NAME + ".id"),
                                resultSet.getString(TABLE_NAME + ".brandName")));
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return abilities;
    }

    @Override
    public void find(long id) {

    }

    @Override
    public void update(Brand brand) {

    }

    @Override
    public void delete(long id) {

    }
}

