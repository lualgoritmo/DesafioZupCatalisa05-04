import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //int opcao = 0;
            cadastrarUsuario();
            calcularSalario();
        
        // opcao = sc.nextInt();
        // do {
        // System.out.println("Escolha uma opcao:");
        // System.out.println("1 - Cadastrar Usuário");
        // System.out.println("2 - Ajuda");
        // System.out.println("3 - Sair");
        // System.out.println("OPCAO: ");
        // } while (opcao != 3);
        
    }
    public static void cadastrarUsuario() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o seu nome?");
        String nome = sc.nextLine();
        System.out.println("Qual a sua profissão?");
        String profissao = sc.nextLine();
        System.out.println("-----------Usuário Cadastrado---------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Profissão: " + profissao);

    }

    public static void calcularSalario() {
        Scanner leitor = new Scanner(System.in);
        double salario = 0;
        double[] mes = new double[12];
        double imposto = 0;
        double mesPago = 0;
        for(int i = 0; i < mes.length + 1; i++){
            System.out.println("Teste 1");
            mes[i] = leitor.nextDouble();
        }
        for(int x= 0; x < mes.length; x++)
        {
            System.out.println("Mês: "+ x + mes[x]);
        }
            // if(salario <= 2000.00){
            //     System.out.printf("1 Não paga imposto %.2f%n", imposto);
            // }
            // else if(salario >= 2001.00 && salario <= 3000.00){
            //     imposto = 0.08;
            //     mesPago = salario * imposto;
            //     System.out.printf("2 Imposto Pago por mês %.2f%n", mesPago);
            // }

            // else if(salario >= 3001.00 && salario <= 4500.00){
            //     imposto = 0.18;
            //     mesPago = salario * imposto;
            //     System.out.printf("3 Imposto Pago por mês %.2f%n", mesPago);
            // }
            // else {
            //     imposto = 0.28;
            //     mesPago = salario * imposto;
            //     System.out.printf("4 Imposto Pago no mês %.2f%n", mesPago);
            // }      
    }
}
