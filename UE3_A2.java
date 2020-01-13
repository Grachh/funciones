//  DOCUMENTACIÓN DEL PROGRAMA  -------------------------------------
/*
  ARCHIVO: UE3_A2.java
  EFECTO: Operaciones sobre propiedades de un cilindro.
  AUTOR: JMB
  GRUPO: 1O5M
  FECHA_CREACIÓN:  3/11/2010
  FECHA_ÚLTIMA_MODIFICACIÓN:  5/11/2010
*/

//  USO: UE3_A2 ue32 = new UE3_A2 ()

class UE3_A2
{

//  DECLARACION DE CONSTANTES  -------------------------------------- 
  
  final double pi = Math.PI;

//  DECLARACION DE FUNCIONES  ---------------------------------------

/*
  FUNCION longitudCircunferencia (radio : Real) ---> Real  
  PRE: radio >= 0
  POST: resultado = 2 * pi * radio
*/
  double longitudCircunferencia (double radio)
  {
     return 2*pi*radio;
  }
/*
  FUNCION areaCirculo (radio : Real) ---> Real  
  PRE: radio >= 0
  POST: resultado = pi * radio^2
*/
  double areaCirculo (double radio)
  {
     return pi * radio * radio;
  }
/*
  FUNCION volumenCilindro (radio, altura : Real)  ---> Real 
  PRE: (radio >= 0) /\ (altura >= 0)
  POST: resultado = altura * areaCirculo (radio)
*/
  double volumenCilindro (double radio, double altura)
  {
     return altura * areaCirculo (radio);
  }
/*
  FUNCION areaRectangulo (base, altura : Real) ---> Real  
  PRE: (base >= 0) /\ (altura >= 0)
  POST: resultado = base * altura
*/
  double areaRectangulo (double base, double altura)
  {
     return base * altura;
  }  
/*
  FUNCION superficieCilindro (radio, altura : Real) ---> Real  
  PRE: (radio >= 0) /\ (altura >= 0)
  POST: resultado = 2 * A_C + A_R
  DONDE: A_C = Area_Circulo (radio)
         A_R = Area_Rectangulo (L_C, altura)
         L_C = Longitud_Cicunferencia
*/
  double superficieCilindro (double radio, double altura)
  {
     return 2 * areaCirculo (radio) +
            areaRectangulo (longitudCircunferencia (radio),altura);
  }

//  DECLARACION DE PRUEBAS  -----------------------------------------

  double prueba1 = longitudCircunferencia (2); 
  double prueba2 = areaCirculo (2); 
  double prueba3 = areaRectangulo (2,4);
  double prueba4 = volumenCilindro (2,4);
  double prueba5 = superficieCilindro (2,4);
  
}