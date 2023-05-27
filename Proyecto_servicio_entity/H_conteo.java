package Proyecto_servicio_entity;

import java.util.Date;

public class H_conteo extends P_Boleta {
		protected int i,CodVent;
	   protected double suma = 0, media;
       protected Date fecha;  	
       
       public H_conteo(int numProd, int doc, String cliente) {
           super(numProd, doc,cliente);
          
       }
        
     
   
	
	
   
    public void ejecucion(){
    fecha=new Date();
    CodVent=(int)(Math.random()*10+1);
   
    //INICIO DE ARRAY
 

    //Creacion de Array
    double[] notas = new double[numProd]; 
    
    // Entrada de datos. Se lee el valor de cada producto y se almacena en cada elemento del array
  
    for (i = 0; i < notas.length; i++) {
        System.out.print("Producto N° " + (i + 1) + " valor: ");
        notas[i] = sc.nextDouble();
    }

    // Se suman todos los productos
    for (i = 0; i < notas.length; i++) {
        suma = suma + notas[i];
    }

    

    // Mostrar los resultados
    System.out.println("------Boleta de venta------");
    System.out.println("Codigo de venta      :"+"VS-"+ CodVent);
    
    System.out.println("---------------------------");
    System.out.println("DNI/RUC              :" + doc);
    System.out.println("Cliente              :" + cliente);
    System.out.println("Monto a pagar        :" + suma);
    System.out.println("Numero de Productos  :" + i);

    System.out.println("---------------------------");
    System.out.println("Fecha de Pago");
    System.out.println(fecha);}

}
