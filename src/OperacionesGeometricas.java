
import java.util.*;

import com.zubiri.geometria.*;



public class OperacionesGeometricas {

	public static void main(String[] args) {

		Scanner tecla1=new Scanner(System.in);
		String opcion=" ";
		
		System.out.println("Elige una figura geometrica:");
		System.out.println("a) Circulo");
		System.out.println("b) Rectangulo");
		
		opcion=tecla1.next();
		
		

		
		if ((opcion.equalsIgnoreCase("a"))||(opcion.equalsIgnoreCase("b"))){
			if (opcion.equalsIgnoreCase("a")){
				double radio=0;
				System.out.println("Circulo");
				System.out.println("Introduce el radio:");
				radio=tecla1.nextDouble();
				Circulo c1=new Circulo(radio);
//				c1.setRadio(radio);
				System.out.println("Area: "+c1.calculaArea());
				System.out.println("Perimetro: "+c1.calculaPerimetro());
			}
			if (opcion.equalsIgnoreCase("b")){
				double base=0; double altura=0;
				System.out.println("Rectangulo");
				System.out.println("Introduce la base:");
				base=tecla1.nextDouble();
				System.out.println("Introduce la altura:");
				altura=tecla1.nextDouble();
				Rectangulo r1=new Rectangulo(base,altura);
				//r1.setBase(base);
				//r1.setAltura(altura);
				System.out.println("Area: "+r1.calculaArea());
				System.out.println("Perimetro: "+r1.calculaPerimetro());
			}

		}else{
			System.out.println("Opcion no valida");
		}
		
		

	}

}

