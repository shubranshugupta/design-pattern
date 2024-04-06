package shipment;

public class Shipping {
    public void ship(String address, String contactNumber) {
        StringBuilder sb = new StringBuilder();
        sb.append("Shipment made to address: ").append(address).append(" and contact number: ").append(contactNumber);
        System.out.println(sb.toString());
    }
}
