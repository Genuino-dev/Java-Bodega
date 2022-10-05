import java.util.ArrayList;
import java.util.Scanner;

public class Bodega {
	
	public static void main (String [] args) {
		
		Scanner input = new Scanner(System.in);
		
		ArrayList <Funcionario> funcionarios = new ArrayList<>();
		ArrayList <Bebida> bebidas = new ArrayList<>();
		ArrayList <Clientes> cliente1 = new ArrayList <>();
		
		int opcao=-1;
		
		while (opcao!=9){
	
			System.out.println("Escolha o que deseja realizar em sua bodega\n");
			System.out.println("1. Cadastrar funcionario");
	        System.out.println("2. Mostrar funcionarios");
	        System.out.println("3. Cadastrar Bebidas"); 
	        System.out.println("4. Mostrar Bebidas");
	        System.out.println("5. Compra de Bebida"); 
	        System.out.println("6. Venda de Bebida");
	        System.out.println("8. Mostrar clientes");
	        System.out.println("9. Sair do Sistema");
	        break; 
	        } 
		opcao = input.nextInt();
		input.nextLine();
		switch (opcao){
        
        case 1: 
        	System.out.println("Digite o codigo de Funcionario");
        	int codigo = input.nextInt(); 
        	System.out.println("Digite o nome de Funcionario");
        	String nome = input.nextLine();
        	input.nextLine();
        	System.out.println("Digite a idade de Funcionario");
        	int idade = input.nextInt();
        	System.out.println("Digite o salario de seu funcionario");
        	int salario = input.nextInt();
        	
        	Funcionario f = new Funcionario (codigo, nome, idade, salario);
        	funcionarios.add (f);
        	System.out.println("Cadastro realizado com sucesso!");
        	break;
       
        case 2: 
        	System.out.println("Vamos mostrar seus funcionarios:");
        	if (funcionarios.size()==0){
        		System.out.println("Nao existe funcionarios cadastrados em sua lista");
        	} else {
        		for (int i=0; i < funcionarios.size(); i++) {
        			Funcionario func =  (Funcionario) funcionarios.get(i); // vou ter que instanciar um novo objeto pra usar o metodo get
        			System.out.println("Codigo:" + func.codigo); 
        			System.out.println("Nome:" + func.nome);// criei o novo object e usei . pra referenciar o atributo da classe funcionario  
        			System.out.println("Idade:" + func.idade); // 
        			System.out.println("Salario" + func.salario);  //
        		}
        				
        	} break;
        	
        case 3: 
        	System.out.println("Cadastre sua nova bebida!");
        	System.out.println("Digite o codigo da bebida");
        	codigo = input.nextInt();
        	System.out.println("Digite o nome da bebida");
        	nome = input.nextLine();
        	System.out.println("Digite o teor Alcoolico da bebida");
        	int teorAlc = input.nextInt();
        	System.out.println("Digite a quantidade em ML");
        	int quantidadeML = input.nextInt();
        	System.out.println("Digite o preco de venda de sua bebida");
        	float precoVenda = input.nextFloat();
        	System.out.println("Digite sua quantidade em estoque atual");
        	int quantidadeEstoque = input.nextInt();
        	
        	Bebida bebid = new Bebida (codigo, nome, teorAlc, quantidadeML,precoVenda, quantidadeEstoque);
        	bebidas.add(bebid);
        	break;
        case 4:
        	System.out.println("As bebidas de seu estoque:");
        	for (int i=0; i < bebidas.size(); i++) {
        		Bebida beb = (Bebida) bebidas.get(i);
        		System.out.println("Codigo:" + beb.codigo);
        		System.out.println("Nome" + beb.nome);
        		System.out.println("Teor Alcoolico" + beb.teorAlc);
        		System.out.println("Quantidade em ML" + beb.quantidadeML);
        		System.out.println("Preço de venda" + beb.precoVenda);
        		System.out.println("Quantidade em estoque"+ beb.quantidadeEstoque);
        		
        	}break;
      
        case 5: 
        	System.out.println("Digite o codigo da bebida que deseja comprar");
        	int cod = input.nextInt();
        	input.nextLine();
            
            if(cod < 0 || cod > bebidas.size()){
                System.out.printf("Codigo incorreto! Verifique o codigo e tente novamente!");
            } else {
                
               Bebida novaBebida = (Bebida) bebidas.get(cod);
                System.out.printf("Qual a quantidade de bebidas a ser adicionada?\n");
                int bebidasCompradas = input.nextInt();
                input.nextLine();

                novaBebida.comprarBebidas(bebidasCompradas);
               
            } break;

        case 6:
        	System.out.println("Digite o codigo que deseja vender");
        	int codi;
        	codi = input.nextInt();
        	input.nextLine();
        	
        	if (codi < 0 || codi > bebidas.size()) {
        		System.out.println("Codigo incorreto! Verifique o codigo e tente novamente!");
        	} else {
        		
        		Bebida novaBeb = (Bebida) bebidas.get(codi);
        		System.out.println("Digite a quantidade de bebidas a ser vendida");
        		int quantidadeVendida=0;
        		quantidadeVendida = input.nextInt();
        		input.nextLine();
        		novaBeb.venderBebida(quantidadeVendida);
        
        	}  
        	              
        	break;
        	
        	
        case 7:
        	System.out.println("Qual o  nome do cliente ?");
        	String name = input.nextLine();
        	System.out.println("Digite o CPF do cliente");
        	String CPF = input.nextLine();
        	System.out.println("Vai poder vender fiado essa bebida?");
        	Boolean venderFiado = input.nextBoolean();
        	int quantidadeCliente = 0;
        	Clientes novoCliente = new Clientes(quantidadeCliente, name, CPF, venderFiado);
        	cliente1.add(novoCliente);
        	quantidadeCliente ++;
        	
            break;
            
        case 8:
        	if (cliente1.size()==0){
        		System.out.println("Nao existe clientes cadastrados");
        	} else {
                     for(int i = 0; i < cliente1.size(); i++ ){
                         novoCliente = (Clientes) cliente1.get(i);

                         System.out.printf("\nCodigo: " + novoCliente.codigo);
                         System.out.printf("\nNome: " + novoCliente.nome);
                         System.out.printf("\nCPF: " + novoCliente.CPF);
                         System.out.printf("\nVender Fiado: " + novoCliente.venderFiado + "\n");
                     }
                     break;
                     
               
        	} 
        	case 9: 
        	System.out.println("Obrigada por utilizar nosso Sistema de Gerenciamento de Bodegas");	
        	break;

        }
		}  
      
    
}
	