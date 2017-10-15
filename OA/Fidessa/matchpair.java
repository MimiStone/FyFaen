/*
 * Complete the function below.
 */

    static int findMatchingPair(String input) {
        Stack<Character> stack = new Stack<>();
        int result = -1;
        if(input == null || input.length()==0) {
            return result;
        }
        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if(c >= 'A' && c <= 'Z') {
                System.out.println("big");
                stack.push(c);
                //result = i;
                System.out.println(result);
            } else{
                System.out.println("small");
                if(stack.isEmpty()) {
                    break;
                }  
                if(stack.peek().charValue() - 'A' + 'a' == c){
                
                    result = i;
                    stack.pop();
                } else {
                    break;
                }
            }
        }
        return result;
    }

