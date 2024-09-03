package HeritageJava;

public class prueba  {
	   public static void main(String[] ar) {
		   ChildBienvenida categoriaBienvenida = new ChildBienvenida();
		   categoriaBienvenida.bienvenida();
		   ChildCargar categoriaCargar= new ChildCargar();
		   categoriaCargar.cargar();
		   ChildComputadores categoriaComputador = new ChildComputadores ();
		   categoriaComputador.imprimir();
		   ChildCelulares categoriaCelular = new ChildCelulares ();
		   categoriaCelular.imprimir();
		   ChildImpresoras categoriaImpresora = new ChildImpresoras ();
		   categoriaImpresora.imprimir();
		   ChildAudio categoriaAudio = new ChildAudio ();
		   categoriaAudio.imprimir();
		   ChildVideo categoriaVideo = new ChildVideo ();
		   categoriaVideo.imprimir();
	   }
	   
}

/* Una tienda de accesorios tecnológicos necesita un programa
que lleve a cabo el registro contable de las ventas diarias. El programa deberá sumar el total
de ventas globales en el día y a su vez mostrar el total de ventas en diarias por cada una de sus 
categorías (Computadores, celulares, impresoras, audio y video). */
