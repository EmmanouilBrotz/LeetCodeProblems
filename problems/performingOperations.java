public class performingOperations {
    public static void main(String[] args) {
        String[] operations = new String[]{"--X", "X++", "X++"}; // sample operations array
        System.out.println("Final Value after Operations: " + finalValueAfterOperations(operations));
    }
    protected static int finalValueAfterOperations(String[] operations){
        int x = 0;
        for(String operation : operations){
            if(operation.equals("X++") || operation.equals("++X")){
                x++;
            }
            else if(operation.equals("X--") || operation.equals("--X")){
                x--;
            }
        }
        return x;
    }
}
