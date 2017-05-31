public class PilhaDinamica
{
	NoPilha topo;
	
	public PilhaDinamica()
	{
		this.topo = null;
	}
	
	public void push(double valor)
	{
		NoPilha aux = new NoPilha(valor);
		aux.proximo = topo;
		topo = aux;
	}
	
	public double pop()
	{
		double valor;
		NoPilha aux;
		
		if (pilhaEstaVazia()) 
		{
			System.out.println("Pilha vazia.");
			System.exit(1); /*aborta o programa*/
		}
		
		valor = topo.info;
		
		aux = topo;
		topo = aux.proximo;
		
		return valor;
	}
	
	public void imprime() 
	{
		for(NoPilha q = topo; q!=null; q = q.proximo)
		{
			System.out.println(q.info);
		}
	}

	public boolean pilhaEstaVazia()
	{
		return (topo == null);
	}



	
}