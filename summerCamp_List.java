import core.data.*;
import java.util.ArrayList;
import java.util.Scanner;


public class summerCamp_List {
    
    public void runSummerCamp(){
        DataSource ds = DataSource.connect("summerCamp.csv").load();

        ArrayList<summerCamp> allCamps = ds.fetchList("summerCamp","Sports Played", "Attendance Sum");
        //System.out.println(allCamps);
        
        int soccer_count=0;
        int soccer_sum=0;
        int total_sum=0;
        for(summerCamp sc:allCamps){
            total_sum+=sc.getAttendance();
            String s=sc.getSports();
            if((s.toLowerCase().indexOf("soccer")!=-1)||(s.toLowerCase().indexOf("all")!=-1)){
                soccer_count++;
                soccer_sum+=sc.getAttendance();
            }
        }
        
        System.out.println("number of soccer camp (including camps that involve all sports) "+soccer_count);
        System.out.println("ratio of soccer camp "+soccer_count+"/"+allCamps.size());
        System.out.println("number of total attendance in soccer camp (including camps that involve all sports) "+soccer_sum);
        System.out.println("ratio of soccer attendance "+soccer_sum+"/"+total_sum);
        System.out.println("Based on the facts listed above, soccer is obviously the most-loved sports for kids to play in the summer");
    }
    
}