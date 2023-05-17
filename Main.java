//KALKULATOR
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1.Dodawanie");
        System.out.println("2.Odejmowanie");
        System.out.println("3.Mnożenie");
        System.out.println("4.Potęga");
        System.out.println("5.Pierwiastek");
      int wybor = scan.nextInt();

      switch(wybor){

        case 1: 
          {
            System.out.println("Podaj 1 liczbe");
            double a = scan.nextDouble();
            System.out.println("Podaj 2 liczbe");
            double b = scan.nextDouble();
            double c = a+b;
            System.out.println("Wynik"+" "+c);
            break;
          }
        case 2:
          {
             System.out.println("Podaj 1 liczbe");
            double a = scan.nextDouble();
            System.out.println("Podaj 2 liczbe");
            double b = scan.nextDouble();
            double c = a-b;
            System.out.println("Wynik" + " "+c);
            break;
          }
        case 3:
          {
            System.out.println("Podaj 1 liczbe");
            double a = scan.nextDouble();
            System.out.println("Podaj 2 liczbe");
            double b = scan.nextDouble();
            double c = a*b;
            System.out.println("Wynik"+ " " +c);
            break;
          }
          case 4:
          {
            System.out.println("Podaj liczbe");
            double a = scan.nextDouble();
            System.out.println("Podaj potęge");
            double potega = scan.nextDouble();
            double wynik=0;
                wynik= Math.pow(a, potega);
            System.out.println("Wynik"+ " " +wynik);
            break;

          }
          case 5:
          {
            System.out.println("Podaj liczbe");
             double a = scan.nextDouble();
             double wynik=0;
             wynik = Math.sqrt(a);
             System.out.println("Wynik"+ " " + wynik);
            break;
          }




          
      }
    }
}

//CHOINKA
class Main {
  public static void main(String[] args) {
    for(int i=0;i<5;i++){
      for(int j=0;j<4-i;j++){
        System.out.print(" ");
      }
      for(int j=0;j<i+1;j++){
         System.out.print("*");
      }
      System.out.println();
      }
    for(int k=0;k<5;k++){
      for(int l=0;l<5-k;l++){
        System.out.print("*");
      }
       System.out.println();
    }
     
    }
  }
///liczby parzyste
public class ParzysteLiczby {

    public static void main(String[] args) {
        System.out.println("Liczby parzyste w zakresie do 100:");

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
///zamiania z małych liter na duze
import java.util.Scanner;

public class ZamianaLiter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wprowadź tekst: ");
        String tekst = scanner.nextLine();

        String wynik = zamienLitery(tekst);
        System.out.println("Wynik: " + wynik);
    }

    public static String zamienLitery(String tekst) {
        StringBuilder wynik = new StringBuilder();

        for (int i = 0; i < tekst.length(); i++) {
            char znak = tekst.charAt(i);

            if (Character.isUpperCase(znak)) {
                znak = Character.toLowerCase(znak);
            } else if (Character.isLowerCase(znak)) {
                znak = Character.toUpperCase(znak);
            }

            wynik.append(znak);
        }

        return wynik.toString();
    }
}
