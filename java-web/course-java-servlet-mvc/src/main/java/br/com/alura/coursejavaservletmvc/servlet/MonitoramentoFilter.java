package br.com.alura.coursejavaservletmvc.servlet;

import javax.servlet.*;
import java.io.IOException;

//@WebFilter(urlPatterns="/entrada")
public class MonitoramentoFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {}
	
	@Override
	public void destroy() {}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		System.out.println("MonitoramentoFilter");
		
		
		long antes = System.currentTimeMillis();
		
		String acao = request.getParameter("acao");
		
		//executa a acao
		chain.doFilter(request, response);
		
		long depois = System.currentTimeMillis();
		System.out.println("Tempo de execu��o da acao " + acao + " -> " + (depois - antes));
		
	}
	
}
