/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author AlexanderSteen
 */
@WebServlet(name = "BaseServlet")
public class BaseServlet extends HttpServlet {

    protected void forward(String jspUrl, HttpServletRequest servletRequest, HttpServletResponse servletResponse){
        RequestDispatcher dispatcher = servletRequest.getRequestDispatcher(jspUrl);
        try {
            dispatcher.forward(servletRequest, servletResponse);
        } catch (ServletException ex) {
            Logger.getLogger(BaseServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BaseServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
