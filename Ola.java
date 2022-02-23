//toda classe tem que ter o mesmo nome do arquivo;
//o metodo "main" é o metodo principal;
//para copilar a aplicação use 'javac "nome do arquivo"' e para executar use 'java "nome do arquivo"';
// != <- diferente // == <- igual 
// === <- compara tipo e valor da variável
// atribuidor composto // int a = 10; --> a += 20; é a mesma coisa  que 'a = a + 20;'
// o 'char' vai me permitir que eu tenha apenas um caracter;
// boolean é o verdadeiro ou falso 'true ou false' sempre minusculo pois ele é case sensitive;


public class Ola {
    public static int soma(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println("Olá Mundo!!");
        System.out.println(soma(4,6));

        boolean bol = false;
        char ch = 'a';
        byte intB = 2;
        short intS = 200;
        int intN = 1000;
        long intL = 2000;
        float fNum = 2.5f;
        double dNum = 2.5;
    

        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);

    } 
}
