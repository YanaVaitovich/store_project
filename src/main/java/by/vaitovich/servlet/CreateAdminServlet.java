package by.vaitovich.servlet;

import by.vaitovich.dto.CreateNewAdminDto;
import by.vaitovich.service.AdminService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import static by.vaitovich.util.ServletUtil.createViewPath;

@WebServlet(urlPatterns = "/create-adm", name = "CreateAdminServlet")
public class CreateAdminServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        getServletContext()
                .getRequestDispatcher(createViewPath("create-hero"))
                .forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Long createdHeroId = AdminService.getInstance().createNewAdmin((CreateNewAdminDto) req);
        resp.sendRedirect("/full-info?id=" + createdHeroId);
    }

    private CreateNewAdminDto createHeroDto(HttpServletRequest request) {
        return new CreateNewAdminDto(request.getParameter("name"),
                request.getParameter("surname"),
                request.getParameter("patronymic"));

    }
}

