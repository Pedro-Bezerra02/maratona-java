package study.introducao;

public class Aula002 {
    public static void main(String[] args) {
        //int, double, float, short, long, byte, boolean, char
        int idade = (int) 10000000000L;
        long numeroGrande = (long) 234.04;
        double salarioDouble = 2000.4;
        float salarioFloat = (float) 2500.0D;
        byte idadeByte = 127;
        short idadeShort = 32000;
        boolean verdade = true;
        boolean falso = false;
        char caractere = 'A';
        String nome = "Pedro";

        System.out.println("A idade dele é " + idade + " anos");
        System.out.println("É verdade " + verdade);
        System.out.println(idade);
        System.out.println(numeroGrande);
        System.out.println("Meu nome é " + nome);
    }
}
