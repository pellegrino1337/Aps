import javax.swing.JOptionPane;

public class Excecao {
	public int tratar(String opt) {
		// metodo para excecão opção
		int b = 0;
		int teste;
		try {
			teste = Integer.parseInt(opt);
			b = 1;
		}
		catch(NumberFormatException n) {
			// caso a conversão não seja possível
			JOptionPane.showMessageDialog(null,"Erro no programa, tente novamente.","Erro no programa",JOptionPane.WARNING_MESSAGE);
			System.out.println("");
		}
		return b;
	}
public int tratarmin(String min) {
	// método para exceção minutos
	int b = 0;
	double teste;
	try{
		teste = Double.parseDouble(min);
		//tentando converter 
		b = 1;
	}
	catch(NumberFormatException n) {
		// caso a conversão não seja possível
		JOptionPane.showMessageDialog(null,"Erro no programa,tente novamente.","Erro no programa",JOptionPane.WARNING_MESSAGE);
	}
	return b;
	}
}
