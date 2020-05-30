import javax.swing.JOptionPane;

public class Excecao {
	public int tratar(String opt) {
		// metodo para excec�o op��o
		int b = 0;
		int teste;
		try {
			teste = Integer.parseInt(opt);
			b = 1;
		}
		catch(NumberFormatException n) {
			// caso a convers�o n�o seja poss�vel
			JOptionPane.showMessageDialog(null,"Erro no programa, tente novamente.","Erro no programa",JOptionPane.WARNING_MESSAGE);
			System.out.println("");
		}
		return b;
	}
public int tratarmin(String min) {
	// m�todo para exce��o minutos
	int b = 0;
	double teste;
	try{
		teste = Double.parseDouble(min);
		//tentando converter 
		b = 1;
	}
	catch(NumberFormatException n) {
		// caso a convers�o n�o seja poss�vel
		JOptionPane.showMessageDialog(null,"Erro no programa,tente novamente.","Erro no programa",JOptionPane.WARNING_MESSAGE);
	}
	return b;
	}
}
