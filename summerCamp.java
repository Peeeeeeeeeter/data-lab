public class summerCamp {
    private String sports;
    private int attendance;
    
    public summerCamp(String sports, int attendance){
        this.sports=sports;
        this.attendance=attendance;
    }
    
    public String getSports(){
        return sports;
    }
    
    public int getAttendance(){
        return attendance;
    }
}