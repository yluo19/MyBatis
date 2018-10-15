package com.Yuro.servlet;

import com.Yuro.dao.UsersDAO;
import com.Yuro.entity.Users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/index")
public class UsersFindServlet extends HttpServlet {

    private UsersDAO usersDAO = new UsersDAO();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Users> list = usersDAO.findAll();

      //  req.setAttribute("usersList",list);
        req.setAttribute("usersList", list);
        //System.out.println("request 拿到数据"+list.toString());
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
}
