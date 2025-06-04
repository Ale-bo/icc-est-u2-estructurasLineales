import Models.*;
import Controllers.*;

/*
public class App {
    public static void main(String[] args) throws Exception {
         
        Stack stack = new Stack();
        stack.push(10);
        stack.push(-1);
        stack.push(5);
        stack.push(8);
        System.out.println("Tam=" + stack.size());
        stack.printStack();
        stack.pop();
        System.out.println("Tam=" + stack.size());
        stack.printStack();
        //8 | 5 | -1 | 10
        // 5 | -1 | 10 
       


}

}
 */
public class App {
    public static void main(String[] args) throws Exception {
    Stack stack = new Stack();
    stack.push(10);
    stack.push(-1);
    stack.push(5);
    stack.push(8);
    System.out.println("Tam=" + stack.size());
    stack.printStack();
    stack.pop();
    System.out.println("Tam=" + stack.size());
    stack.printStack();
    System.out.println("-----------");
    StackG<Integer> pilaG = new StackG<Integer>();
    pilaG. push(10);
    pilaG. push(-1);
    pilaG. push(5);
    pilaG. push(8);
    System.out.println("Tam=" + pilaG.size());
    pilaG.printStack();
    pilaG.pop();
    System.out.println("Tam=" + pilaG.size());
    pilaG.printStack();
    System.out.println("-----------");
    Persona p1= new Persona("Juan");
    Persona p2= new Persona("Maria");
    Persona p3= new Persona("Pedro");
    Persona p4 = new Persona("David");

    QueueG<Persona> colaPersonas = new QueueG<Persona>();
    colaPersonas.add(p1);
    colaPersonas.add(p2);
    colaPersonas.add(p3);
    colaPersonas.printcola();
    System.out.println("Persona atendida:" + colaPersonas.remove());
    colaPersonas.printcola();
    Persona pB = colaPersonas.findByName("Juan");
    System.out.println("Persona Buscada: ->"+ pB != null ? pB.getNombre());         
    Persona pE = colaPersonas.deleteByName("Pedro");
    System.out.println("Persona Eliminada: ->"+ pE != null ? pE.getNombre());                                                   
    colaPersonas.printcola();                                                       
    }

}