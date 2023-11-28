import java.util.ArrayList;
import java.util.Scanner;

public class DemoPabloGarces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<LandParcel> landParcels = new ArrayList<>();

        do {
            LandParcel landParcel = new LandParcel();
            Building building = new Building();

            System.out.print("Enter Parcel ID: ");
            landParcel.setParcelId(scanner.nextInt());

            System.out.print("Enter Parcel Size (acres): ");
            landParcel.setParcelSize(scanner.nextDouble());

            System.out.print("Enter Zoning Type (Residential/Commercial): ");
            landParcel.setZoningType(scanner.next());

            System.out.print("Enter Street Address of Building: ");
            building.setStreetAddress(scanner.next());

            System.out.print("Enter Size of Building (sq. feet): ");
            building.setSizeInSquareFeet(scanner.nextDouble());

            landParcel.setBuilding(building);
            landParcels.add(landParcel);

            System.out.print("Do you want to enter another land parcel? (yes/no): ");
        } while ("yes".equalsIgnoreCase(scanner.next()));

        // Output information for each land parcel
        for (LandParcel landParcel : landParcels) {
            System.out.println(landParcel.toString());
            System.out.println("----------------------------");
        }

        // Calculate and output average property tax
        double totalPropertyTax = 0;
        for (LandParcel landParcel : landParcels) {
            totalPropertyTax += landParcel.calculatePropertyTax();
        }
        double averagePropertyTax = totalPropertyTax / landParcels.size();

        System.out.println("Average Property Tax: $" + averagePropertyTax);

        scanner.close();
    }
}