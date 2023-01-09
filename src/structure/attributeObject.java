package structure;

public class attributeObject {
    String Name;
    String Effect;
    int ValueORPercent;

    public void setValueORPercent(int valueORPercent) {
        ValueORPercent = valueORPercent;
    }

    public void setEffect(String effect) {
        Effect = effect;
    }

    public void setName(String name){
        Name = name;
    }

    //////////////////////////////////////////////////////////

    public String getName(){
        return Name;
    }

    public String getEffect() {
        return Effect;
    }

    public int getValueORPercent(){
        return ValueORPercent;
    }
}
