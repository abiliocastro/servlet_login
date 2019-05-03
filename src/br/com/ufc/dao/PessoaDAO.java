package br.com.ufc.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.ufc.model.Pessoa;

public class PessoaDAO {
	private List<Pessoa> pessoas;
	
	public PessoaDAO() {
		pessoas = new ArrayList<Pessoa>();
		pessoas.add(new Pessoa("Cassio","feio"));
		pessoas.add(new Pessoa("Ralf","cachorrao"));
	}

	public Pessoa buscarPessoa(String username, String senha) {
		Pessoa pessoa = new Pessoa(username, senha);

		if(pessoas.contains(pessoa)) {
			return pessoa;
		}
		
		return null;
	}
	
}
