import java.time.LocalDate;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;


public class Vaccines {
    protected String vaccinename;
    private String location;
    String first_appointment_date;
    String second_appointment_date;
    String third_appointment_date;
    String message;

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    public Vaccines(String vaccinetype) {
        vaccinename = vaccinetype;
        //different locations for different vaccine types
        if (Objects.equals(vaccinename, "Moderna")) {
            location = "Epping";
        }
        else if (Objects.equals(vaccinename, "Pfizer")){
            location = "Southhall";
        }
    }
    public String getname() {
        return vaccinename;
    }
    public String getLocation(){
        return location;
    }
    public String getDates(){
        Calendar cal = Calendar.getInstance();
        if(Objects.equals(vaccinename, "Moderna")){
            cal.setTime(new Date());
            cal.add(Calendar.DATE, 4);
            first_appointment_date = sdf.format(cal.getTime());
            cal.add(Calendar.DATE, 8);
            second_appointment_date = sdf.format(cal.getTime());
            cal.add(Calendar.DATE, 12);
            third_appointment_date = sdf.format(cal.getTime());
            message = "first appointment date: " + first_appointment_date +" by nurse" +
                    "\nsecond appointment date: "+ second_appointment_date + " by doctor" +
                    "\nthird appointment date: " + third_appointment_date + " by doctor";
        }
        else if(Objects.equals(vaccinename, "Pfizer")){
            LocalDate currentDate=LocalDate.now();
            LocalDate first_appointment_pfizer=currentDate.plusDays(6);
            LocalDate second_appointment_pfizer=currentDate.plusDays(12);
            message = "first appointment date: " + first_appointment_pfizer +" by doctor" +
                    "\nsecond appointment date: "+ second_appointment_pfizer + " by nurse";
        }
        return message;

    }

}
