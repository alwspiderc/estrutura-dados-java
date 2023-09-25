package lista.teste;

import lista.ListaEncadeada;

public class ListaEncadeadaTeste {
    public static void main(String[] args) throws Exception {
        ListaEncadeadaTeste testaListaEncadeada = new ListaEncadeadaTeste();        

        ListaEncadeada<Professor> listaEncadeada = new ListaEncadeada<>();
        testaListaEncadeada.addContato(listaEncadeada);

        while(listaEncadeada.temProximo()) {
			System.out.println(listaEncadeada.getAtual().getElemento().getNome());
		}

		System.out.println("\n\nRemovendo");
		testaListaEncadeada.removerContato(listaEncadeada);
		while (listaEncadeada.temProximo()) {
			System.out.println(listaEncadeada.getAtual().getElemento().getNome());
		}
    }

    public void addContato(ListaEncadeada listaEncadeada) {
        Professor prof1 = new Professor("Angela Peixoto Santana");
        Professor prof2 = new Professor("Osvaldo Requiao Melo");
        listaEncadeada.adiciona(prof1);
        listaEncadeada.adiciona(prof2);

	}
	public void removerContato(ListaEncadeada listaEncadeada) {
		listaEncadeada.remover();
	}
}
