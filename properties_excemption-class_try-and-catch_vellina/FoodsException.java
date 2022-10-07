public class FoodsException extends Exception{
    public FoodsException(String message){
        super(message);
    }
    public String outofBound(){
        return "Not in the LOOP";
    }
    public String negativeIndex(){
        return "The Index is not Negative";
    }
}