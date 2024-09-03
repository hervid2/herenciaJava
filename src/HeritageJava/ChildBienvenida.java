package HeritageJava;

import java.util.Scanner;

public class ChildBienvenida extends SuperClass{
	public void bienvenida() {
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("---Bienvenido al sistema contable de ventas en nuesta tienda tecnológica---");
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println(" ");
		System.out.println("Por favor ingrese según el número de una de las categorías para empezar: ");
		System.out.println(" ");
		System.out.println("1.--Computador--");
		System.out.println("2.--Celular-----");
		System.out.println("3.--Impresora----");
		System.out.println("4.--Audio---------");
		System.out.println("5.--Video---------");
		System.out.println("0.---Terminar y mostrar estadísticas---");
		categoria  = teclado.nextInt();
	}
}