import java.time.OffsetDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Escreva um código que receba o nome e o ano de nascimento de alguém e imprima na tela a seguinte mensagem: "Olá 'Fulano' você tem 'X' anos" ⭐⭐⭐⭐⭐⭐⭐.
        var scanner = new Scanner(System.in);
        var anoBase = OffsetDateTime.now().getYear();
        System.out.print("Qual é o seu nome? ");
        var nome = scanner.nextLine();
        System.out.print("Em que ano você nasceu? ");
        var ano = scanner.nextInt();
        var idade = anoBase - ano;
        System.out.printf("Olá, %s. Você tem %s anos!", nome, idade);
        

        // Escreva um código que receba o tamanho do lado de uma quadrado, calcule sua área e exiba na tela: fórmula: área = lado x lado
        /*
        var scanner = new Scanner(System.in);
        System.out.print("Quanto mede o lado do quadrado? ");
        var lado = scanner.nextFloat();
        var area = lado * lado;
        System.out.printf("A área do quadrado é %s", area);
        */


        // Escreva um código que receba a base e a altura de um retângulo, calcule sua área e exiba na tela: fórmula: área = base x altura
        /* 
        var scanner = new Scanner(System.in);
        System.out.print("Qual é a base do triângulo? ");
        var base = scanner.nextFloat();
        System.out.print("Qual é a altura do triângulo? ");
        var altura = scanner.nextInt();
        var area = base * altura;
        System.out.printf("A área do triângulo é: %s", area);
        */

        // Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferança de idade entre elas.
        /* 
        var scanner = new Scanner(System.in);
        System.out.print("Olá pessoa 1, quantos anos você tem? ");
        var idade1 = scanner.nextInt();
        System.out.print("Olá pessoa 2, quantos anos você tem? ");
        var idade2 = scanner.nextInt();
        var soma = idade1 + idade2;
        System.out.printf("A soma das idades das duas pessoas é: %s", soma);
        */
    } 
}
