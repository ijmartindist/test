package arrays;

import java.util.Scanner;

public class TestArrays {

	
	    public static void main(String[] args) {
	        // declares an array of integers
	        int[] anArray;
	        int[] vector1,vector2,sumaVector;
	        int valor, suma,mayor,posicion,indice1,indice2,aux;
	        Scanner teclado=new Scanner(System.in);
	        
	        vector1= new int[4];
	        vector2= new int[4];
	        sumaVector= new int[4];
	        //Sumar        
	        for(int i=0;i<vector1.length;i++) {
	        	System.out.println("Introduce un valor");
	        	valor=teclado.nextInt();
	        	vector1[i]=valor;	        	
	        }
	        
	        for(int i=0;i<vector2.length;i++) {
	        	System.out.println("Introduce un valor");
	        	valor=teclado.nextInt();
	        	vector2[i]=valor;	        	
	        }
	        
	        for(int i=0;i<sumaVector.length;i++) {
	        	sumaVector[i]=vector1[i]+vector2[i];
	        }
	        
	        for(int i=0;i<sumaVector.length;i++) {
	        	 System.out.println("Element at index "+i+":"+ sumaVector[i]);
	        }
	        
	        
	        
	        
	        
	        
	        
	        // allocates memory for 10 integers
	        anArray = new int[10];
	        // Almacenamos datos en memoria
	        for(int i=0;i<anArray.length;i++) {
	        	System.out.println("Introduce un valor");
	        	valor=teclado.nextInt();
	        	anArray[i]=valor;	        	
	        }
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        //Sumar todos los valores del array
	        suma=0;
	        for(int i=0;i<anArray.length;i++) {
	        	suma+=anArray[i];
	        }
	        System.out.println("La suma es: "+suma);
	        
	        //Calcular el valor más alto
	        mayor=anArray[0];
	        posicion=0;
	        for(int i=1;i<anArray.length;i++) {
	        	if(anArray[i]>mayor) {
	        		mayor=anArray[i];
	        		posicion=i;
	        	}
	        }
	        System.out.println("Valor más alto: "+anArray[posicion]);
	        System.out.println("Valor más alto índice: "+posicion);
	        
	        //Intercambio de dos valores del array dados sus índices
	        System.out.println("Introduce un valor de índice");
        	indice1=teclado.nextInt();
        	System.out.println("Introduce un valor de índice");
        	indice2=teclado.nextInt();
        	aux=anArray[indice2];
	        anArray[indice2]=anArray[indice1];
	        anArray[indice1]=aux;
        	
        	1 6 7  8
        	2 3 6  7
        	3 9 13 15
        	
        	
	        for(int i=0;i<anArray.length;i++) {
	        	 System.out.println("Element at index "+i+":"+ anArray[i]);
	        }
	        
	       /* for(int elemento:anArray) {
	        	System.out.println(elemento);
	        }*/
	       teclado.close();
	    }
	

}
