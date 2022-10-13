
package PrimerPrevio;

/**
 *
 * @author Usuario
 */
public class Ejercicio3 {
   
    public class Node {
        int data;
        Node next;
        public Node(int data) { this.data = data; }
    }
  
    
    public Node head_of_node = null;
  
    
    public Node last = null;
  
   
    public void add(int data)
    {
        Node newNode = new Node(data);
        if (head_of_node == null) {
            head_of_node = newNode;
            last = newNode;
            newNode.next = head_of_node;
        }
        else {
            last.next = newNode;
            last = newNode;
            last.next = head_of_node;
        }
    }
   
    public void Sort_List()
    {
  
       
        Node current = head_of_node;
  
        
        Node temp = null;
  
        
        int value;
  
        
        if (head_of_node == null) {
            System.out.println("vacia");
        }
        else {
            while (current.next != head_of_node) {
                temp = current.next;
                while (temp != head_of_node) {
                    if (current.data > temp.data) {
                        value = current.data;
                        current.data = temp.data;
                        temp.data = value;
                    }
                    temp = temp.next;
                }
                current = current.next;
            }
        }
    }
   
    public void Print_List()
    {
        Node current = head_of_node;
        if (head_of_node == null) {
            System.out.println("vacio");
        }
        else {
            do {
                System.out.print(" " + current.data);
                current = current.next;
            } while (current != head_of_node);
            System.out.println();
        }
    }
    }

