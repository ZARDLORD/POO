import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lab
{
    public static void main(String[]args)
    {
        Jugada();
    }
    public static void Jugada()
    {
        System.out.println(Mano.PIEDRA);
        System.out.println(Mano.PIEDRA.toString());
    }
    public enum Mano{
        PIEDRA,PAPEL,TIJERA;
    }
}