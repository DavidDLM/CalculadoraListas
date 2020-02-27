import java.io.BufferedReader;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;

/**
 * 
 */

/**
 * @author Mario de Leon
 * @author Mariana Morales
 * 
 * 
 * Main class Calculadora
 *
 */
public class Calculadora {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculadoraFunciones calculadora = new CalculadoraFunciones();
		StackFactory<Integer> factory = new StackFactory<Integer>();
		Scanner opcion = new Scanner(System.in);
		iStack<String> stackOperadores = new StackArrayList<String>();
		
		
		
		String path = (new File("")).getAbsolutePath()+File.separator+"src"+File.separator+"datos.txt";
		System.out.println("Que tipo de Stack utilizar para realizar la operacion? \n1.ArrayList \n2.Vector \n3.Listas");
		String seleccion = opcion.nextLine();
		
		
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;

		
		if(seleccion.equals("1")) {
          	iStack<Integer> stackValores = factory.getStack("ArrayList");
          	try {
   	         // Apertura del fichero y creacion de BufferedReader para poder
   	         // hacer una lectura comoda (disponer del metodo readLine()).
   	         archivo = new File (path);
   	         fr = new FileReader (archivo);
   	         br = new BufferedReader(fr);
   	   // Lectura del fichero
	         String linea;
	         while((linea=br.readLine())!=null)
	         {
	        	System.out.println(linea);
				for(int i=0; i<linea.length(); i++)
	         	{
	        		String caracter = String.valueOf(linea.charAt(i));
	         		//System.out.println("caracter: "+caracter);
	         		
	         		//Logica para pasar infix a postfix
	         		
	         		//1. Hay una columna de simbolo que es la columna que va tomando el caracter que se va leyendo, en ese caso este seria el for que ya se hizo
	         		//2. Luego hay una stack en el que se van guardando los operadores
	         		//3. y en el otro puede ser una lista o un string en donde se guarda

			         		if(caracter.trim().isEmpty()==false)
			         		{
			         			if(caracter.equals("+"))
			         			{
			         				stackOperadores.push(caracter);
			         				
			         				int valorB = stackValores.pop();
			         				int valorA = stackValores.pop();
			         				
			         				stackValores.push(calculadora.sumar(valorA, valorB));
			         				
			         				stackOperadores.pop();
			         			}
			         			else if (caracter.equals("-"))
			         			{
			         				stackOperadores.push(caracter);
			         				
			         				int valorB = stackValores.pop();
			         				int valorA = stackValores.pop();
			         				
			         				stackValores.push(calculadora.restar(valorA, valorB));
			         				stackOperadores.pop();
			         			}
			         			else if (caracter.equals("*"))
			         			{
			         				stackOperadores.push(caracter);
			         				
			         				int valorB = stackValores.pop();
			         				int valorA = stackValores.pop();
			         				
			         				stackValores.push(calculadora.multiplicar(valorA, valorB));
			         				stackOperadores.pop();
			         			}
			         			else if (caracter.equals("/"))
			         			{
			         				stackOperadores.push(caracter);
			         				
			         				int valorB = stackValores.pop();
			         				int valorA = stackValores.pop();
			         				
			         				stackValores.push(calculadora.dividir(valorA, valorB));
			         				stackOperadores.pop();
			         			}
			         			else
			         			{
			         				//Verifica si el char es un entero el cual se puede operar
			         				try {
			         					Integer.parseInt(caracter);
			         					stackValores.push(Integer.parseInt(caracter));
			         				}catch (Exception e) {
			         					System.out.println("El archivo contiene un caracter no valido.");
			         				}
			         			}
			         		
	         		}
	         	}
	        	
	        	if(stackValores.size()==1) {
	        		System.out.println("\nResultado: "+stackValores.pop());
	        	}
	         }
	         
          	}catch(Exception e){
		         e.printStackTrace();
		         
		         
		      }finally{
		         // En el finally cerramos el fichero, para asegurarnos
		         // que se cierra tanto si todo va bien como si salta 
		         // una excepcion.
		         try{                    
		            if( null != fr ){   
		               fr.close();     
		            }                  
		         }catch (Exception e2){ 
		            e2.printStackTrace();
		         }
		      }
          	 
          	 
          	 
          	 
          	 
           }else if(seleccion.equals("2")) {
          	 iStack<Integer> stackValores = factory.getStack("Vector");
          	try {
      	         // Apertura del fichero y creacion de BufferedReader para poder
      	         // hacer una lectura comoda (disponer del metodo readLine()).
      	         archivo = new File (path);
      	         fr = new FileReader (archivo);
      	         br = new BufferedReader(fr);
      	   // Lectura del fichero
   	         String linea;
   	         while((linea=br.readLine())!=null)
   	         {
   	        	System.out.println(linea);
   				for(int i=0; i<linea.length(); i++)
   	         	{
   	        		String caracter = String.valueOf(linea.charAt(i));
   	         		//System.out.println("caracter: "+caracter);
   	         		
   	         		//Logica para pasar infix a postfix
   	         		
   	         		//1. Hay una columna de simbolo que es la columna que va tomando el caracter que se va leyendo, en ese caso este seria el for que ya se hizo
   	         		//2. Luego hay una stack en el que se van guardando los operadores
   	         		//3. y en el otro puede ser una lista o un string en donde se guarda

   			         		if(caracter.trim().isEmpty()==false)
   			         		{
   			         			if(caracter.equals("+"))
   			         			{
   			         				stackOperadores.push(caracter);
   			         				
   			         				int valorB = stackValores.pop();
   			         				int valorA = stackValores.pop();
   			         				
   			         				stackValores.push(calculadora.sumar(valorA, valorB));
   			         				
   			         				stackOperadores.pop();
   			         			}
   			         			else if (caracter.equals("-"))
   			         			{
   			         				stackOperadores.push(caracter);
   			         				
   			         				int valorB = stackValores.pop();
   			         				int valorA = stackValores.pop();
   			         				
   			         				stackValores.push(calculadora.restar(valorA, valorB));
   			         				stackOperadores.pop();
   			         			}
   			         			else if (caracter.equals("*"))
   			         			{
   			         				stackOperadores.push(caracter);
   			         				
   			         				int valorB = stackValores.pop();
   			         				int valorA = stackValores.pop();
   			         				
   			         				stackValores.push(calculadora.multiplicar(valorA, valorB));
   			         				stackOperadores.pop();
   			         			}
   			         			else if (caracter.equals("/"))
   			         			{
   			         				stackOperadores.push(caracter);
   			         				
   			         				int valorB = stackValores.pop();
   			         				int valorA = stackValores.pop();
   			         				
   			         				stackValores.push(calculadora.dividir(valorA, valorB));
   			         				stackOperadores.pop();
   			         			}
   			         			else
   			         			{
   			         				//Verifica si el char es un entero el cual se puede operar
   			         				try {
   			         					Integer.parseInt(caracter);
   			         					stackValores.push(Integer.parseInt(caracter));
   			         				}catch (Exception e) {
   			         					System.out.println("El archivo contiene un caracter no valido.");
   			         				}
   			         			}
   			         		
   	         		}
   	         	}
   	        	
   	        	if(stackValores.size()==1) {
   	        		System.out.println("\nResultado: "+stackValores.pop());
   	        	}
   	         }
   	         
             	}catch(Exception e){
   		         e.printStackTrace();
   		         
   		         
   		      }finally{
   		         // En el finally cerramos el fichero, para asegurarnos
   		         // que se cierra tanto si todo va bien como si salta 
   		         // una excepcion.
   		         try{                    
   		            if( null != fr ){   
   		               fr.close();     
   		            }                  
   		         }catch (Exception e2){ 
   		            e2.printStackTrace();
   		         }
   		      }
          	 
          	 
          	 
          	 
           }else if(seleccion.equals("3")) {
        	   ListFactory<Integer> listaType = new ListFactory<Integer>();
        	   iStack<Integer> stackValores = factory.getStack("Lista");
        	   
        	   Scanner e = new Scanner(System.in);
        	   System.out.println("Lista a usar: \n1.Simple enlazada \n2.Doble enlazada \n3.Circular");
        	   String opcionLista = e.nextLine();
          	 
        	   
        	/**
       		 * Simply linked list   
       		 */
        	   if(opcionLista.equals("1")) {
        		   iList<Integer> simple = listaType.getList("Simple");
        		   
        		   try {
            	         archivo = new File (path);
            	         fr = new FileReader (archivo);
            	         br = new BufferedReader(fr);
         	         String linea;
         	         while((linea=br.readLine())!=null) {
         	        	System.out.println(linea);
         	        	
         	        	for(int i=0; i<linea.length(); i++){
           	        		String caracter = String.valueOf(linea.charAt(i));
           	        		
           	        		if(caracter.trim().isEmpty()==false) {
           	        			if(caracter.equals("+"))
   			         			{
   			         				stackOperadores.push(caracter);
   			         			
   			         				int A = simple.getFirst();
   			         				simple.removeFirst();
   			         				//System.out.println(B);
   			         				//System.out.println(simple.size());
   			         				
   			         				int B = simple.getFirst();
   			         				simple.removeFirst();
   			         				//System.out.println(A);
			         				//System.out.println(simple.size());
			         				
   			         				simple.addFirst(calculadora.sumar(B, A));
   			         				
   			         				stackOperadores.pop();
   			         				
   			         			}else if(caracter.equals("-"))
   			         			{
   			         				stackOperadores.push(caracter);
   			         			
   			         				int A = simple.getFirst();
   			         				simple.removeFirst();
   			         				//System.out.println(B);
   			         				//System.out.println(simple.size());
   			         				
   			         				int B = simple.getFirst();
   			         				simple.removeFirst();
   			         				//System.out.println(A);
			         				//System.out.println(simple.size());
			         				
   			         				simple.addFirst(calculadora.restar(B, A));
   			         				
   			         				stackOperadores.pop();
   			         			}else if(caracter.equals("*"))
   			         			{
   			         				stackOperadores.push(caracter);
   			         			
   			         				int A = simple.getFirst();
   			         				simple.removeFirst();
   			         				//System.out.println(B);
   			         				//System.out.println(simple.size());
   			         				
   			         				int B = simple.getFirst();
   			         				simple.removeFirst();
   			         				//System.out.println(A);
			         				//System.out.println(simple.size());
			         				
   			         				simple.addFirst(calculadora.multiplicar(B, A));
   			         				
   			         				stackOperadores.pop();
   			         			}else if(caracter.equals("/"))
   			         			{
   			         				stackOperadores.push(caracter);
   			         			
   			         				int A = simple.getFirst();
   			         				simple.removeFirst();
   			         				//System.out.println(B);
   			         				//System.out.println(simple.size());
   			         				
   			         				int B = simple.getFirst();
   			         				simple.removeFirst();
   			         				//System.out.println(A);
			         				//System.out.println(simple.size());
			         				
   			         				simple.addFirst(calculadora.dividir(B, A));
   			         				
   			         				stackOperadores.pop();
   			         			}
           	        			
           	        			
           	        			else
   			         			{
   			         				//Verifica si el char es un entero el cual se puede operar
   			         				try {
   			         					Integer.parseInt(caracter);
   			         					simple.addFirst(Integer.valueOf(caracter));;
   			         				}catch (Exception e1) {
   			         					System.out.println("El archivo contiene un caracter no valido.");
   			         				}
   			         			}
   			         		
   	         		}
   	         	}
   	        	
   	        	if(simple.size()==1) {
   	        		System.out.println("\nResultado: "+ simple.getFirst());
   	        	}
   	         }
   	         
             	}catch(Exception e1){
   		         e1.printStackTrace();
   		         
   		         
   		      }finally{
   		         // En el finally cerramos el fichero, para asegurarnos
   		         // que se cierra tanto si todo va bien como si salta 
   		         // una excepcion.
   		         try{                    
   		            if( null != fr ){   
   		               fr.close();     
   		            }                  
   		         }catch (Exception e2){ 
   		            e2.printStackTrace();
   		         }
   		      }
         	         
        		   
        		/**
           		 * Doubly linked list   
           		 */
        		   
        	   }else if(opcionLista.equals("2")) {
        		   iList<Integer> simple = listaType.getList("Double");
        		   try {
          	         archivo = new File (path);
          	         fr = new FileReader (archivo);
          	         br = new BufferedReader(fr);
       	         String linea;
       	         while((linea=br.readLine())!=null) {
       	        	System.out.println(linea);
       	        	
       	        	for(int i=0; i<linea.length(); i++){
         	        		String caracter = String.valueOf(linea.charAt(i));
         	        		
         	        		if(caracter.trim().isEmpty()==false) {
         	        			if(caracter.equals("+"))
 			         			{
 			         				stackOperadores.push(caracter);
 			         			
 			         				int A = simple.getFirst();
 			         				simple.removeFirst();
 			         				System.out.println(A);
 			         				System.out.println(simple.size());
 			         						         				
 			         				int B = simple.getFirst();
 			         				System.out.println(B);
 			         				System.out.println(simple.getFirst());
 			         				simple.removeFirst();
			         				System.out.println(simple.size());
			         				
 			         				simple.addFirst(calculadora.sumar(B, A));
 			         				
 			         				stackOperadores.pop();
 			         				
 			         			}else if(caracter.equals("-"))
 			         			{
 			         				stackOperadores.push(caracter);
 			         			
 			         				int A = simple.getFirst();
 			         				simple.removeFirst();
 			         				//System.out.println(B);
 			         				//System.out.println(simple.size());
 			         				
 			         				int B = simple.getFirst();
 			         				//simple.removeFirst();
 			         				//System.out.println(A);
			         				//System.out.println(simple.size());
			         				
 			         				simple.addFirst(calculadora.restar(B, A));
 			         				
 			         				stackOperadores.pop();
 			         			}else if(caracter.equals("*"))
 			         			{
 			         				stackOperadores.push(caracter);
 			         			
 			         				int A = simple.getFirst();
 			         				simple.removeFirst();
 			         				//System.out.println(B);
 			         				//System.out.println(simple.size());
 			         				
 			         				int B = simple.getFirst();
 			         				//simple.removeFirst();
 			         				//System.out.println(A);
			         				//System.out.println(simple.size());
			         				
 			         				simple.addFirst(calculadora.multiplicar(B, A));
 			         				
 			         				stackOperadores.pop();
 			         			}else if(caracter.equals("/"))
 			         			{
 			         				stackOperadores.push(caracter);
 			         			
 			         				int A = simple.getFirst();
 			         				simple.removeFirst();
 			         				//System.out.println(B);
 			         				//System.out.println(simple.size());
 			         				
 			         				int B = simple.getFirst();
 			         				//simple.removeFirst();
 			         				//System.out.println(A);
			         				//System.out.println(simple.size());
			         				
 			         				simple.addFirst(calculadora.dividir(B, A));
 			         				
 			         				stackOperadores.pop();
 			         			}
         	        			
         	        			
         	        			else
 			         			{
 			         				//Verifica si el char es un entero el cual se puede operar
 			         				try {
 			         					Integer.parseInt(caracter);
 			         					simple.addFirst(Integer.valueOf(caracter));;
 			         				}catch (Exception e1) {
 			         					System.out.println("El archivo contiene un caracter no valido.");
 			         				}
 			         			}
 			         		
 	         		}
 	         	}
 	        	
 	        	if(simple.size()==1) {
 	        		System.out.println("\nResultado: "+ simple.getFirst());
 	        	}
 	         }
 	         
           	}catch(Exception e1){
 		         e1.printStackTrace();
 		         
 		         
 		      }finally{
 		         // En el finally cerramos el fichero, para asegurarnos
 		         // que se cierra tanto si todo va bien como si salta 
 		         // una excepcion.
 		         try{                    
 		            if( null != fr ){   
 		               fr.close();     
 		            }                  
 		         }catch (Exception e2){ 
 		            e2.printStackTrace();
 		         }
 		      }
        		   
        		/**
        		 * Circular linked list   
        		 */
        	   }else if(opcionLista.equals("3")) {
        		   iList<Integer> circular = listaType.getList("Circular");
        		   try {
            	         archivo = new File (path);
            	         fr = new FileReader (archivo);
            	         br = new BufferedReader(fr);
         	         String linea;
         	         while((linea=br.readLine())!=null) {
         	        	System.out.println(linea);
         	        	
         	        	for(int i=0; i<linea.length(); i++){
           	        		String caracter = String.valueOf(linea.charAt(i));
           	        		
           	        		if(caracter.trim().isEmpty()==false) {
           	        			if(caracter.equals("+"))
   			         			{
   			         				stackOperadores.push(caracter);
   			         			
   			         				int B = circular.getLast();
   			         				circular.removeLast();
   			         				System.out.println(B);
   			         				System.out.println(circular.size());
   			         						         				
   			         				int A = circular.getLast();
   			         				System.out.println(A);
   			         				System.out.println(circular.getLast());
   			         				circular.removeLast();
  			         				System.out.println(circular.size());
  			         				
  			         				circular.addLast(calculadora.sumar(A, B));
   			         				
   			         				stackOperadores.pop();
   			         				
   			         			}else if(caracter.equals("-"))
   			         			{
   			         			stackOperadores.push(caracter);
   			         			
			         				int B = circular.getLast();
			         				circular.removeLast();
			         				System.out.println(B);
			         				System.out.println(circular.size());
			         						         				
			         				int A = circular.getLast();
			         				System.out.println(A);
			         				System.out.println(circular.getLast());
			         				circular.removeLast();
			         				System.out.println(circular.size());
			         				
			         				circular.addLast(calculadora.restar(A, B));
			         				
			         				stackOperadores.pop();
   			         				
   			         			}else if(caracter.equals("*"))
   			         			{
	   			         			stackOperadores.push(caracter);
	   			         			
			         				int B = circular.getLast();
			         				circular.removeLast();
			         				System.out.println(B);
			         				System.out.println(circular.size());
			         						         				
			         				int A = circular.getLast();
			         				System.out.println(A);
			         				System.out.println(circular.getLast());
			         				circular.removeLast();
			         				System.out.println(circular.size());
			         				
			         				circular.addLast(calculadora.multiplicar(A, B));
			         				
			         				stackOperadores.pop();
   			         			}else if(caracter.equals("/"))
   			         			{
	   			         			stackOperadores.push(caracter);
	   			         			
			         				int B = circular.getLast();
			         				circular.removeLast();
			         				System.out.println(B);
			         				System.out.println(circular.size());
			         						         				
			         				int A = circular.getLast();
			         				System.out.println(A);
			         				System.out.println(circular.getLast());
			         				circular.removeLast();
			         				System.out.println(circular.size());
			         				
			         				circular.addLast(calculadora.dividir(A, B));
			         				
			         				stackOperadores.pop();
   			         			}           	        			    			
           	        			else
   			         			{
   			         				//Verifica si el char es un entero el cual se puede operar
   			         				try {
   			         					Integer.parseInt(caracter);
   			         					circular.addLast(Integer.valueOf(caracter));;
   			         				}catch (Exception e1) {
   			         					System.out.println("El archivo contiene un caracter no valido.");
   			         				}
   			         			}
   			         		
   	         		}
   	         	}
   	        	
   	        	if(circular.size()==0) {
   	        		System.out.println("\nResultado: "+ circular.getLast());
   	        	}
   	         }
   	         
             	}catch(Exception e1){
   		         e1.printStackTrace();
   		         
   		         
   		      }finally{
   		         // En el finally cerramos el fichero, para asegurarnos
   		         // que se cierra tanto si todo va bien como si salta 
   		         // una excepcion.
   		         try{                    
   		            if( null != fr ){   
   		               fr.close();     
   		            }                  
   		         }catch (Exception e2){ 
   		            e2.printStackTrace();
   		         }
   		      }
        		   
        		   
        		   
        		   
        		   
        	   }else {
        		   System.out.println("Opcion no valida!");
        	   }
          	 
          	 
           }else {
          	 System.out.println("Eleccion no valida!");
           } 
	}

}
