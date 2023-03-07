package br.com.alura.coursejavaservlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "getParameter", value = "/get-parameter")
public class GetParameter extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");

        if (request.getParameter("name") != null) {
            out.println("<h1> Hello " + request.getParameter("name") + "!</h1>");
        } else {
            out.println("<h1> Hello World! </h1>");
        }

        out.println("</body></html>");
    }
}