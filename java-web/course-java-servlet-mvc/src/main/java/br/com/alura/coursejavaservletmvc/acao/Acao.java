package br.com.alura.coursejavaservletmvc.acao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface Acao {

	String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
