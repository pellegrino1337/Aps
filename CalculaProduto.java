import javax.swing.JOptionPane;

public class CalculaProduto extends Produtos {
	//classe filha produto
	public double CalculaProduto(int opcao){
		//metodo calcula produto
		if(opcao==1) {
			//escolher primeira op��o
			System.out.println("Torneira");
			Minutos();
			torneira = 16* minutos; // calculando litros
			JOptionPane.showMessageDialog(null,"Com "+minutos+" minutos voc� acaba gastando cerca de"+torneira+" litros de �gua por dia","Torneira",JOptionPane.INFORMATION_MESSAGE);
			calLitros(torneira);
					}
		else if(opcao==2) {
			//escolher segunda op��o
			System.out.println("Chuveiro");
			Minutos();
			chuveiro = 9*minutos; // calculando litros
			JOptionPane.showMessageDialog(null,"Com "+minutos+" minutos voc� acaba gastando cerca de"+chuveiro+" litros de �gua por dia","Chuveiro",JOptionPane.INFORMATION_MESSAGE);
			calLitros(chuveiro);
		}
		else if(opcao==3) {
			//escolher terceira op��o
			System.out.println("Descarga");
			Descarga();
			litros = 6*descarga; // calculando descargas
			JOptionPane.showMessageDialog(null,"Com "+descarga+"voc� acaba gastando cerca de"+litros+" litros de �gua por dia","Descarga",JOptionPane.INFORMATION_MESSAGE);
			calLitros(litros);
		}
		else {
			// caso a op��o escolhida n�o seja v�lida
			JOptionPane.showMessageDialog(null,"Op��o inv�lida.","Op��o Inv�lida", JOptionPane.INFORMATION_MESSAGE);
		}
		return opcao;
	}
}