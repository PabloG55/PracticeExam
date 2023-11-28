public class LandParcel {
    private int parcelId;
    private double parcelSize;  // in acres
    private String zoningType;
    private Building building;

    public LandParcel() {
        // Default constructor
    }

    public LandParcel(int parcelId, double parcelSize, String zoningType, Building building) {
        this.parcelId = parcelId;
        this.parcelSize = parcelSize;
        this.zoningType = zoningType;
        this.building = building;
    }

    // Getters and setters

    public int getParcelId() {
        return parcelId;
    }

    public void setParcelId(int parcelId) {
        this.parcelId = parcelId;
    }

    public double getParcelSize() {
        return parcelSize;
    }

    public void setParcelSize(double parcelSize) {
        if (parcelSize >= 0) {
            this.parcelSize = parcelSize;
        } else {
            System.out.println("Size of the parcel cannot be less than 0.");
        }
    }

    public String getZoningType() {
        return zoningType;
    }

    public void setZoningType(String zoningType) {
        this.zoningType = zoningType;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }

    // Method to calculate yearly property tax
    public double calculatePropertyTax() {
        double baseTax;
        double additionalCost;

        if ("Commercial".equalsIgnoreCase(zoningType) && parcelSize < 4000) {
            baseTax = 2000;
            additionalCost = 1.00;
        } else if ("Commercial".equalsIgnoreCase(zoningType) && parcelSize >= 4000) {
            baseTax = 2000;
            additionalCost = 1.50;
        } else if ("Residential".equalsIgnoreCase(zoningType) && parcelSize < 2000) {
            baseTax = 500;
            additionalCost = 0.50;
        } else {
            baseTax = 500;
            additionalCost = 0.75;
        }

        return (parcelSize * baseTax) + (building.getSizeInSquareFeet() * additionalCost);
    }

    // toString method
    @Override
    public String toString() {
        return "Parcel ID: " + parcelId +
                "\nParcel Size: " + parcelSize + " acres" +
                "\nZoning Type: " + zoningType +
                "\n" + building.toString() +
                "\nYearly Property Tax: $" + calculatePropertyTax();
    }
}