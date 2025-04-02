import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {

        // Informações da conta
        int numero = 1021;
        String agencia = "0678";
        String nomeCliente = "MARIO ANDRADE";
        double saldo = 237.48;

        String confirmarAgencia;
        //IMPORTANTÍSSIMO
        //Aqui é feito a leitura da conta usando o Do-While para isso
        do {
            confirmarAgencia = JOptionPane.showInputDialog(null, "Informe o número da sua agência:", 
                                                            "Verificação de Agência", JOptionPane.QUESTION_MESSAGE);

            if (confirmarAgencia == null) { // Verifica se o usuário cancelou ou fechou a janela
                JOptionPane.showMessageDialog(null, "Operação cancelada pelo usuário.", 
                                              "Cancelado", JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            if (!confirmarAgencia.equals(agencia)) {
                JOptionPane.showMessageDialog(null, "Número da agência incorreto. Tente novamente.", 
                                              "Erro", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Número da agência correto!\nBem-vindo, Usuário: "+ numero + " \nOlá "
                + nomeCliente + "\nObrigado por criar uma conta em nosso banco.\n Sua agência é:" + agencia + ", \nconta: " + numero + 
                "\ne seu Saldo: R$ " + saldo,
                "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                break; // Termina o loop ao inserir a agência correta
            }
        } while (true);
    }
}


      
        
    
    

