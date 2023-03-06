import javax.swing.JOptionPane;
public class Atividade {
	public static void main(String[] args) {
		int variavel_um, variavel_dois;
		String msg_op = "Digite o valor da operação \n (+) = Soma \n (-) = Subtração \n (/) = Divisão";
		
		String continuar = "sim";
		boolean operador_valido = true;
		
		while(continuar.equals("sim")) {
			//Começando a perguntar ao usuario os números e a operação que deseja fazer.
			while(operador_valido) {
				variavel_um = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
				String operacao = JOptionPane.showInputDialog(msg_op);
				variavel_dois = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
				//resultados.
				int resultado_soma = variavel_um + variavel_dois;
				int resultado_subtracao = variavel_um - variavel_dois;
				int resultado_divisao = variavel_um / variavel_dois;
				
				//Se algum número digitado for = 0, dara a mensagem de operador invalido.
				if (variavel_um != 0 && variavel_dois != 0) {
					if(operacao.equals("+")) {
						JOptionPane.showMessageDialog(null, "A soma da operação foi de : " + resultado_soma);
					}else if(operacao.equals("-")) {
						JOptionPane.showMessageDialog(null, "A subtração da operação foi de : " + resultado_subtracao);
					}else if(operacao.equals("/")) {
						JOptionPane.showMessageDialog(null, "A divisão da operação foi de : " + resultado_divisao);
					}else {
						JOptionPane.showMessageDialog(null, "Operador inválida, digite novamente.");
						operador_valido = false;
					}
				}else{
					JOptionPane.showMessageDialog(null, "Número invalido, ele deve ser diferente de 0.");
				}
				
				//Aqui ele ira perguntar ao usuario se ele deseja continuar ou deseja encerrar o programa.
				String perg_continuar = JOptionPane.showInputDialog("Você deseja continuar calculando? \n Escreva: (sim) ou (não)");
				if(perg_continuar.equals("não")){
					continuar = "não";
					break;
				}else if(perg_continuar.equals("sim")){
					continuar = "sim";
				}else {
					JOptionPane.showMessageDialog(null, "Conteudo digitado para continuar, inválido.");
				}
			}
		}
	}
}