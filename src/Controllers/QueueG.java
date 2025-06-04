package Controllers;
import java.util.EmptyStackException;
import Models.*;


public class QueueG <T>{
    private NodeGeneric<T> primero; // head - front
    private NodeGeneric<T> ultimo; // tail - back
    private int size;

    public QueueG(){
        this.primero = null;
        this.ultimo = null;
        this.size = 0;
    }
    public boolean isEmpty(){
        return primero == null;
    }
    public void add(T value){
        NodeGeneric<T> newNode = new NodeGeneric<T>(value);
        if (isEmpty()){
            primero = newNode;
            ultimo = newNode;
        }else {
            ultimo.setNext(newNode);
            ultimo = newNode;
        }
        size++;
    }
    public T remove(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        T aux = primero.getValue();
        primero = primero.getNext();
        return aux;
    }
    public int size(){
        return size;
    }
    public void printcola(){
        NodeGeneric<T> aux = primero;
        while(aux != null){
            System.out.print(aux.getValue() + " | ");
            aux = aux.getNext();
        }
        System.out.println();
    }
    public T findByName(String string) {
        NodeGeneric<T> aux = primero;
        while(aux != null){     
            if(aux.getValue().getNombre().equals(string)){
                return aux.getValue();
            }
            aux = aux.getNext();
        }
        return null;
    }
            
    public T deleteByName(String string) {
        NodeGeneric<T> aux = primero;
        while(aux != null){
            if(aux.getValue().getNombre().equals(string)){
                return aux.getValue();
            }
            aux = aux.getNext();
        }
        return null;    
    }
    
}


    

