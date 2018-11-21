package com.sc.vag.servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by 1533435 on 11/21/2018.
 */
public class GeneralInfoServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("info", this.getServletInfo());
        this.gotoPage("GeneralInfo.jsp", req, resp);
    }

    private void gotoPage(String page, HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext sc = this.getServletContext();
        RequestDispatcher rd = sc.getRequestDispatcher(page);
        rd.forward(req, resp);
    }
}
