import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(true){
            System.out.println("Opções abaixo: ");
            System.out.println("Para sair digite 0");
            System.out.println("Cadastrar 1");
            System.out.println("Calcula Salário 2");
            System.out.println("Mostrar 3");
            int opcao = sc.nextInt();
            double[] n = new double[2];
            if(opcao == 0){
                System.exit(0);
            }
            else if(opcao == 1){
                cadastrarUsuario();
                calcularSalario();
            }
            else if(opcao == 2){
                n = calcularSalario();
            }
            else if(opcao == 3){
                for(int i = 0; i < n.length; i++){
                    System.out.println("Salários Cadastrados");
                    System.out.println(n);
                }
            }
            else{
                System.out.println("Opção Inválida");
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

    public static double[] calcularSalario() {
        Scanner leitor = new Scanner(System.in);
        double[] mes = new double[2];
        double[] mesPago = new double[mes.length];
        for(int i = 0; i < mes.length; i++){
            System.out.println("Qual o salário:" + (i+1));
            mes[i] = leitor.nextDouble();
        }
        for(int i= 0; i < mes.length; i++){   
            System.out.println("Mês: "+ "  " + (i+1) + " Salário" + mes[i]);
            if(mes[i] <= 2000.00){
                mesPago[i] = 00.00;
                System.out.printf(" Não paga imposto %.2f%n", mesPago[i]);
           }
           else if(mes[i] >= 2001.00 && mes[i] <= 3000.00){
                mesPago[i] = mes[i] * 0.08;
            System.out.printf(" Imposto Pago por mês: %.2f%n", mesPago[i]);
           }
           else if(mes[i] >= 3001.00 && mes[i] <= 4500.00){
             mesPago[i] = mes[i] * 0.18;
            System.out.printf(" Imposto Pago por mês: %.2f%n",  mesPago[i]);
           }
           else {
             mesPago[i] = mes[i] * 0.28;
            System.out.printf(" Imposto Pago no mês: %.2f%n",  mesPago[i]);
           }   
        }  
        return  mesPago; 
    }
}
