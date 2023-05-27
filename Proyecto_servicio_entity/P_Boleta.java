package Proyecto_servicio_entity;
import java.util.*;
import java.util.Date;
public class P_Boleta {
	 Scanner sc = new Scanner(System.in);
     int numProd, doc; 
     String cliente;
     
     
	  public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        int numProd, doc; String cliente;      
	       
	        
	        //lectura de datos
	        System.out.print("Ingrese Numero de RUC/DNI: ");
	        doc = sc.nextInt();
	        
	        System.out.print("Ingrese Cliente: ");
	        cliente = sc.next();
	        
	        //Lectura de productos ingresados para el Array
	        do {
	            System.out.print("Número de PRODUCTOS INGRESADOS: ");
	            numProd = sc.nextInt();
	        } while (numProd <= 0);
	        
	        
	        H_conteo tra = new H_conteo(numProd,doc,cliente);
	        tra.ejecucion(); 
	        
	            
	        
	        
            //aaaa
           
	        
	         
	    } 
	   public P_Boleta (){
		   super ();
	   }
	  
	  
	    public P_Boleta(int numProd, int doc, String cliente) {
	    	super ();
	        this.numProd = numProd;
	        this.doc = doc;
	        this.cliente = cliente;
	            }

	    public int getnumProd() {
	        return numProd;
	    }

	    public int getdoc() {
	        return doc;
	    }

	    public String cliente() {
	        return cliente;
	    }
	    
	    
	

}
