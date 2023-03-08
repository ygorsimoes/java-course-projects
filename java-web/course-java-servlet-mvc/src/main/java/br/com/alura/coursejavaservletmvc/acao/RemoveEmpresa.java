package br.com.alura.coursejavaservletmvc.acao;

import br.com.alura.coursejavaservletmvc.modelo.Banco;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RemoveEmpresa {
    public void executa(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String paramId = request.getParameter("id");
        Integer id = Integer.valueOf(paramId);

        System.out.println(id);

        Banco banco = new Banco();
        banco.removeEmpresa(id);

        response.sendRedirect("entrada?acao=ListaEmpresas");
    }
}
