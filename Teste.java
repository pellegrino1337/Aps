import javax.swing.JOptionPane;
public class Teste {
	public static void main(String[] args) {
		String opcao = "";
		int opt,a=0;
		Excecao ex = new Excecao();

		CalculaProduto prod = new CalculaProduto();
		// instanciando classe
		while(a==0) {
			//tratamento da opção
			opcao = JOptionPane.showInputDialog(null,"Olá, seja bem vindo! \n"+ 
			"Escolha o produto que deseja analisar"+
			"\n 1 Toneira"+		
			"\n 2 Chuveiro"+
			"\n 3 Descarga"+
			"\n Escolha a Opção:","Analisar gastos de água",JOptionPane.INFORMATION_MESSAGE);
			a=ex.tratar(opcao);
		}
		opt = Integer.parseInt(opcao);
		prod.CalculaProduto(opt);
		JOptionPane.showMessageDialog(null,"Economize agua para o bem do nosso planeta."+
				"\n Economize no banho,"+
				"\n ao escovar os dentes,"+
				"\n no momento de lavar os pratos,"+
				"\n e quando for dar descarga."+
				"\n não esqueca de estocar água da chuva"+
				"\n pois ela servirá para lavar seu carro, quintal ou terraço", "Mensagem ao Usuário", JOptionPane.INFORMATION_MESSAGE);
	}

}
