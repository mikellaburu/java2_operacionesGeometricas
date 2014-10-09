
import java.util.*;

import com.zubiri.geometria.*;



public class OperacionesGeometricas {

	public static void main(String[] args) {

		Scanner tecla1=new Scanner(System.in);
		String opcion=" ";
		
		System.out.println("Elige una figura geometrica:");
		System.out.println("a) Circulo");
		System.out.println("b) Rectangulo");
		System.out.println("x) Salir");
		
		opcion=tecla1.next();


		while (!opcion.equalsIgnoreCase("x")){

		  if ((opcion.equalsIgnoreCase("a"))||(opcion.equalsIgnoreCase("b"))||(opcion.equalsIgnoreCase("x"))){
			if (opcion.equalsIgnoreCase("a")){
				double radio=0;
				//Circulo c1=new Circulo();
				System.out.println("Circulo");
				System.out.println("Introduce el radio:");
				radio=tecla1.nextDouble();
				//c1.setRadio(radio);

				Circulo c1=new Circulo(radio);

				System.out.println("Area: "+c1.calculaArea());
				System.out.println("Perimetro: "+c1.calculaPerimetro());
			}
			if (opcion.equalsIgnoreCase("b")){
				double base=0; double altura=0;
				//Rectangulo r1=new Rectangulo();
				System.out.println("Rectangulo");
				System.out.println("Introduce la base:");
				base=tecla1.nextDouble();
				//r1.setBase(base);
				System.out.println("Introduce la altura:");
				altura=tecla1.nextDouble();
				//r1.setAltura(altura);

				Rectangulo r1=new Rectangulo(base,altura);

				System.out.println("Area: "+r1.calculaArea());
				System.out.println("Perimetro: "+r1.calculaPerimetro());
			}


		  }else{
			System.out.println("Opcion no valida");
		  }

		  System.out.println("Quieres hacer otra operacion?");
  		  System.out.println("a) Circulo");
		  System.out.println("b) Rectangulo");
		  System.out.println("x) Salir");
		  
		  opcion=tecla1.next();
		  
		}
		
		if (opcion.equalsIgnoreCase("x")){
			System.out.println("Salir, programa terminado");
			System.exit(0);
		}

		
		
		
		

	}

}

