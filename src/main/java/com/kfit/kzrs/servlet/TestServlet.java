package com.kfit.kzrs.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by zjutK on 2018/7/24.
 */

@WebServlet(urlPatterns = "/test2")
public class TestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json");
        resp.setCharacterEncoding("utf-8");
        PrintWriter printWriter = resp.getWriter();
        printWriter.write("执行TestServlet内doGet方法成功");
        printWriter.close();

    }
}
