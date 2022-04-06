import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] usuarios = new String[2];
        double[] mes = new double[12];
        while(true){
            System.out.println("Menu-Opções:");
            System.out.println("Para sair digite 0");
            System.out.println("Cadastrar Usuário 1");
            System.out.println("Calcula Imposto 2");
            System.out.println("Mostrar Dados 3");
            int opcao = sc.nextInt();
        
            if(opcao == 0){
                System.exit(0);
            }
            else if(opcao == 1){
                System.out.println("Cadastrar Usuário:");
                usuarios = cadastrarUsuario();
                Scanner leitor = new Scanner(System.in);
                for(int i = 0; i < mes.length; i++){
                    System.out.println("Qual o salário:" + (i+1));
                    mes[i] = leitor.nextDouble();
                }
                System.out.println();
            }
            else if(opcao == 2){
                double[] sl = new double[mes.length];
                sl = calcularSalario(mes);
                mostarImposto(sl);
            }
            else if(opcao == 3){
                mostrarDados(usuarios);
                salvarSalario(mes);
            }
            else{
                System.out.println("Opção Inválida");
            }
        }
    }
    public static String[] cadastrarUsuario() {
        String[] dados = new String[2];
        Scanner buscarDados = new Scanner(System.in);
                System.out.println("Qual o seu nome?");
                dados[0] = buscarDados.nextLine();
                System.out.println("Qual a sua profissão?");
                dados[1] = buscarDados.nextLine();
        return dados;
    }

    public static void mostrarDados(String[] dadoUsuario) {
        System.out.println("-----------Usuário Cadastrado---------------------");
        System.out.println("Nome: " + dadoUsuario[0]);
        System.out.println("Profissão: " + dadoUsuario[1]);
    }
    public static void salvarSalario(double[] salario) {
        for(int i= 0; i < salario.length; i++){   
            System.out.println("Mês: "+ "  " + (i+1) + " Salário" + salario[i]);
        }
    }
    public static double[] calcularSalario(double[] mes1) {
        double[] mesPago = new double[mes1.length];
        for(int i= 0; i < mes1.length; i++){   
          
            if(mes1[i] <= 2000.00){
                mesPago[i] = 00;
                System.out.printf(" Não paga imposto %.2f%n", mesPago[i]);
           }
           else if(mes1[i] >= 2001.00 && mes1[i] <= 3000.00){
                mesPago[i] = mes1[i] * 0.08;
            System.out.printf(" Imposto Pago por mês: %.2f%n", mesPago[i]);
           }
           else if(mes1[i] >= 3001.00 && mes1[i] <= 4500.00){
             mesPago[i] = mes1[i] * 0.18;
            System.out.printf(" Imposto Pago por mês: %.2f%n",  mesPago[i]);
           }
           else {
             mesPago[i] = mes1[i] * 0.28;
            System.out.printf(" Imposto Pago no mês: %.2f%n",  mesPago[i]);
           }   
        }  
        return mesPago;
    }

    public static void mostarImposto(double[] imposto) {
        for(int i = 0; i < imposto.length; i++){
            System.out.println("Valor do Imposto");
            System.out.println(imposto[i]);
        }
    }
}
