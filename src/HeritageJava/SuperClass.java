package HeritageJava;

import java.util.Scanner;

public abstract class SuperClass {
	Scanner scanner = new Scanner (System.in);
	protected Scanner teclado;
    protected int categoria;
    protected float ventasComputador;
    protected float ventasCelular;
    protected float ventasImpresora;
    protected float ventasAudio;
    protected float ventasVideo;
    protected float cantidadVenta;
    protected float total;
    
public void bienvenida() {
}
	
public void cargar() {
}

public void imprimir(){
}
}

/* Una tienda de accesorios tecnológicos necesita un programa
que lleve a cabo el registro contable de las ventas diarias. El programa deberá sumar el total
de ventas globales en el día y a su vez mostrar el total de ventas en diarias por cada una de sus 
categorías (Computadores, celulares, impresoras, audio y video). */

