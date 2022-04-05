import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       cadastrarUsuario();
       calcularSalario();
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
        System.out.println("Salário Mensal");
        double salario = leitor.nextDouble();
        double anoTotal = 12 * salario;
        double imposto = 0;
        double mesPago = 0;
        System.out.printf("Imposto %.2f%n", anoTotal);
        if(salario <= 2000.00){
            System.out.printf("Não paga imposto %.2f%n", imposto);
        }
        else if(salario >= 2001.00 && salario <= 3000.00){
            imposto = 0.08;
            mesPago = salario * imposto;
            System.out.println("8: " + mesPago + "Valor pago por mês");
        }
    }
}
