// AUTOR: Javier Galve
// GRUPO: 
//
//Función sumaMonedas. 
//Función horaASegundos.  
//Función segundosAHora.  
//Función hacen10.  
//Función en3050.  
//Función ultimosIguales.  

class UE03_Entrega1{

//Función sumaMonedas. 
//El supermercado del barrio necesita un programa que pueda calcular 
//el valor de una bolsa de monedas de céntimos de euro.
//Recibe seis números: el número de monedas de 50, 20, 10, 5, 2 
//céntimos y 1 céntimo que hay en la bolsa. Devuelve la cantidad de 
//dinero (en céntimos) en la bolsa. 

  //POST: Calcula el valor en céntimos de euro de un conjunto de mone
  //  das formado por n50 monedas de 50 cents. de euro, n20 de 20
  //  cents., n10 de 10 cents., n5 de 5 cents., n2 de 2 cents. y n1 de
  //  1 céntimo.
    //EJEMPLOS:
    //  sumaMonedas(1,2,3,4,5,6) = 
    //     1*50+2*20+3*10+4*5+5*2+6 =
    //     50+40+30+20+10+6 =
    //     156
    //  sumaMonedas(1, 1, 1, 1, 1, 1) = 88
    //  sumaMonedas(5, 2, 1, 1, 1, 0) = 307
    // PLANTILLA:
    //   ... n50 ... n20 ... n10 ... n5 ... n2 ... n1 ...
  int sumaMonedas(int n50, int n20, int n10, int n5, int n2, int n1){
    //  =PARA HACER=
    return 0; 
  }
  
  boolean prueba1SumaMonedas(){
    return sumaMonedas(1, 2, 3, 4, 5, 6)==156;
  }

  boolean prueba2SumaMonedas(){
    return sumaMonedas(1, 1, 1, 1, 1, 1)==88;
  }

  boolean prueba3SumaMonedas(){
    return sumaMonedas(5, 2, 1, 1, 1, 0)==307;
  }

  //  =PARA HACER= (Más pruebas)

  boolean pruebaSumaMonedas(){
    return prueba1SumaMonedas() &&
      prueba2SumaMonedas() &&
      prueba3SumaMonedas();
  }

  
//Función horaASegundos.  
//Dada una medida de tiempo en horas, minutos y segundos, convertirla
//en la medida equivalente en segundos.
  
    //POST: =PARA HACER=
    //EJEMPLOS:
    //  horaASegundos(1, 1, 1) = 1*3600 + 1*60 + 1 = 3661
    //  =PARA HACER= (Más ejemplos)
    // PLANTILLA:
    //   ... horas ... minutos ... segundos ...
  int horaASegundos(int horas, int minutos, int segundos){
    //  =PARA HACER=
    return 0;
  }
  
  boolean prueba1HoraASegundos(){
    return horaASegundos(1, 1, 1)==3661;
  }
  
  boolean prueba2HoraASegundos(){
    return horaASegundos(2, 10, 20)==7820;
  }
  
  boolean prueba3HoraASegundos(){
    return horaASegundos(2, 1, 0)==7260;
  }

  //  =PARA HACER= (Más pruebas)

  boolean pruebaHoraASegundos(){
    return prueba1HoraASegundos() &&
      prueba2HoraASegundos() &&
      prueba3HoraASegundos();
  }

  
//Función segundosAHora.  
//Dada una medida de tiempo en segundos, convertirla en 
//la medida equivalente en horas, minutos y segundos.  
  
    //POST: =PARA HACER=
    //EJEMPLOS:
    //  segundosAHora(3600) = 1:0:0
    //  segundosAHora(3661) = 3661/3600:61/60:1 = 
    //                        3661/3600:61/60:1 = 
    //                        3661/3600:(3661%3600)/60:(3661%3600)%60 
    //                        1:1:1 
    //  =PARA HACER= (Más ejemplos)
    // PLANTILLA:
    //   ... segundos ...
  String segundosAHora(int segundos){
    //  =PARA HACER=
    return "";
  }

  boolean prueba1SegundosAHora(){
    return segundosAHora(3600).equals("1:0:0");
  }
  
  boolean prueba2SegundosAHora(){
    return segundosAHora(59).equals("0:0:59");
  }
  
  boolean prueba3SegundosAHora(){
    return segundosAHora(3661).equals("1:1:1");
  }
  
  boolean pruebaSegundosAHora(){
    return prueba1SegundosAHora() &&
      prueba2SegundosAHora() &&
      prueba3SegundosAHora();
  }

//Función hacen10.  
//Dados dos números enteros, devolver cierto si uno de ellos
//es 10 o si su suma es 10. 
//EJEMPLOS:  
//hacen10(9, 10) = true
//hacen10(9, 9) = false
//hacen10(1, 9) = true  
  
//Función en3050.  
//Dados dos números enteros, devolver cierto si ambos están en el 
//rango 30..40 inclusive, o si ambos están en el rango 40..50 
//inclusive. 
//EJEMPLOS:  
//en3050(30, 31) = true
//en3050(30, 41) = false
//en3050(40, 50) = true
  
//Función ultimosIguales.  
//Dados dos números enteros no negativos, devolver cierto si  
//sus últimos dígitos son iguales (como 27 y 57) y falso en caso 
//contrario. 
//Nota: El operador % ("mod") calcula el resto, de modo que 17 % 10 
//es 7.
  

  public static void main(String[] args){
    
    UE03_Entrega1 p = new UE03_Entrega1();
    
    System.out.println("pruebaSumaMonedas() = " + p.pruebaSumaMonedas());
    System.out.println("pruebaHoraASegundos() = " + p.pruebaHoraASegundos());
    System.out.println("pruebaSegundosAHora() = " + p.pruebaSegundosAHora());
  }  

}