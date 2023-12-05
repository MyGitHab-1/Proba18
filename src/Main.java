public class Main {
    public static void main(String[] args) {

        Car granta = new Car();
        Car dargo = new Car();
        Car vesta = new Car(130,"Lada Vesta");


        granta.dvs = 150;
        granta.name = "Лада Гранта";

        granta.info();

        dargo.name = "Haval Dargo";
        dargo.dvs = 200;

        dargo.info();
        vesta.info();

    }
}