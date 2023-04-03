public class PetApp {
    public static void main(String[] args) {
        Horse Horse1 = new Horse("Rayo", "Pura Sangre Ingles", "500 kg", "2 years", "Cebada", "Negro", "mamifero");
        Elephant Elephant1 = new Elephant("Dumbo", "Africano", "6,000 kg", "5 years");

        System.out.println("El nombre del Horse1 = " + Horse1.getName() + ",raza: " + Horse1.getRace());
        System.out.println("El nombre del Elephant1 = " + Elephant1.getName() + ",raza " + Elephant.getRace());
        //Horse
        Horse1.SetName("Rayo");
        Horse1.setRace("Pura Sangre Ingles");
        Horse1.setWeight("500 kg");
        Horse1.setAge("2 years");
        //Elephant
        Elephant1.setName("Marco");
        Elephant1.setRace("Guramis");
        Elephant1.setWeight("13 kg");
        Elephant1.setAge("4 years");

        //Probando la sobrecarga de un metodo
        System.out.println("\nMetodo toString() de Horse : " + Horse1.toString());
        System.out.println("\nMetodo toString() de Elephant : " + Elephant1.toString());
    }
}
