package HeritageJava;

public class ChildImpresoras extends SuperClass{
	public void imprimir(){
		if(categoria==0) {
			 System.out.println("El total en ventas acumulado de las impresoras es: "+ventasImpresora);
		}else {}
	}
}

/* Una tienda de accesorios tecnológicos necesita un programa
que lleve a cabo el registro contable de las ventas diarias. El programa deberá sumar el total
de ventas globales en el día y a su vez mostrar el total de ventas en diarias por cada una de sus 
categorías (Computadores, celulares, impresoras, audio y video). */