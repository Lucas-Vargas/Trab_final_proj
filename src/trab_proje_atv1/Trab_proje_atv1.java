package trab_proje_atv1;
import java.util.Scanner;
public class Trab_proje_atv1 {

    public static void main(String[] args) {
    int quant;
    double totpres,fat_quej=0.050, fat_pres=0.050, fat_hamb=0.1, tothamb;
    
    Scanner ler = new Scanner(System.in);
        System.out.println("Insira a quantidade de hambúrgueres que deseja fazer");
        quant = ler.nextInt();
        totpres = fat_pres * quant;
        tothamb = quant * fat_hamb;
        System.out.println("A quantidade de carne que deverá comprar será de: "+tothamb+"kg, de presunto será: "+totpres+"kg e de queijo será: "+totpres+"kg.");            
    } 
}
