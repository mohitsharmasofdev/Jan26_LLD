package Interfaces;

public class Browser {
    Stack pagesStack;
    public Browser(Stack stack){
        pagesStack = stack;
    }
    void goToPreviousPage(){
        pagesStack.pop();
        System.out.println("Opening the prev page");
        pagesStack.top();
    }
}
