import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Produtos {
	double torneira,chuveiro,minutos,litros;
	int descarga;
	int a = 0;
	String minutostring = "";
	
public double Minutos() {
	// instancia
		Excecao ex = new Excecao();
		double minutos = 0;
	
		JOptionPane.showMessageDialog(null,"Digite a quantidade de minutos que você utiliza diariamente este produto","Minutos", JOptionPane.INFORMATION_MESSAGE);
		while (a==0) {
		minutostring = JOptionPane.showInputDialog("Minutos: ");
		a=ex.tratarmin(minutostring);
	}
		minutos = Double.parseDouble(minutostring);
		this.minutos = minutos;
		return minutos;
	}
public int Descarga() {
		// medodo que administra o calculo da descarga
		int descarga = 0;
		JOptionPane.showMessageDialog(null,"Digite a quantidade de vezes que é acionado a descarga por dia","Descarga", JOptionPane.INFORMATION_MESSAGE);
		descarga = Integer.parseInt(JOptionPane.showInputDialog("Descarga: "));
		this.descarga = descarga;
		calLitros(litros);
		return descarga;
	}
public double calLitros(double litros) {
		//metodo  que calcula a quantidade de litros gastos em conta
		double valor = 0;
		valor = (30*(litros/1000))*2.992;
		//formatando
		DecimalFormat df = new DecimalFormat();
		df.applyPattern("#,##0.00");
		JOptionPane.showMessageDialog(null, "\n Isso equivale na sua conta cerca de: R$ "+df.format(valor)+" por mês"," Mensagem ao usuário",JOptionPane.INFORMATION_MESSAGE);
		return valor;
	}
}
