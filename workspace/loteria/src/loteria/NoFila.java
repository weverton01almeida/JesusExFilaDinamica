package loteria;

public class NoFila {
	Sorteio info;
	NoFila proximo;

    public NoFila(Sorteio info)
	{
		this.info = info;
		this.proximo = null;
	}
}
