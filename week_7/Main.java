public class Main {
    public static void main(String[] args) {
        
        Appliance app1 = new WashingMachine("LG");
        Appliance app2 = new Refrigerator("Panasonic");

        app1.displayBrand();
        app1.turnOn();
        app1.operate();
        app1.turnOff();

        System.out.println();

        app2.displayBrand();
        app2.turnOn();
        app2.operate();
        app2.turnOff();
    }
}