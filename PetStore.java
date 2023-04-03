public class PetStore {
    private String name;

    private String race;

    private String weight;

    private String age;

    public Petstore() {
    }

    public Petstore(String name, String race, String weight, String age) {
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
}
}
