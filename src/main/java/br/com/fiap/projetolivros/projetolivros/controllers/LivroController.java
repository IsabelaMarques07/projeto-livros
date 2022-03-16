package br.com.fiap.projetolivros.projetolivros.controllers;

import java.util.List;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fiap.projetolivros.projetolivros.model.Livros;

@Controller
public class LivroController {
	
	@GetMapping("/livros")
	public ModelAndView index() {
		ModelAndView modelView = new ModelAndView("livros/index");
		
		Livros livro1 = new Livros(new Long(1), "Harry Potter", "Bruxo", 1998, "JK. Rowling", "Fantasia");
		Livros livro2 = new Livros(new Long(1), "Percy Jackson", "Semideus", 2005, "Rick Riordan", "Fantasia");
		Livros livro3 = new Livros(new Long(1), "O Código Da Vinci", "Símbolos", 2008, "Dan Brown", "Mistério");
		
		
		List<Livros> livros = Arrays.asList(livro1, livro2, livro3);
		modelView.addObject("listarLivros", livros);
		
		return modelView;
	}
}
