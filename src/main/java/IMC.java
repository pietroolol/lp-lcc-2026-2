import javax.swing.JOptionPane;

public class IMC {
    public static void main(String[] args){
        double altura = Double.parseDouble(JOptionPane.showInputDialog("sua altura:"));
        double peso = Double.parseDouble(JOptionPane.showInputDialog("seu peso:"));
        double imc = peso / (altura * altura);
        String imcSimples = String.format("%.2f", imc);
        System.out.println("seu imc é: " + imcSimples);
    }
}
