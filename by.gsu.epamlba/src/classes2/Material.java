package classes2;

public class Material {
    private String name;
    private int density;

    public Material(String name, int density) {
        this.name = name;
        this.density = density;
    }
    public Material(){
    }

    public String getName() {
        return name;
    }
    public int getDensity() {
        return density;
    }
    @Override
    public String toString() {
        return name + ";" + density + ";" ;
    }
}


