package br.edu.univas.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.edu.univas.models.Produto;

public class GerenciadorProdutos {
	private static ArrayList<Produto> dadosProd;
	
	public GerenciadorProdutos() {
		if(dadosProd == null)
			dadosProd = new ArrayList<>();
	}
	
	public boolean adicionarProduto(Produto produto) {
		Produto produtoDuplicado = retornaProduto(produto.getCodProd());
		if(produtoDuplicado == null) {
			dadosProd.add(produto.clone());
			return true;
		}
		return false;
	}
	
	public Produto retornaProduto(int codProd) {
		for(Produto prod : dadosProd) {
			if(prod.getCodProd() == codProd) 
				return prod.clone();
		}
		return null;
	}
	
	public List<Object> listarProdutos(){
		return Arrays.asList(dadosProd.clone());
	}
	
	public void removerProduto(int codProd) {
		Produto produtoASerExcluido = null;
		for(Produto prod : dadosProd) {
			if(prod.getCodProd() == codProd) 
				produtoASerExcluido = prod;
		}
		if(produtoASerExcluido != null) 
			dadosProd.remove(produtoASerExcluido);
	}
	
}
