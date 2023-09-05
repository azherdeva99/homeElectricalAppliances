package devices;


import appliances.ElectricalAppliance;

// Класс Телевизор, наследуется от Электроприбора
public class TV extends ElectricalAppliance {
    private boolean pluggedIn;

    public TV(String name, int power) {
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