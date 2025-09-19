class MyStack {
    private int[] oper;
    private int capacity=100;
    private int top;

    MyStack(){
        this.oper=new int[100];
        this.top=0;
    }
    public void push(int x) {
        // code here
        if(top == capacity - 1) {
            // System.out.println("Stack Overflow");
            return;
        }
   
        this.oper[top++] = x;
        
        
    }

    public int pop() {
        
        // code here
        if(top == 0) {
            // System.out.println("Stack Underflow");
            return -1;
        }
    
        return oper[--top];
    }
}
