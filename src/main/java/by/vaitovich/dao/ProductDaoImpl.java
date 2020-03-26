package by.vaitovich.dao;

import by.vaitovich.entity.Admin;
import by.vaitovich.entity.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDaoImpl  implements  ProductDao{

    private static ProductDaoImpl INSTANCE;
    private ProductDaoImpl(){}
    public static ProductDaoImpl getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ProductDaoImpl();
        }
        return INSTANCE;
    }

    public static final String SAVE_PRODUCT_QUERY = "INSERT INTO products (price, oldPrice, title, code, characteristics, brand, datetime, description) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    public static final String FIND_PRODUCT_QUERY = "SELECT*FROM products";
    public static final String DELETE_PRODUCT_QUERY = "DELETE FROM products WHERE id = ?;";
    public static final String UPDATE_PRODUCT_QUERY ="INSERT INTO products (price, oldPrice, title, code, characteristics, brand, datetime, description) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

    @Override
    public void save(Product product) {

        try (Connection connection = ConnectionManager.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(SAVE_PRODUCT_QUERY);

            preparedStatement.setDouble(1, product.getPrice());
            preparedStatement.setString(2, product.getTitle());
            preparedStatement.setString(3, product.getCode());
            preparedStatement.setString(4, product.getCharacteristics());
            preparedStatement.setString(5, String.valueOf(product.getBrand()));
            preparedStatement.setDate(6, (Date) product.getDatetime());
            preparedStatement.setString(7, product.getDescription());

            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    @Override
    public List<Product> finfAll() {
        List<Product> products = new ArrayList<>();
        try (Connection connection = ConnectionManager.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(FIND_PRODUCT_QUERY);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                products.add(new Product(resultSet.getLong("id"),
                        resultSet.getString("price"),
                        resultSet.getString("title"),
                        resultSet.getString("code"),
                        resultSet.getString("characteristics"),
                        resultSet.getString("brand"),
                        resultSet.getDate("datetime"),
                        resultSet.getString("description")));


            }
            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return products;
    }
    @Override
    public void find(long id) {

    }

    @Override
    public void update(Product product) {

        try (Connection connection = ConnectionManager.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_PRODUCT_QUERY);

            preparedStatement.setDouble(1, product.getPrice());
            preparedStatement.setString(2, product.getTitle());
            preparedStatement.setString(3, product.getCode());
            preparedStatement.setString(4, product.getCharacteristics());
            preparedStatement.setString(5, String.valueOf(product.getBrand()));
            preparedStatement.setDate(6, (Date) product.getDatetime());
            preparedStatement.setString(7, product.getDescription());

            preparedStatement.executeUpdate();

            ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
            if (generatedKeys.next()) {
                System.out.println(generatedKeys.getLong(1));
            }
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



    @Override
    public void delete(long id) {
        try (Connection connection = ConnectionManager.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_PRODUCT_QUERY);
            preparedStatement.setLong(1, id);
            preparedStatement.executeUpdate();

            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}


