class Building {
    private String streetAddress;
    private double sizeInSquareFeet;

    public Building() {
        // Default constructor
    }

    public Building(String streetAddress, double sizeInSquareFeet) {
        this.streetAddress = streetAddress;
        this.sizeInSquareFeet = sizeInSquareFeet;
    }

    //Copy constructor
    public Building(Building object2)
    {
        streetAddress = object2.streetAddress;
        sizeInSquareFeet = object2.sizeInSquareFeet;
    }

    // Getters and setters

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public double getSizeInSquareFeet() {
        return sizeInSquareFeet;
    }

    public void setSizeInSquareFeet(double sizeInSquareFeet) {
        if (sizeInSquareFeet >= 0) {
            this.sizeInSquareFeet = sizeInSquareFeet;
        } else {
            System.out.println("Size of the building cannot be less than 0.");
        }
    }

    // toString method
    @Override
    public String toString() {
        return "Building Information:\n" +
                "Street Address: " + streetAddress +
                "\nSize: " + sizeInSquareFeet + " sq. feet";
    }
}