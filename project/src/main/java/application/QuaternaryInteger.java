package application;

public class QuaternaryInteger {
    private final int baseTenValue;

    public QuaternaryInteger(int baseTenValue) {
        this.baseTenValue = baseTenValue;
    }

    public QuaternaryInteger(String baseFourValue){
        this.baseTenValue = Integer.parseInt(baseFourValue, 4);
    }


    public int getBaseTenValue() {
        return baseTenValue;
    }

    public String getBaseFourValue(){
        return Integer.toString(baseTenValue, 4);
    }
}
