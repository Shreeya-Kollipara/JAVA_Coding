import java.util.*;

public class EvaluatePostfix {

    public static void main(String[] args) {
        String[] expression={"2","1","+","3","*"};

        Stack<Integer> stack=new Stack<>();

        for(String value:expression) {
            if(value.equals("+")||value.equals("-")||value.equals("*")||value.equals("/")) {
                int b=stack.pop();
                int a=stack.pop();

                if(value.equals("+"))
                    stack.push(a+b);
                else if(value.equals("-"))
                    stack.push(a-b);
                else if(value.equals("*"))
                    stack.push(a*b);
                else
                    stack.push(a/b);
            } else {
                stack.push(Integer.parseInt(value));
            }
        }

        System.out.println(stack.pop());
    }
}
