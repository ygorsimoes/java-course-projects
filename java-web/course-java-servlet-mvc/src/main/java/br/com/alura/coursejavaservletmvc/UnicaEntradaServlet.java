package br.com.alura.coursejavaservletmvc;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/entrada")
public class UnicaEntradaServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void service(HttpServletRequest request, HttpServletResponse response) {

        String paramAcao = request.getParameter("acao");

        if (paramAcao.equals("ListaEmpresas")) {
            System.out.println("Listando empresas");
        } else if (paramAcao.equals("RemoveEmpresa")) {
            System.out.println("Removendo empresa");
        } else {
            System.out.println("Ação não encontrada");
        }
    }
}
