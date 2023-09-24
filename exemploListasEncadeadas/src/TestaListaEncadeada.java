public class TestaListaEncadeada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestaListaEncadeada testaListaEncadeada = new TestaListaEncadeada();
		ListaEncadeada listaEncadeada = new ListaEncadeada();
		
		// System.out.println("Vamos começar adicionando os contatos");
		testaListaEncadeada.addContato(listaEncadeada);
		// System.out.println("Seus contatos foram adicionados na lista");
		
		//agora prof? como fazer para testar, ou melhor listar esses contato?? 
		// System.out.println("Provando que os contatos foram adicionados");
		while(listaEncadeada.temProximo()) {
			System.out.println(listaEncadeada.getPosicaoAtual().getValor().getNome());
		}
		
	//agora vamos remover
		// System.out.println("Mostra a remoção prof");
		// testaListaEncadeada.removerContato(listaEncadeada);
		// System.out.println("Contato removido com sucesso");
		// System.out.println("Depois da remoção a lista ficou assim");
		// while (listaEncadeada.temProximo()) {
		// 	System.out.println(listaEncadeada.getPosicaoAtual().getValor().getNome());
		// }
		

	}
	
	public void addContato(ListaEncadeada listaEncadeada) {
		Contato contato1 = new Contato (1, "Alex", "alex@rmail.com.br");//valor 1
		Contato contato2 = new Contato (2, "ester", "ester@email.com.br");//valor2
		Contato contato3 = new Contato (3, "Big", "big@emai.com.br");//valor3
		Contato contato4 = new Contato (4, "Felipe", "Felipe@email.com.br");//valor4
		Contato contato5 = new Contato (5, "Dandara", "dandara@email.com.br"); //valor5
		Contato contato6 = new Contato (6, "Lucca", "luccaemail.com.br"); //valor6
		
		listaEncadeada.adicionar(contato1);// |Alex | |-->
		listaEncadeada.adicionar(contato2);// |Alex | |-->| Ester| |-->
		listaEncadeada.adicionar(contato3);// |Alex | |-->| Ester| |-->|Big| |-->
		listaEncadeada.adicionar(contato4);// |Alex | |-->| Ester| |-->|Big| |--> |Felipe| |-->
		listaEncadeada.adicionar(contato5);// |Alex | |-->| Ester| |-->|Big| |--> |Felipe| |-->|Dandara| |-->
		listaEncadeada.adicionar(contato6);// |Alex | |-->| Ester| |-->|Big| |--> |Felipe| |-->|Dandara| |-->|Lucca| |--> 
	}
	
	public void removerContato(ListaEncadeada listaEncadeada) {
		listaEncadeada.remover();
		listaEncadeada.remover();
	}
	

}