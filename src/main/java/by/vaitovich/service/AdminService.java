package by.vaitovich.service;

import by.vaitovich.dao.AdminDaoImpl;
import by.vaitovich.dto.CreateNewAdminDto;
import by.vaitovich.dto.ViewAllAdminDto;
import by.vaitovich.entity.Admin;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class AdminService {
    private static AdminService INSTANCE = null;

    private AdminService() {}

    public static AdminService getInstance() {
        if (INSTANCE == null) {
            synchronized (AdminService.class) {
                if (INSTANCE == null) {
                    INSTANCE = new AdminService();
                }
            }
        }
        return INSTANCE;
    }



    public Long createNewAdmin(CreateNewAdminDto dto) {
        return AdminDaoImpl.getInstance().save(new Admin(dto.getSurname(),
                dto.getName(),
                dto.getPatronymic(),
                dto.getId()));
    }




}
