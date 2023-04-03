public class Elephant {
    private String name;

    private String race;

    private String weight;

    private String age;

    public Fish() {

    }

    public Elephant(String name, String race, String weight, String age) {
        super(name, race, weight, age);
        this.name = name;
        this.race = race;
        this.weight = weight;
        this.age = age;
    }


    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getRace() { return race; }
    public void setRace(String race) { this.race = race; }
    public String getWeight() { return weight; }
    public void setWeight(String weight) { this.weight = weight; }
    public String getAge() { return age; }
    public void setAge(String age) { this.age = age; }
    public String toString() {//Creando un metodo que ya existe, por lo tanto es sobrecarga un metodo
        return "\n==========Datos del Elefante==========\n" +
                "Su nombre es: " + this.getName() + "\n" +
                "Su raza es: " + this.getRace() + "\n" +
                "Su peso es: " + this.getWeight() + "\n" +
                "Su edad es: " + this.getAge() + "\n" ;
    }

}
