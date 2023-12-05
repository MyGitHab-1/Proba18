public class Car {
    int dvs;
    String name;



    public Car(){}


    public Car(int dvs, String name) {
        this.dvs = dvs;
        this.name = name;
    }

    public void info(){
        System.out.println("машина " + name + ", имеет " + dvs + " лс") ;
    }

    public void start() {
        System.out.println("двс запущен");
    }
    public void stop(){
        System.out.println("двс выключен");
    }
}
