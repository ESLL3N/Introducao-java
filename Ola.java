//toda classe tem que ter o mesmo nome do arquivo;
//o metodo "main" é o metodo principal;
//para copilar a aplicação use 'javac "nome do arquivo"' e para executar use 'java "nome do arquivo"';
// != <- diferente // == <- igual 
// === <- compara tipo e valor da variável
// atribuidor composto // int a = 10; --> a += 20; é a mesma coisa  que 'a = a + 20;'

public class Ola {
    public static int soma(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println("Olá Mundo!!");
        System.out.println(soma(4,6));
    } 
}