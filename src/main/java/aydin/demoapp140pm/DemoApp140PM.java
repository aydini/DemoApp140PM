/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package aydin.demoapp140pm;

/**
 *
 * @author ilknur AYDIN
 */
public class DemoApp140PM {
    
     public static void methodC(int paramC){        
        System.out.println("paramC is " + paramC);        
    }
 
    
     public static void methodB(int paramB){        
        System.out.println("paramB is " + paramB);        
        methodC(paramB);
    }
 
    public static void methodA(int paramA){
        int localA = 66;
        System.out.println("paramA is " + paramA);
        paramA = 77;
        System.out.println("again paramA is " + paramA);
        methodB(paramA);
    }
    public static void methodArray(int [] array){
        array[0]= 99;
    }
    
    public static void main(String[] args) {
        
        // demo about array variables
        int [] arrayA = new int[10];
        arrayA[0] = 33;
        methodArray (arrayA);
        System.out.println("arrayA[0] is " + arrayA[0]);
        
        // demo about scope of variables in methods
        /*int a  = 333;
        System.out.println("a is " + a);
        methodA(a);
        System.out.println("again ais " + a);
        */
        
        // demo about scope of variables
        /*int mainA; // scope is main method from line 15
        mainA = 800;
        System.out.println("mainA is " + mainA);
        
        if (true){
            int mainB = 700; // scope of mainB is the if block
            System.out.println("mainA is " + mainA);
            System.out.println("mainB is " + mainB);
        }        
        //System.out.println("mainB is " + mainB);
        */
        
        /*System.out.println("Hi! This is a computer game with two players...");
        System.out.println("Creating two players...");
        Player p1 = new Player("Tony", 0);
        Player p2 = new Player("Ramses", 0);
        System.out.println("Created Players...");
      */
        
    } // end of main method
} // end of the class DemoApp140PM
