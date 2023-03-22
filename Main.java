class Main {
  public static void main(String[] args) 
  {
    double pierwsza_liczba;
    double druga_liczba;
    char znak;
    scanner wej= new scanner(system.in);

    system.out.println("dodawanie-wcisnij-1");
    system.out.println("odejmowanie-wcisnij-2");
    system.out.println("mnozenie-wcisnij-3");
    system.out.println("dzielenie-wcisnij-4");

    znak=wej.next().charAt(0);
    system.out.println("podaj pierwsza liczbe");
    pierwsza_liczba=wej.nextDouble();
    system.out.println("podaj druga liczbe");
      druga_liczba=wej.nextDouble();
    switch(znak)
      {
        case '1':
          system.out.println(pierwsza_liczba +druga_liczba);
          break;
      }
    case '2':
    {
      system.out.println(pierwsza_liczba-druga_liczba);
      break;
    }
    case '3':
      {
      system.out.println(pierwsza_liczba*druga_liczba);
      break;
      }
    case '4':
      {
      system.out.println(pierwsza_liczba / druga_liczba);
      break;
      }
  }
}