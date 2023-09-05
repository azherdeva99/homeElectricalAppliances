import appliances.Apartment;
import appliances.ElectricalAppliance;
import devices.Refrigerator;
import devices.TV;


public class Main {
    public static void main(String[] args) {
        // Создание экземпляров электроприборов
        ElectricalAppliance fridge = new Refrigerator("Холодильник", 200);
        ElectricalAppliance tv = new TV("Телевизор", 100);

        // Подключение электроприборов
        fridge.plugIn();
        tv.plugIn();

        // Создание квартиры и добавление электроприборов
        Apartment apartment = new Apartment();
        apartment.addAppliance(fridge);
        apartment.addAppliance(tv);

        // Подсчет потребляемой мощности
        int totalPower = apartment.calculateTotalPower();
        System.out.println("Общее энергопотребление: " + totalPower + "W");

        // Сортировка приборов по мощности
        apartment.sortAppliancesByPower();

        // Поиск прибора в заданном диапазоне мощности
        int minPower = 100;
        int maxPower = 200;
        ElectricalAppliance foundAppliance = apartment.findApplianceByPowerRange(minPower, maxPower);
        if (foundAppliance != null) {
            System.out.println("Найдено устройство: " + foundAppliance.getName());
        } else {
            System.out.println("Не найдено прибора в указанном диапазоне мощности.");
        }
    }
}
