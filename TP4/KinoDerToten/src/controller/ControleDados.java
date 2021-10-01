package controller;

import models.*;

public class ControleDados {
	private Dados d = new Dados();
	
	
	
	public ControleDados() {
		d.preencheDataBase();
	}
	
	public Dados getDados() {
		return d;
	}
	public void setDados(Dados d) {
		this.d = d;
	}
	
	public Filme[] getFilmes() {
		return this.d.getFilmes();
	}
	public int getQtdFilmes() {
		return this.d.getQtdFilmes();
	}
	
	public Sessao[] getSessoes() {
		return this.d.getSessoes();
	}
	public int getQtdSessoes() {
		return this.d.getQtdSessoes();
	}
	
	public Unidade[] getUnidades() {
		return this.d.getUnidades();
	}
	public int getQtdUnidades() {
		return this.d.getQtdUnidades();
	}
	
	public Cliente[] getClientes() {
		return this.d.getClientes();
	}
	public int getQtdClientes() {
		return this.d.getQtdClientes();
	}
	
	public Filme getFilmeFromTitulo(String s) {
		//Filme film = ControleDados.getDados().getFilmes()[0];
		Filme film = d.getFilmes()[0];
		String aux;
		
		for(int i=0; i<getQtdFilmes(); i++) {
			aux = d.getFilmes()[i].getTitulo();
			if(s.compareTo(aux)==0) {
				//film = ControleDados.getDados().getFilmes()[i];
				film = d.getFilmes()[i];				
			}
		}
		return film;
	}
	
	public Unidade getUnidadeFromShopping(String s) {
		Unidade uni = d.getUnidades()[0];
		String aux;
		
		for(int i=0; i<getQtdUnidades(); i++) {
			aux = d.getUnidades()[i].getShopping();
			if(s.compareTo(aux)==0) {
				uni = d.getUnidades()[i];
				
			}
		}
		return uni;
	}	
	
	public boolean retornaBool(String s) {
		if(s=="1") return true;
		else return false;
	}
	
	public boolean inserirEditarFilme(String[] dadoNovo) {
		//if(!dadosFilmes[3].matches("[0-9]+") || !dadosFilmes[4].matches("[0-9]+") || 
				//!dadosFilmes[5].matches("[0-9]+") || !dadosProfs[6].matches("[0-9]+")) {
		//	return false;
	//	} else {
				Filme f = new Filme(dadoNovo[1], dadoNovo[2], Integer.parseInt(dadoNovo[3]),  dadoNovo[4], Integer.parseInt(dadoNovo[5]), dadoNovo[6]);
				d.inserirEditarFilme(f, Integer.parseInt(dadoNovo[0]));
				return true;
		//}
	}

	public boolean removerFilme(int pos) {
		int i;
		int qtd = d.getQtdFilmes();
		
		for (i = pos; i<qtd-1; i++) {
			d.getFilmes()[i] = d.getFilmes()[i+1];
		}
		d.setQtdFilmes(qtd-1);
		
		return true;
	}

	public boolean inserirEditarSessao(String[] dadoNovo) {
		//if(!dadosFilmes[3].matches("[0-9]+") || !dadosFilmes[4].matches("[0-9]+") || 
			//!dadosFilmes[5].matches("[0-9]+") || !dadosProfs[6].matches("[0-9]+")) {
			//return false;
	//	} else {
			Sessao sess = new Sessao(getFilmeFromTitulo(dadoNovo[1]), dadoNovo[2], getUnidadeFromShopping(dadoNovo[3]), Integer.parseInt(dadoNovo[4]), retornaBool(dadoNovo[5]));
			d.inserirEditarSessao(sess, Integer.parseInt(dadoNovo[0]));
			return true;
		//}
	}

}