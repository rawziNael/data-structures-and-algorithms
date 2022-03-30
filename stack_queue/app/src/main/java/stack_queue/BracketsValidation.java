package stack_queue;

//Aya Solution

public class BracketsValidation{

            public static boolean validateBrackets(String input){
                Stack stack = new Stack();
                for (int i = 0; i < input.length(); i++) {
                    if (input.charAt(i) == '(' || input.charAt(i) == '[' || input.charAt(i) == '{')
                    {
                        stack.push(String.valueOf(input.charAt(i)));
                    }
                    else {
                        String topStack = String.valueOf(stack.peek());
                        if (    (input.charAt(i) == ')' && topStack.contains("(")) ||
                                (input.charAt(i) == ']' && topStack.contains("[")) ||
                                (input.charAt(i) == '}' &&topStack.contains("{")))
                        {

                            stack.pop();
                        }
                        else if(input.charAt(i) == ')' || input.charAt(i) == ']' || input.charAt(i) == '}')
                        {
                            return false;
                        }
                    }
                }
                if(stack.isEmpty()){
                    return true;
                }
                return false;
            }
}
