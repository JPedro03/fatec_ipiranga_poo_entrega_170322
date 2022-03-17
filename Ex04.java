import javax.swing.JOptionPane;
public class Ex04{
    public static void main(String[] args){
        double num, i, resultado = 0;
        num = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero inteiro: "));
        for (i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                resultado++;
                break;
            }
        }
        if (resultado == 0)
            System.out.println("E um numero primo");
        else
            System.out.println("Nao e um numero primo");
    }
}