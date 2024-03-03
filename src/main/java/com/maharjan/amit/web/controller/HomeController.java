/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maharjan.amit.web.controller;

import com.maharjan.amit.web.entity.Subscriber;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * @author Student99
 */
@WebServlet(name = "home", urlPatterns = "/")
public class HomeController extends Controller {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("WEB-INF/views/index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Subscriber subscriber = new Subscriber();
        subscriber.setName(request.getParameter("name"));
        subscriber.setEmail(request.getParameter("email"));
        request.setAttribute("Subscriber", subscriber);
        request.setAttribute("SubscribeEmail", true);
    }
}
