// Classe Base (Superclasse)
class Vehicle {
    private String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    // Metodo da ridefinire
    public void start() {
        System.out.println(brand + " Vehicle is starting its engine.");
    }

    public void stop() {
        System.out.println(brand + " Vehicle is stopping.");
    }

    public String getBrand() {
        return brand;
    }
}

// Classe Derivata (Sottoclasse)
class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, int numberOfDoors) {
        // Chiama il costruttore della superclasse per inizializzare il brand
        super(brand); 
        this.numberOfDoors = numberOfDoors;
    }

    // Ridefinizione del metodo start() ereditato da Vehicle
    @Override // Annotazione che indica che stiamo ridefinendo un metodo
    public void start() {
        // Chiamata all'implementazione originale del metodo start() nella superclasse
        super.start(); 
        System.out.println("The " + getBrand() + " car is igniting the spark plugs.");
    }

    // Aggiunta di un nuovo metodo specifico per Car
    public void honk() {
        System.out.println(getBrand() + " car says: Beep! Beep!");
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public static void main(String[] args) {
        System.out.println("--- Esempio di Overriding di Metodi ---");

        // Creazione di un oggetto Vehicle
        Vehicle genericVehicle = new Vehicle("Generic Motors");
        System.out.println("\nChiamo start() sul veicolo generico:");
        genericVehicle.start(); // Chiama il metodo start() di Vehicle
        genericVehicle.stop();

        System.out.println("\n-------------------------------------");

        // Creazione di un oggetto Car
        Car myCar = new Car("Fiat", 4);
        System.out.println("\nChiamo start() sull'auto specifica:");
        myCar.start(); // Chiama il metodo start() ridefinito in Car
        myCar.honk();   // Chiama il nuovo metodo di Car
        myCar.stop();   // Chiama il metodo stop() ereditato (non ridefinito)
    }
}