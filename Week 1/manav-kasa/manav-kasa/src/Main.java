import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String[] gn = {"Armut", "Elma", "Domates", "Muz", "Patlıcan"}; //Grocery name holding in this array
        double[] gp = {2.14, 3.67, 1.11, 0.95, 5.00}; //Grocery prices list holding in this array with respect to gn array order
        double[] gw = new double[gp.length] ; //Grocery weights list is going to hold in this array
        double total = 0;
        Scanner price = new Scanner(System.in);
        //The weight values are being taken from the user.
        for( int i = 0; i < gp.length; i++){
            System.out.print(gn[i] + " Kaç kilo? ");
            gw[i] = price.nextDouble();
        }
        //The weight values are multiplied by the price per kilogram and added up total.
        for( int j = 0; j < gp.length; j++){
            total += gp[j] * gw[j];
        }
        System.out.println("Toplam Tutar: " + total);
    }
}