package OpBas;
import javax.swing.JOptionPane;
public class condicionalSwitch {
	public static void main(String[] args)
	{
	int estrato = Integer.parseInt(JOptionPane.showInputDialog("Especifique su Estrato"));
	switch (estrato)
	{
	case 1:
	JOptionPane.showInternalMessageDialog(null,"El Estrato " + estrato + " es beneficiado con 30%");
	break;
	case 2:
	JOptionPane.showInternalMessageDialog(null,"El Estrato " + estrato + " es beneficiado CON 20%");
	break;
	default:
	JOptionPane.showInternalMessageDialog(null,"El Estrato debe ser entre 1 y 2");
	}
	}
	
	
}
