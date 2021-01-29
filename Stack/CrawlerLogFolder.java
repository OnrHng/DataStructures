import java.util.Stack;

class CrawlerLogFolder {
    public int minOperations(String[] logs) {
        
        // Solution 1 without Stack
//         int count = 0;
//         for(String log : logs) {
//             if(log.equals("../")) {
//                 if(count != 0) count--;

//             }                
//             else if(log.equals("./")) continue;
//             else count++;
//         }
        
//         return count;
        
        Stack<String> stack = new Stack<>();
        for(String log : logs) {
            if(log.equals("../")) {
                if(!stack.isEmpty()) stack.pop();

            }                
            else if(log.equals("./")) continue;
            else stack.push("1");
        }
        return stack.size();
    }
}