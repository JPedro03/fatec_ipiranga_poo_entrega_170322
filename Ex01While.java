import java.util.Scanner;
public class Ex01While{
    public static void main(String[] args){
        int contador = 1;
        int atual = 0;
        while(contador <= 100){
            atual = atual + 1;
            System.out.println(atual);
            contador++;
        }
    }
}