public class FilaDinamicaTeste 
{
	public static void main(String[] args) 
	{
		FilaDinamica f = new FilaDinamica();

		/*f.enqueue(20.0);
		f.enqueue (20.8);
		f.enqueue (20.2);
		f.enqueue (20.3);*/
		//Colocando objetos na fila
		for(int i = 1; i < 100; i++){
			f.enqueue(i);
		}
		//primeiro elemento
		System.out.println("Questao 1");
		System.out.println(f.get_first());
		System.out.println("----------");
		//size
		System.out.println("Questao 3");
		System.out.println(f.size());
		System.out.println("----------");
		//exibir inverso
		System.out.println("Questao 4");
		f.exibirInverso();
		System.out.println("----------");
		//Inverter
		System.out.println("Questao 5");
		f.inverter();
		f.imprime();
		System.out.println("----------");
		//RetiraImpar
		System.out.println("Questao 6");
		f.retiraImpar();
		f.imprime();
		System.out.println("----------");
		//clear
		System.out.println("Questao 2");
		f.clear();
		f.imprime();
		System.out.println("-----------");
		// libera memória
	/*	f = null;*/
	}
	
}