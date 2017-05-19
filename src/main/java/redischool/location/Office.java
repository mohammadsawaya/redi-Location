package redischool.location;

/**
 * Created by redi on 5/19/17.
 */
public class Office implements Location {
    private  String ort;
    private  String street;
    private int hausNumber;
    private int floorNumber;
    private int officeNumber;
    private int x;
    private int y;

    public Office(String ort,String street,int hausNumber,int floorNumber,int officeNumber,int x,int y){
        this.ort=ort;
        this.street=street;
        this.hausNumber=hausNumber;
        this.floorNumber=floorNumber;
        this.officeNumber=officeNumber;
        this.x=x;
        this.y=y;
    }
    @Override
    public void addresse() {
        System.out.println("The Office is in :"+ort+"\n"+street+"."+hausNumber+"\n"+"In the "+floorNumber+"  Office is :"+officeNumber+".\n"+"Frau Schmidt.");
    }

    @Override
    public double xy() {
        // method to return the location for GPS .
        return x*y;
    }
}
