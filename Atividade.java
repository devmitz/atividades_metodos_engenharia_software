import javax.swing.JOptionPane;
public class Atividade {
	public static void main(String[] args) {
		//inicialização das variaveis.
		int variavelUm, variavelDois;
		String mensagemOperacao = "Digite o valor da operação \n (+) = Soma \n (-) = Subtração \n (/) = Divisão \n (*) = Multiplicação";
		boolean continuar = true;
		boolean operadorValido = true;
		
		while(continuar) {
			//Começando a perguntar ao usuario os números e a operação que deseja fazer.
			while(operadorValido) {
				//entrada de dados.
				variavelUm = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
				String operacao = JOptionPane.showInputDialog(mensagemOperacao);
				variavelDois = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
				
				//Se algum número digitado for = 0, dara a mensagem de operador invalido.
				if (variavelUm != 0 && variavelDois != 0) {

					switch (operacao) {
						case "+":
							int resultadoSoma = variavelUm + variavelDois;
							JOptionPane.showMessageDialog(null, "A soma da operação foi de : " + resultadoSoma);
							break;
						
						case "-":
							int resultadoSubtracao = variavelUm - variavelDois;
							JOptionPane.showMessageDialog(null, "A subtração da operação foi de : " + resultadoSubtracao);
							break;
						
						case "/":
							double resultadoDivisao = variavelUm / variavelDois;
							JOptionPane.showMessageDialog(null, "A divisão da operação foi de : " + resultadoDivisao);
							break;

						case "*":
							double resultadoMultiplicacao = variavelUm * variavelDois;
							JOptionPane.showMessageDialog(null, "A divisão da operação foi de : " + resultadoMultiplicacao);
							break;

						default:
							JOptionPane.showMessageDialog(null, "Operador inválida, digite novamente.");
							operadorValido = false;
							break;
					}
				}else{
					JOptionPane.showMessageDialog(null, "Número invalido, ele deve ser diferente de 0.");
				}
				
				Boolean continuaLoop = true;

				while(continuaLoop) {
					//Aqui ele ira perguntar ao usuario se ele deseja continuar ou deseja encerrar o programa.
					String pergContinua = JOptionPane.showInputDialog("Você deseja continuar calculando? \n Escreva: (s) ou (n)");

					switch (pergContinua) {
						case "s":
							continuar = true;
							continuaLoop = false;
							break;
						
						case "n":
							continuar = false;
							continuaLoop = false;
							operadorValido = false;
							break;
						
						default:
							JOptionPane.showMessageDialog(null, "Conteudo digitado para continuar, inválido.");
							break;
					}
				}
			}
		}
	}
}