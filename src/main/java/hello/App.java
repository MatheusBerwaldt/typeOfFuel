package hello;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static int alcool = 0;
    public static int gas = 0;
    public static int diesel = 0;
    public static boolean r = true;
    
    public static String voto(ArrayList<Integer> c){
        for(int i = 0; i < c.size(); i ++){
            switch(c.get(i)){
                case 1:
                    alcool ++;
                    break;
                case 2:
                    gas ++;
                    break;
                case 3:
                    diesel ++;
                    break;
            }
        }
        return "MUITO OBRIGADO" + "\nAlcool: " + alcool + "\nGasolina: " + gas + "\nDiesel: "+ diesel;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> c = new ArrayList<>();
        System.out.println("Selecione qual o tipo de combustivel que os clientes abasteceram: ");
        System.out.println("caso digite um número inválido nada ocorrerá!");
        System.out.println("1.Alcool \n2.Gasolina \n3.Diesel \n4.fim");
        while(r == true){
            int p = sc.nextInt();
            if(p == 4){
                r = false;
            }
            c.add(p);
        }
        
        System.out.println(voto(c));
        
 
    }
}
