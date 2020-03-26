package by.vaitovich.dao;

import by.vaitovich.entity.Admin;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AdminDaoImpl implements AdminDao {

    private static AdminDaoImpl INSTANCE;

    private AdminDaoImpl() {
    }

    public static AdminDaoImpl getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new AdminDaoImpl();
        }
        return INSTANCE;
    }



    @Override
    public Long save(Admin admin) {
        PreparedStatement preparedStatement = null;
        String SAVE_USERS_QUERY = "INSERT INTO users (name, surname, patronymic, address, mail, phone, password, registrationDate) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection connection = ConnectionManager.getConnection()) {
            preparedStatement = connection.prepareStatement(SAVE_USERS_QUERY);

            preparedStatement.setString(1, admin.getName());
            preparedStatement.setString(2, admin.getSurname());
            preparedStatement.setString(3, admin.getPatronymic());
            preparedStatement.setString(4, admin.getAddress());
            preparedStatement.setString(5, admin.getMail());
            preparedStatement.setString(6, admin.getPhone());
            preparedStatement.setString(7, admin.getPassword());
            preparedStatement.setDate(8, (java.sql.Date) admin.getRegistrationDate());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public List<Admin> finfAll() throws SQLException {
        List<Admin> admins = new ArrayList<>();

        String FIND_ADMINS_QUERY = "SELECT*FROM admins";
        try (Connection connection = ConnectionManager.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(FIND_ADMINS_QUERY);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                admins.add(new Admin(resultSet.getLong("id"),
                        resultSet.getString("surname"),
                        resultSet.getString("name"),
                        resultSet.getString("patronymic"),
                        resultSet.getString("address"),
                        resultSet.getString("mail"),
                        resultSet.getString("phone"),
                        resultSet.getString("password"),
                        resultSet.getDate("registrationDate")));

            }
            try {
                resultSet.close();
                preparedStatement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            }
            return admins;
        }
    }

    @Override
    public void find(long id) {

    }

    @Override
    public void update(Admin admin) {
      String UPDATE_ADMINS_QUERY = "INSERT INTO users (name, surname, patronymic, address, mail, phone, password, registrationDate) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection connection = ConnectionManager.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_ADMINS_QUERY);

            preparedStatement.setString(1, admin.getName());
            preparedStatement.setString(2, admin.getSurname());
            preparedStatement.setString(3, admin.getPatronymic());
            preparedStatement.setString(4, admin.getAddress());
            preparedStatement.setString(5, admin.getMail());
            preparedStatement.setString(6, admin.getPhone());
            preparedStatement.setString(7, admin.getPassword());
            preparedStatement.setDate(8, (java.sql.Date) admin.getRegistrationDate());

            preparedStatement.executeUpdate();

            ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
            if (generatedKeys.next()) {
                System.out.println(generatedKeys.getInt(1));
            }
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(long id) throws SQLException {
        String DELETE_ADMINS_QUERY = "DELETE FROM admins WHERE id = ?;";

        try (Connection connection = ConnectionManager.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_ADMINS_QUERY);
            preparedStatement.setLong(1, id);
            preparedStatement.executeUpdate();

            try {

                preparedStatement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            }
        }
    }
}
