
public class Bebida  {
	
	int codigo;
	String nome;
	float teorAlc;
	int quantidadeML;
	float precoVenda;
	int quantidadeEstoque;
	
	Bebida (int codigo, String nome, float teorAlc, int quantidadeML, float precoVenda, int quantidadeEstoque) {
		
		this.codigo=codigo;		
		this.nome=nome;
		this.teorAlc=teorAlc;
		this.quantidadeML=quantidadeML;
		this.precoVenda =precoVenda;
		this.quantidadeEstoque= quantidadeEstoque;
	}
	
	public void venderBebida(int bebidasVendidas){
		if( bebidasVendidas > this.quantidadeEstoque ){
			System.out.printf ("ERRO! Voce nao tem quantidade suficiente em estoque" );
				System.out.println ("A quantidade no estoque atual e de:" + this.quantidadeEstoque +
									" Quantidade Vendida: " + bebidasVendidas + "\n" +
									" A quantidade Vendida não pode ser maior que a quantidade em estoque!\n");
		} else {
            this.quantidadeEstoque -= bebidasVendidas; 
		}
	}
	
		void comprarBebidas(int bebidasCompradas){
		this.quantidadeEstoque+= bebidasCompradas;
	}

		
	}

