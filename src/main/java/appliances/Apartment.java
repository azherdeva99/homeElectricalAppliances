package appliances;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Класс Квартира, содержит список электроприборов
public class Apartment {
    private List<ElectricalAppliance> appliances;

    public Apartment() {
        this.appliances = new ArrayList<>();
    }

    public void addAppliance(ElectricalAppliance appliance) {
        appliances.add(appliance);
    }

    public int calculateTotalPower() {
        int totalPower = 0;
        for (ElectricalAppliance appliance : appliances) {
            totalPower += appliance.getPower();
        }
        return totalPower;
    }

    public void sortAppliancesByPower() {
        appliances.sort(Comparator.comparingInt(ElectricalAppliance::getPower));
    }

    public ElectricalAppliance findApplianceByPowerRange(int minPower, int maxPower) {
        for (ElectricalAppliance appliance : appliances) {
            int power = appliance.getPower();
            if (power >= minPower && power <= maxPower) {
                return appliance;
            }
        }
        return null;
    }
}