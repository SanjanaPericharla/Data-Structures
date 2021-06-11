import java.util.*;
class Main{
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    
    public void enqueue(int val){
        s1.push(val);
    }
    public int dequeue(){
        if(!s2.empty()){
            return s2.pop();
        }
        if(s1.empty()){
            return -1;
        }
        while(s1.size() != 0){
            s2.push(s1.pop());
        }
        return s2.pop();
    }
    public static void main(String args[]){
        Main s = new Main();
        s.enqueue(7);
        s.enqueue(3);
        s.enqueue(4);
        System.out.println(s.dequeue());
        System.out.println(s.dequeue());
        s.enqueue(5);
        System.out.println(s.dequeue());
        System.out.println(s.dequeue());
        
    }
    
}
// Tc - enqueue - O(1)
//      dequeue - O(N)
