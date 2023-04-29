
package escuela;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Estudiante {
    
    //Atributos
    private int numId;
    private String nombre;
    private int edad;
    private List<String> asignatura;
    private int cantidad;
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
        
        
        System.out.println("Ingresa la cantidad de asignaturas que quieras agregar: ");
        this.cantidad = e.nextInt();
        
        for(int i=0; i< cantidad; i++){
            System.out.println("Ingresa la asignatura "+ (i+1)+ ":");
            
            
            String valor = e.nextLine();
            asignatura.add(valor);
      
        }
        for(int i=0; i< 5; i++){
            //System.out.println(asignatura.get(i));
      
        }
        
        
    }    
        public void eliminarAsignatura(){
            System.out.println("Ingresa la asignatura que quieras eliminar ");
            
            for(int i=0; i< cantidad; i++){
            System.out.println((i+1)+" "+asignatura.get(i));
      
        }
           int eliminar= e.nextInt();
           //int eliminar2 = eliminar-1;
           asignatura.remove(eliminar-1);
        for(int i=0; i< (cantidad-1); i++){
            System.out.println((i+1)+" "+asignatura.get(i));
      
        }
           
}}
