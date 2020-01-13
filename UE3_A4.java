//  DOCUMENTACIÓN DEL PROGRAMA  -------------------------------------
/*
  ARCHIVO: UE3_A4.java
  EFECTO: Problemas de solución directa con funciones.
  AUTOR: JMB
  GRUPO: 1O5M
  FECHA_CREACIÓN:  1/11/2010
  FECHA_ÚLTIMA_MODIFICACIÓN:  5/11/2010
*/

//  USO: UE3_A4 ue34 = new UE3_A4 ()

class UE3_A4
{
  
//  DECLARACIONES DE CONSTANTES  ------------------------------------ 
  
  final double G = 6.67428e-11;

//  DECLARACION DE FUNCIONES  ---------------------------------------
  
/*
  FUNCION cifraI (i , n : Entero) ---> Entero 
  PRE: (i IN [1..NC (n)]) /\ (n >= 0)
  POST: resultado = Resto (Cociente (n,Potencia (10,i-1),10)
*/
  int cifraI (int i , int n)
  {
    final int base = 10;
    return (n/(int)Math.pow(base,i-1)) % base;
  }
/*
  FUNCION esMultiplo (m,n : Entero) ---> Boolean 
  PRE: (m > 0) /\ (n > 0) 
  POST: resultado = ALGUN i IN |N+ . (m = i*n) 
*/
  boolean esMultiplo (int m , int n)
  {
    return (m % n) == 0;
  }
/*
  FUNCION mayor2 (m , n : Entero) ---> Entero 
  PRE: cierto
  POST: ((resultado = m) /\ (m >= n)) \/
        ((resultado = n) /\ (m <= n)) 
*/
  int mayor2 (int m , int n)
  {
    return (m + n + Math.abs (m-n)) / 2;
  }
/*
  FUNCION menor2 (m , n : Entero) ---> Entero 
  PRE: cierto
  POST: ((resultado = m) /\ (m <= n)) \/
        ((resultado = n) /\ (m >= n))
*/
  int menor2 (int m , int n)
  {
    return (m + n - Math.abs (m-n)) / 2;
  }
/*
  FUNCION aMayuscula (letra : Caracter) ---> Caracter 
  PRE: letra IN ['a','z']
  POST: resultado es la mayuscula correspondiente a "letra"
*/
  char aMayuscula (char letra)
  {
    return (char)(letra - 'a' + 'A');
  }
/* 
  FUNTION aMinuscula (letra : Caracter) ---> Caracter 
  PRE: letra IN ['A','Z']
  POST: resultado es la minuscula correspondiente a "letra"
*/
  char aMinuscula (char letra)
  {
    return (char)(letra - 'A' + 'a');
  }
/*
  FUNCION aDigito (caracter : Caracter) ---> Entero 
  PRE: caracter IN {'0'..'9'}
  POST: resultado es el entero correspondiente a "caracter"
*/
  int aDigito (char letra)
  {
     final char nueve = '9';
     return nueve - '0';
  }
/*
  FUNCION implicacion (p, q : Booleano) ---> Booleano 
  PRE: cierto
  POST: resultado = si "p" entonces "q"
*/
  boolean implicacion (boolean p, boolean q)
  {
    return !p || q;
  }
/*
  FUNCION xor (p, q : Booleano) ---> Booleano 
  PRE: cierto
  POST: resultado = o "p" o bien "q" pero no, los dos
*/
  boolean xor (boolean p, boolean q)
  {
     return (p && !q) || (!p && q);
  }
/*
  FUNCION bicondicional (p, q : Booleano) ---> Booleano 
  PRE: cierto
  POST: resultado = "p" sí y sólo sí "q"
*/
  boolean bicondicional (boolean p, boolean q)
  {
     return !xor(p,q);
  }

//  DECLARACIONES DE PRUEBAS  ---------------------------------------

}