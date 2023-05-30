package br.edu.univas.models;

public class Produto {
	
	private int codProd;
	private String nomeProd;
	private double precoProd;
	private static int contadorCodProd = 0;
	
	public Produto(String nomeProd, double precoProd) {
		this.codProd = ++Produto.contadorCodProd;
		this.nomeProd = nomeProd;
		this.precoProd = precoProd;
	}
	
	private Produto(int codProd, String nomeProd, double precoProd) {
		this.codProd = codProd;
		this.nomeProd = nomeProd;
		this.precoProd = precoProd;
	}

	public Produto clone() {
		return new Produto(
				this.getCodProd(),
				this.getNomeProd(),
				this.getPrecoProd()
				);
	}

	public int getCodProd() {
		return this.codProd;
	}

	public String getNomeProd() {
		return this.nomeProd;
	}

	public double getPrecoProd() {
		return this.precoProd;
	}
	
	public String toString() {
		return 
				"Produto" + "\n" +
				"Código: " + this.getCodProd() + "\n" +
				"Nome: " + this.getNomeProd() + "\n" +
				"Preço: " + this.getPrecoProd() + "\n";
				}
		
	@Override
	public boolean equals(Object obj) {
		Produto aux = (Produto)obj;
		return this.codProd == aux.getCodProd();
	}

}
