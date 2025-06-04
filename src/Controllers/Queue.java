package Controllers;
import Models.Node;
import java.util.EmptyStackException;

public class Queue {
    private Node primero; // head - front
    private Node ultimo; // tail - back
    private int size;

    public Queue(){
        this.primero = null;
        this.ultimo = null;
        this.size = 0;
    }
    public boolean isEmpty(){
        return primero == null;
    }

    public void add(int value){
        Node newNode = new Node(value);
        if (isEmpty()){
            primero = newNode;
            ultimo = newNode;
        }else {
            ultimo.setNext(newNode);
            ultimo = newNode;
        }
        size++;
    }

    public int remove(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int aux = primero.getValue();
        primero = primero.getNext();
        return aux;
    }

    public int size(){

        return size;
    }
    
    public int peek(){
        if(isEmpty()) throw new EmptyStackException();return primero.getValue();

    }
    
}