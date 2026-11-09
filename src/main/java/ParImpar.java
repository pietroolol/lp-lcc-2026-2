public class ParImpar {

    public static void main(String[] args)
    {
        int [] numeros = {3, 4, 5, 6, 7, 8, 9};
        int contPar = 0;
        int contImpar = 0;
        for(int n = 0; n < numeros.length; n++)
            if(numeros[n] % 2 == 0)
            {
                contPar++;
            }
            else
            {
                contImpar++;
            }
        System.out.println("há " + contPar + " pares e " + contImpar + " ímpares");
    }
}
