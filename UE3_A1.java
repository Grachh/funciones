//  DOCUMENTACI�N DEL PROGRAMA  -------------------------------------
/*
  ARCHIVO: UE3_A1.java
  EFECTO: Necesidad de funciones.
  AUTOR: JMB
  GRUPO: 1O5M
  FECHA_CREACI�N:  1/11/2010
  FECHA_�LTIMA_MODIFICACI�N:  5/11/2010
*/

//  USO: UE3_A1 ue31 = new UE3_A1 ()

class UE3_A1
{
  
//  DECLARACION DE CONSTANTES  -------------------------------------- 
  
  final double pi = Math.PI;

//  En la "UE2_A4" se planteaban cuestiones que se resolv�an con
//  expresiones sobre variables.

//  Desde el enfoque de la programaci�n:
//  Plantear es especificar como
//  Cuesti�n es problema como
//  Resolver es codificar

//  En programaci�n, un problema se especifica; se dise�a un
//  algoritmo de resoluci�n y se codifica. Y se debe pretender
//  siempre, que sea lo m�s general posible, que se pueda usar en
//  otros contextos. Para ello, todo problema debe tomar aspecto de
//  funci�n (c�psula sint�ctica que manipula unos datos para obtener
//  un resultado, ocultando al exterior de la c�psula el c�mo
//  consigue su prop�sito).

//  Una funci�n consta de una interfase (lo que se ve desde el
//  exterior de la c�psula) y un cuerpo (lo que no). La interfase
//  (tambi�n llamada, cabecera) consta de un nombre con un tipo para
//  el resultado (asociado a �l) y una lista de par�metros de entrada
//  (pares (nombre,tipo)). 

//  En "UE2_A4", la cuesti�n 3.2 planteaba el c�lculo del �rea del
//  tri�ngulo que resolv�amos as�:

  double unMedio = (double)1/2;
  double base = 2.3;
  double altura = 6.0;
  double area_Triangulo = unMedio * base * altura;

  double prueba11 = area_Triangulo;

//  Aqu� hay un c�digo para un algoritmo conocido que resuelve el 
//  problema del �rea. No se especifica el problema y adem�s, el
//  c�digo calcula el �rea de un tri�ngulo concreto el de base 2,3 y
//  altura 6.
//  Vamos a reformular el problema. Vamos a darle aspecto de funci�n.
//  
//  FUNCION areaTriangulo (base, altura : Real) ---> Real  
//  PRE: (base >= 0) /\ (altura >= 0)
//  POST1: resultado es el �rea del tri�ngulo a partir de su base y
//  su altura.
//  POST2: resultado = (base*altura)/2
//  
//  La cl�usula PRE explicita las condiciones que se exigen a los
//  par�metros (que no sean negativos, porque si fuese as�, no habr�a
//  ning�n tri�ngulo) y la POST, la que se exige al resultado (que
//  siempre marcar� la relaci�n que hay entre los par�metros y el
//  resultado).
//  La PRE dice bajo qu� suposiciones act�a la funci�n y la POST dice
//  qu� hace la funci�n.
//  La POST1 es informal. Juega con que todos sabemos lo que es un
//  tri�ngulo y lo que es su �rea, e incluso, c�mo se calcula.
//  La POST2 es formal (utiliza un lenguaje formal, el matem�tico,
//  que no deja lugar a dudas, que todos entendemos y que nos permite
//  evaluar y probar). En este caso, adem�s, explicita una f�rmula
//  algebraica que es un algoritmo (da la soluci�n).
//
//  Esta sintaxis proporciona la cabecera de la funci�n, pero no es
//  c�digo java y no tiene el cuerpo, que es donde se codifica el
//  algoritmo (la soluci�n; el c�mo hace la funci�n lo que hace).

//  DECLARACION DE FUNCIONES  ---------------------------------------

  public double areaTriangulo (double base, double altura)
  {
    return (base*altura)/2;
  }

//  DECLARACION DE PRUEBAS  -----------------------------------------

  double prueba12 = areaTriangulo (2.3,6.0);

//  "base" y "altura" son par�metros formales, mientras que "2.3" y
//  "6.0" son par�metros actuales. Se produce una correspondencia
//  biun�voca y posicional entre los formales y los actuales.

//  El problema de la cuesti�n 3.9 de la UE2_A4 (la suma de los
//  t�rminos de una progresi�n aritm�tica) se resolver�a como sigue

//  FUNCION sumaProgresion (primero, razon, n : Entero) ---> Entero  
//  PRE: (razon > 0) /\ (n > 0)
//  POST: resultado = (n * (primero + nEsimo))/2
//  DONDE: nEsimo(primer,diferencia,i) = primer + (n-1)*diferencia

  int nEsimo (int primer, int diferencia, int i)
  {
    return primer + (i-1)*diferencia;
  }

  int sumaProgresion (int primero, int razon, int n)
  {
    return (n * (primero + nEsimo(primero,razon,n)))/2;
  }

//  DECLARACION DE PRUEBAS  -----------------------------------------

  int prueba21 = sumaProgresion(4,7,20);

//  Se ha resuelto el problema en funci�n de un subproblema, el del
//  "c�lculo del t�rmino en�simo de una progresi�n aritm�tica" que de
//  igual manera, merece una especificaci�n

//  FUNCION nEsimo (primer, diferencia, i : Entero) ---> Entero  
//  PRE: (diferencia > 0) /\ (i > 0)
//  POST: resultado = primer + (i-1)*diferencia

//  DECLARACION DE PRUEBAS  -----------------------------------------

  int prueba22 = nEsimo(4,7,20);

}