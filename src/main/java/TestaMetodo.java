import java.util.Scanner;

public class TestaMetodo {

    public static void main(String[] args)
    {
        System.out.println(args[0]);
        ola();
        Scanner leitor = new Scanner(System.in);
        System.out.println("digite um número");
        int numero = Integer.parseInt(leitor.nextLine());
        if(multiploDe3(numero))
        {
            System.out.println(numero + " é múltiplo de 3");
        }
        else
        {
            System.out.println(numero + " não é múltiplo de 3");
        }
        leitor.close();
    }

    public static boolean multiploDe3(int qualNumero)
    {
        if(qualNumero % 3 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void ola()
    {
        int k = 10;
        do
        {
            System.out.println("Olá " + k);
            k--;
        }
        while(k != 0);

    }

}
