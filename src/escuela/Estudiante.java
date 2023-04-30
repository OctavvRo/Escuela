
package escuela;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Estudiante {
    
    //Atributos
    private int numId;
    private String nombre;
    private int edad;
    private List<String> asignatura;
    private int cantidad;
    private HashMap<String,Integer> Lista = new HashMap<>();
    //método scanner
    Scanner e = new Scanner(System.in);
    
    public Estudiante(int numId, String nombre, int edad) {
        this.numId = numId;
        this.nombre = nombre;
        this.edad = edad;
    }
    public void establecerAtributos(){
         System.out.println("Ingresa el nombre del estudiante: ");
        this.nombre = e.nextLine();
        System.out.println("Ingresa el id del estudiante: ");
        this.numId = e.nextInt();
        System.out.println("Ingresa la edad del estudiante: ");
        this.edad = e.nextInt();
       
        
    }
    
    public void agregarAsignatura(){
        
        Scanner e = new Scanner(System.in);
        this.asignatura =new ArrayList<>(); 
        
        //Cantidad de asignaturas que se agregaran a la lista.
        System.out.println("Ingresa la cantidad de asignaturas que quieras agregar: ");
        this.cantidad = e.nextInt();
        
        //Ciclo para ingresar por teclado las asignaturas.
        int contador = 1;
        
        for (int i = 0; i < cantidad; i++) {
            if(i%2==0){System.out.println("Ingresa la asignatura "+(contador)+ ":");
            String string = e.next();
            asignatura.add(string);
            contador+=1;
        }else{
                System.out.println("Ingresa la nota");
                String string = e.next();
                asignatura.add(string);

            }
        
        }
            
        //ciclo que muestra las asignaturas ingresadas.
        for(int i=0; i< cantidad; i++){
            //System.out.println(asignatura.get(i));
      
        }
        
        
    }    
        public void eliminarAsignatura(){
            System.out.println("Ingresa la asignatura que quieras eliminar ");
            
            for(int i=0; i< cantidad; i++){
            System.out.println((i+1)+" "+asignatura.get(i));
      
        }
           int eliminar= e.nextInt();
           asignatura.remove(eliminar-1);
        for(int i=0; i< (cantidad-1); i++){
            System.out.println((i+1)+" "+asignatura.get(i));
      
        }}
        
        
        public void crearMatriz(){
            System.out.println("Ingresa la cantidad de asignaturas que quieras agregar: ");
            int asignaturas = e.nextInt();
            String[][] matriz = new String[asignaturas][2];
            e.nextLine();
            for(int i = 0; i< matriz.length;i++)
                {
                    System.out.println("Ingresa el nombre de la materia: ");
                    
                    
                    matriz[i][0]= e.nextLine();
                    
            }
              for(int i = 0; i< matriz.length;i++)
                {
                    System.out.println("Ingresa la nota: "+(i+1));
                    String nota= e.nextLine();
                    matriz[i][1] = String.format("%.1f", nota);
                    
            }   
                
            for(int i= 0; i < 3;i++){
       
                    System.out.print("Asigantura: "+matriz[i][0]+" Nota: ");
                    System.out.println(matriz[i][1]);
                
            }
            
            
            
        }
        
           
}
