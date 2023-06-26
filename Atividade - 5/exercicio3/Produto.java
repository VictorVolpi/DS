package exercicio3;

public class Produto {
	private int idProduto;
	private String produto;
	private String descProduto;
	private double valor;
	private String dataDoCadastro;

	
	
	public Produto(int id,String produto,String descProduto, double valor, String dataDoCadastro) {
		this.idProduto = idProduto;
		this.produto = produto;
		this.descProduto = descProduto;
		this.valor = valor;
		this.dataDoCadastro = dataDoCadastro;
		
	}
	
	public int getIdProduto() {
		return idProduto;
	}
	public void setId (int idProduto) {
		this.idProduto = idProduto;
	}
	
	public String getProduto() {
		return produto;
	}
	public void setProduto (String produto) {
		this.produto = produto;
	}
	
	
	public String getdescProduto() {
		return descProduto;
	}
	public void setdescProduto (String descProduto) {
		this.descProduto = descProduto;
	}
	
	public double getValor() {
		return valor;
	}
	public void setValor (double valor) {
		this.valor = valor;
	}
	
	public String getdataDoCadastro() {
		return dataDoCadastro;
	}
	public void setdataDoCadastro (String dataDoCadastro) {
		this.dataDoCadastro = dataDoCadastro;
	}

	
	public void exibirProduto() {
		System.out.println(getIdProduto()+" " +getProduto()+" "+ getdescProduto()+" "+getValor()+" "+getdataDoCadastro());
	}

}
