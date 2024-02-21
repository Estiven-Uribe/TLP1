package OpBas;
import java.util.Scanner;

public class BasicOp {

	
	public static void main(String[] args)
	{
	// Condicional if
	final int valor_techo = 100;
	Scanner dato = new Scanner(System.in);
	int num1 = 0;
	int num2 = 0;
	int operacion = 0;
	System.out.println("Digite el primer valor");
	num1 = dato.nextInt();
	System.out.println("Digite el segundo valor");
	num2 = dato.nextInt();
	operacion = num1 + num2;
	if(operacion > valor_techo)
	{
	System.out.print("La suma de los valores " + operacion + " superan el valor techo." + valor_techo);
	}
	else
	{
	System.out.print("La suma de los valores ingresados es: " +
	operacion);
	}
	//dato.close();
	}
	
}
