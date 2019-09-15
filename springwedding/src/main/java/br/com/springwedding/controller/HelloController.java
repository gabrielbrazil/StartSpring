package br.com.springwedding.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HelloController {

	private String nome;
	
	@RequestMapping("/olaMundoSpring")
	public String execute(){
		System.out.println("Testet");
		return "hello";
	}
	
	@RequestMapping("/sayHelloWorld")
	public String sayHello(Model model,String nome){
		model.addAttribute("nome",nome);
		return "changedRebase";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	};
	
	
}


