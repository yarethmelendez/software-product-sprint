package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/form-handler")
public class formHandlerServlet extends HttpServlet {

  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    // Get the value entered in the form.
    String firstName = request.getParameter("first-name");
    String lastName = request.getParameter("last-name");
    String country = request.getParameter("country");
    String message = request.getParameter("message");


    // Print the value so you can see it in the server logs.
    System.out.println("Your name: " + firstName);
    System.out.println("Your last name: " + lastName);
    System.out.println("Your country: " + country);
    System.out.println("Your message: " + message);

    // Write the value to the response so the user can see it.
    response.getWriter().println("Your name: " + firstName);
    response.getWriter().println("Your last name: " + lastName);
    response.getWriter().println("Your country: " + country);
    response.getWriter().println("Your message: " + message);

    
    response.sendRedirect("https://ymelendez-sps-summer21.appspot.com/index.html");
  }
}