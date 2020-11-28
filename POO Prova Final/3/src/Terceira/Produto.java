package Terceira;
//Classe de herança
public class Produto implements Comparable<Produto>{
	protected String item;
	protected double preco;
	
	public Produto(String item, double preco) {
		this.item = item;
		this.preco = preco;
	}
	
	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}
	
	
	@Override
	public int compareTo(Produto outroProduto) {
		if (this.preco > outroProduto.getPreco()) { 
			  return -1; 
			  } else if (this.preco < outroProduto.getPreco()) { 
			  return 1; 
			  } 
		return 0;
	}

	

}
