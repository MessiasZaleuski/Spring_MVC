package com.algaworks.cobranca.model;

public enum StatusTitulo {
	//ADICIONANDO ENUMS
	PENDENTE("Pendente"),
	RECEBIDO("Recebido");
	
	
	
	private String descricao;
	
	//CONSTRUTOR
	StatusTitulo(String descricao){
		this.descricao = descricao;
		
	}
	
	public String getDescricao() {
		return descricao;
	}

}
