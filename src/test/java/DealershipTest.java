import com.codebase.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DealershipTest {
    Engine engine1;
    Tyre tyre1;
    Vehicles vehicle1;
    Customer customer1;
    Dealership dealership1;

    @Before
    public void before() {
        engine1 = new Engine("Combustion");
        tyre1 = new Tyre("Standard");
        vehicle1 = new Vehicles(0d, 8500.00, "Purple", "Hyundai", "Coupe", engine1, tyre1);
        customer1 = new Customer(10000d, new ArrayList<>());
        dealership1 = new Dealership(50000, new ArrayList<>());

    }

    @Test
    public void canSellVehicle() {
        dealership1.addToStock(vehicle1);
        dealership1.sellVehicleToCustomer(vehicle1, customer1);
        assertEquals(1, customer1.getCustomerCollection().size());
        assertEquals(1500, customer1.getWallet(), 0.0);
        assertEquals(58500, dealership1.getTill(), 0.0);
    }

    @Test
    public void canRepairVehicle() {
        vehicle1.addDamage(750);
        assertEquals(7750, vehicle1.getDamagePrice(), 0.0);
        dealership1.repairVehicle(vehicle1);
        assertEquals(0, vehicle1.getDamage(), 0.0);
    }
}

