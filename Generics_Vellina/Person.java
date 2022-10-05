

public class Person<VariableType> {
    
    VariableType obj;
    
    Person(VariableType obj){
        this.obj = obj;
        
    }

    public VariableType getObj(){
        return this.obj;

    }

}
