/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Mateo Quinteros
 */
public class Arboles {

    /**
     * @param args the command line arguments
     */
    
  //  private static ArrayList<Arbol> tree;
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String name, family, soil, zone, op;
        
        List<List<String>> Arbol = new ArrayList<List<String>>();
        for(int i =0; i<= 3; i++){
            Arbol.add(new ArrayList<String>());
        }
        //this.tree = Factory.nuevoArrayListArbol();
        do{
        System.out.println("=============================");
        System.out.println("         BIENVENIDO");
        System.out.println("=============================");
        System.out.println("");
        System.out.println("1. Agregar arboles");
        System.out.println("2. Mostrar");
        System.out.println("3. Salir");
        System.out.println("Seleccione una opcion");
        
        op=input.nextLine();
        
        switch(op){
            
            case "1":
                System.out.println("");
                System.out.println("Digite el nombre");
                name=input.nextLine();
                
                System.out.println("Diigite la familia");
                family=input.nextLine();
                
                System.out.println("Digite el tipo de suelo");
                soil=input.nextLine();
                System.out.println("Digite la zona");
                zone=input.nextLine();
                
                Arbol.get(0).add(name);
                Arbol.get(1).add(family);
                Arbol.get(2).add(soil);
                Arbol.get(3).add(zone);
                break;
            
            case "2":
                System.out.println("");
                System.out.println("Datos actuales");
                for (int i = 0; i <= Arbol.get(0).size() - 1; i++) {
                System.out.println("NOMBRE: " + Arbol.get(0).get(i) + " FAMILIA: "
                        + Arbol.get(1).get(i) + " SUELO " + Arbol.get(2).get(i)
                        + " ZONA: " + Arbol.get(3).get(i));
                    System.out.println("");
                }
                System.out.println("Presione una tecla para continuar");
                input.nextLine();
                System.out.println("");
                break;
                
                
        }
        }while(!op.equals("3"));
        
    }
    

    
}
