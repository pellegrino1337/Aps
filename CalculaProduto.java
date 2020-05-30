import javax.swing.JOptionPane;

public class CalculaProduto extends Produtos {
	//classe filha produto
	public double CalculaProduto(int opcao){
		//metodo calcula produto
		if(opcao==1) {
			//escolher primeira opção
			System.out.println("Torneira");
			Minutos();
			torneira = 16* minutos; // calculando litros
			JOptionPane.showMessageDialog(null,"Com "+minutos+" minutos você acaba gastando cerca de"+torneira+" litros de água por dia","Torneira",JOptionPane.INFORMATION_MESSAGE);
			calLitros(torneira);
					}
		else if(opcao==2) {
			//escolher segunda opção
			System.out.println("Chuveiro");
			Minutos();
			chuveiro = 9*minutos; // calculando litros
			JOptionPane.showMessageDialog(null,"Com "+minutos+" minutos você acaba gastando cerca de"+chuveiro+" litros de água por dia","Chuveiro",JOptionPane.INFORMATION_MESSAGE);
			calLitros(chuveiro);
		}
		else if(opcao==3) {
			//escolher terceira opção
			System.out.println("Descarga");
			Descarga();
			litros = 6*descarga; // calculando descargas
			JOptionPane.showMessageDialog(null,"Com "+descarga+"você acaba gastando cerca de"+litros+" litros de água por dia","Descarga",JOptionPane.INFORMATION_MESSAGE);
			calLitros(litros);
		}
		else {
			// caso a opção escolhida não seja válida
			JOptionPane.showMessageDialog(null,"Opção inválida.","Opção Inválida", JOptionPane.INFORMATION_MESSAGE);
		}
		return opcao;
	}
}