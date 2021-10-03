import java.util.LinkedList;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=225 lang=java
 *
 * [225] 用队列实现栈
 */

// @lc code=start

/* 
思路是
入栈：每次都add到q2，然后把q1的元素挪到q2，接着把q2的元素全给q1，这样能保证每次新来的元素就在q1队列最前方了，把
出栈：每次从q1出 
*/
class MyStack {

    public Queue<Integer> a;
    public Queue<Integer> b;
    public MyStack() {
        a = new LinkedList<>();
        b = new LinkedList<>();
    }
    
    public void push(int x) {
        a.add(x);
        while(!b.isEmpty()){
            a.add(b.poll());
        }
        while(!a.isEmpty()){
            b.add(a.poll());
        }
    }
    
    public int pop(){
        return b.poll();
    }
    
    public int top(){
        return b.peek();
        
    }
    
    public boolean empty() {
        return b.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
// @lc code=end

