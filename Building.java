public class Building extends LandParcel 
{
    private String streetAddress;
    private int buildingSize;
    
    public Building(String streetAddress, int buildingSize)
    {
        this.streetAddress = streetAddress;
        this.buildingSize = buildingSize;
    }
}
