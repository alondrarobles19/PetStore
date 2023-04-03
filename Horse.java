public class Horse {
    private String eat;

    private String color;

    private String species;


    public Horse() {

    }
    public Horse(String name, String race, String weight, String age) { super(name, race, weight, age); }
    public Horse(String name, String race, String weight, String age, String eat, String color, String species) {
        super(name, race, weight, age);
        this.eat = eat;
        this.color = color;
        this.species = species;

    }

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String toString() {//Creando un metodo que ya existe,  por lo tanto es Sobrecarga un metodo
        return "\n==========Datos de Caballo==========\n" +
                "Su nombre es: " + this.getName() + "\n" +
                "Su raza es: " + this.getRace() + "\n" +
                "Su peso es: " + this.getWeight() + "\n" +
                "Su año es: " + this.getAge() + "\n" +
                "Su comida es: " + this.getEat() + "\n"+
                "Su color es: " + this.getColor() + "\n" +
                "Su epecie es: " + this.getSpecies() + "\n";
    }

}
