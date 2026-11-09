import javax.swing.JOptionPane;

public class Ola {

    public static void mostreSaudades(String nome)
    {
        System.out.println("salve " + nome);
    }

    public static void main(String [] args)
    {
        System.out.println("Olá");
        String nome = "Eu";
        System.out.println(nome);
        System.out.println(nome.charAt(0));
        System.out.println(nome.charAt(1));

        nome = JOptionPane.showInputDialog("Digite seu nome: ");
        System.out.println("Oi, " + nome + "!");
        mostreSaudades(nome);


        int idade = 15;
        System.out.println(idade);

        double altura = 1.75;
        boolean toComSono = false;

        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
        System.out.println(idade + "! Que idade boa hein");

        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura"));
        System.out.println("sua altura é " + altura);

    }

}
