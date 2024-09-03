package HeritageJava;
import java.util.Scanner;

public class ChildCargar extends SuperClass {
	public void cargar() {
		float acumuladorVentaComputador;
		float acumuladorVentaCelular;
		float acumuladorVentaImpresora;
		float acumuladorVentaAudio;
		float acumuladorVentaVideo;
		do {
			if(categoria==1) {
				System.out.println("ingrese el valor de la venta del computador(valor decimal):");
				acumuladorVentaComputador = teclado.nextFloat();
				acumuladorVentaComputador++;
				acumuladorVentaComputador=ventasComputador;
			}
			if(categoria==2) {
				System.out.println("ingrese el valor de la venta del celular(valor decimal):");
				acumuladorVentaCelular = teclado.nextFloat();
				acumuladorVentaCelular++;
				acumuladorVentaCelular=ventasCelular;
			}
			if(categoria==3) {
				System.out.println("ingrese el valor de la venta de la impresora(valor decimal):");
				acumuladorVentaImpresora = teclado.nextFloat();
				acumuladorVentaImpresora++;
				acumuladorVentaImpresora=ventasImpresora;
			}
			if(categoria==4) {
				System.out.println("ingrese el valor de la venta del componente de audio(valor decimal):");
				acumuladorVentaAudio= teclado.nextFloat();
				acumuladorVentaAudio++;
				acumuladorVentaAudio=ventasAudio;
			}
			if(categoria==5) {
				System.out.println("ingrese el valor de la venta del componente de video(valor decimal):");
				acumuladorVentaVideo= teclado.nextFloat();
				acumuladorVentaVideo++;
				acumuladorVentaVideo=ventasVideo;
			}
			else {
				System.out.println("El número ingresado no ha sido reconocido. Intente de nuevo!");
				continue;
			}
		}while(categoria!=0);
}

}