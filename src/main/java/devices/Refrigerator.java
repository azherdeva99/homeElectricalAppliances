package devices;


import appliances.ElectricalAppliance;

// Класс Холодильник, наследуется от Электроприбора
public class Refrigerator extends ElectricalAppliance {
    private boolean pluggedIn;

    public Refrigerator(String name, int power) {
        super(name, power);
        this.pluggedIn = false;
    }

    @Override
    public void plugIn() {
        pluggedIn = true;
        System.out.println(getName() + " подключен к сети.");
    }

    @Override
    public void unplug() {
        pluggedIn = false;
        System.out.println(getName() + " отключен от сети.");
    }
}