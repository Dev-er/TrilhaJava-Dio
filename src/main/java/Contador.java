import javax.security.auth.login.Configuration;
import java.util.Scanner;



public class Contador {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            //chamando o método contendo a lógica de contagem
            contar(parametroUm,parametroDois);

        }catch (Exception e) {
            //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

    }
    private static class ParametrosInvalidosException extends Exception {
    }

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois) {
            Exception e;
        }


        int contagem = parametroDois - parametroUm;
        //realizar o for para imprimir os números com base na variável contagem
        if (parametroDois > parametroUm) {
            for (int i = 0; i < contagem; i++) {
                int reference = (contagem / contagem) + i;

                System.out.println(reference);
            }
        } else {
            Exception e;
        }
    }


}