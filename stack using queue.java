import java.util.*;
class Main{
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
  
  // push function is to add elements into the q1
  
    public void push(int val){
        q1.add(val);
    }
  
  // pop function is to remove the first element from the queue
  // if queue is empty - return & if q1 is not present at the 1st index 
  // remove elements from q1 and add into q2 and when the q1 is in the 1st index 
  //remove the 1st index element and store it in value and push the elements from q1 to q2 and return the value.
    public int pop(){
        if(q1.isEmpty()){
            return -1;
        }
        while(q1.size() != 1){
            q2.add(q1.remove());
        }
        int temp = q1.remove();
        Queue<Integer> t = q1;
        q1 = q2;
        q2 = t;
        return temp;
    }
    public static void main(String args[]){
        Main a = new Main();
        a.push(7);
        a.push(3);
        a.push(4);
        System.out.println(a.pop());
        System.out.println(a.pop());
        a.push(5);
        System.out.println(a.pop());
        System.out.println(a.pop());
        System.out.println(a.pop());
    }
}
