package br.com.alura.coursejavaservletmvc.acao;

import br.com.alura.coursejavaservletmvc.modelo.Banco;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RemoveEmpresa  implements Acao {

	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("acao removendo empresa");
		
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		System.out.println(id);
		
		Banco banco = new Banco();
		banco.removeEmpresa(id);
		
		return "redirect:entrada?acao=ListaEmpresas";
	
	}
}
