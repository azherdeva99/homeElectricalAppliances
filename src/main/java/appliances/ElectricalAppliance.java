package appliances;

// Базовый класс Электроприбор
public abstract class ElectricalAppliance {
    private String name;
    private int power;

    public ElectricalAppliance(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public abstract void plugIn();

    public abstract void unplug();
}