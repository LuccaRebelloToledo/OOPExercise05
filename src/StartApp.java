import br.edu.univas.models.Produto;
import br.edu.univas.services.GerenciadorProdutos;

public class StartApp {

	public static void main(String[] args) {
		Produto geladeira = new Produto("Geladeira", 150.50);
		Produto fogao = new Produto("Fogão", 300.50);
		Produto maquinaDeLavarRoupa = new Produto("Maquina de Lavar Roupa", 3000.99);
		GerenciadorProdutos gerenciador = new GerenciadorProdutos();
		
		gerenciador.adicionarProduto(geladeira);
		gerenciador.adicionarProduto(fogao);
		gerenciador.adicionarProduto(maquinaDeLavarRoupa);
		gerenciador.listarProdutos();
		gerenciador.removerProduto(geladeira.getCodProd());
		gerenciador.listarProdutos();
	}

}
