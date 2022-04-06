import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       
        while(true){
            System.out.println("Para sair digite 0");
            System.out.println("Cadastrar 1");
            System.out.println("Salário 2");
            int opcao = sc.nextInt();
            if(opcao == 0){
                System.exit(0);
            }
            else if(opcao == 1){
                cadastrarUsuario();
                calcularSalario();
            }
            else if(opcao == 2){
                calcularSalario();
            }
        }
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
        double[] mes = new double[2];
        double imposto = 0;
        double mesPago = 0;
        for(int i = 0; i < mes.length; i++){
            System.out.println("Qual o salário:" + (i+1));
            mes[i] = leitor.nextDouble();
        }
        for(int i= 0; i < mes.length; i++){   
            System.out.println("Mês: "+ "  " + (i+1) + " Salário" + mes[i]);
            if(mes[i] <= 2000.00){
                mesPago = 00.00;
                System.out.printf(" Não paga imposto %.2f%n", mesPago);
           }
           else if(mes[i] >= 2001.00 && mes[i] <= 3000.00){
                imposto = 0.08;
                mesPago = mes[i] * imposto;
            System.out.printf(" Imposto Pago por mês: %.2f%n", mesPago);
           }
           else if(mes[i] >= 3001.00 && mes[i] <= 4500.00){
            imposto = 0.18;
            mesPago = mes[i] * imposto;
            System.out.printf(" Imposto Pago por mês: %.2f%n", mesPago);
           }
           else {
            imposto = 0.28;
            mesPago = mes[i] * imposto;
            System.out.printf(" Imposto Pago no mês: %.2f%n", mesPago);
           }   
        }   
    }
}
