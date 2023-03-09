package br.com.alura.coursejavaservletmvc.acao;

import br.com.alura.coursejavaservletmvc.modelo.Banco;
import br.com.alura.coursejavaservletmvc.modelo.Empresa;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MostraEmpresa  implements Acao{

	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("mostrando dados da empresa");
		
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		Banco banco = new Banco();
		
		Empresa empresa = banco.buscaEmpresaPelaId(id);
		
		System.out.println(empresa.getNome());

		request.setAttribute("empresa", empresa);
		
		return "forward:formAlteraEmpresa.jsp";
	}
}
