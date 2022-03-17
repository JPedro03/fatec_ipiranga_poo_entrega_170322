import java.util.Scanner;
public class Ex02DoWhile{
    public static void main(String[] args){
        int contador = 1;
        int atual = 101;
        do{
            atual = atual - 1;
            System.out.println(atual);
            contador++;
        } while(contador <= 100);
    }
}