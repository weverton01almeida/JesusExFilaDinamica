public class FilaDinamica {
	NoFila inicio;
	NoFila fim;

	public FilaDinamica() {
		inicio = null;
		fim = null;
	}

	public void enqueue(double valor) {

		NoFila p = new NoFila(valor);

		if (filaEstaVazia()) // caso a fila esteja vazia
		{
			inicio = p;
		}

		else // caso contrario
		{
			fim.proximo = p;
		}

		fim = p; // fim da fila aponta para novo elemento

	}

	public double get_first() {
		return inicio.info;
	}

	public void clear() {
		inicio = null;
	}

	public int size() {
		int QNT = 0;
		NoFila q;

		for (q = inicio; q != null; q = q.proximo) {
			QNT++;
		}
		return QNT;

	}

	public void exibirInverso() {
		NoFila q;
		NoPilha r;
		PilhaDinamica pilha = new PilhaDinamica();
		for (q = inicio; q != null; q = q.proximo) {
			pilha.push(q.info);
		}
		for (r = pilha.topo; r != null; r = r.proximo) {
			System.out.println(pilha.pop());
		}
	}
	public void inverter(){
		PilhaDinamica pilha = new PilhaDinamica();
		while (filaEstaVazia() == false) {
			pilha.push(dequeue());
		}
		while (pilha.pilhaEstaVazia() == false) {
			enqueue(pilha.pop());
		}
	}
	public void retiraImpar(){
		PilhaDinamica aux = new PilhaDinamica();
		while (filaEstaVazia() == false) {
			double v = dequeue();
			if(v% 2 == 0){
			aux.push(v);
			}
		}
		while(aux.pilhaEstaVazia() == false){
			enqueue(aux.pop());
		}
	}

	public double dequeue() {

		double v;

		if (filaEstaVazia()) {
			System.out.println("Fila vazia.");
			System.exit(1); // aborta programa
		}

		v = inicio.info;
		inicio = inicio.proximo;

		if (inicio == null) // fila ficou vazia?
		{
			fim = null; // fim tambem deve receber null
		}

		return v;

	}

	public void imprime() {
		NoFila q;
		if (filaEstaVazia()) {
			System.out.println("Fila vazia.");
			System.exit(1); // aborta programa
		} else {
			for (q = inicio; q != null; q = q.proximo) {
				System.out.print(q.info + " ");
			}
		}
		System.out.println();
	}

	public boolean filaEstaVazia() {
		return (inicio == null);
	}

}
