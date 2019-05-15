public class Patient implements Comparable<Patient>{
    private String firstName;
    private String lastName;
    private String illness;
    private int severityLevel;

    public Patient(String firstName, String lastName, String illness, int severityLevel){
        setFirstName(firstName);
        setLastName(lastName);
        setIllness(illness);
        setSeverityLevel(severityLevel);
    }

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public void setLastName(String lastName){
        this.lastName=lastName;
    }

    public void setIllness(String illness){
        this.illness=illness;
    }

    public void setSeverityLevel(int severityLevel){
        this.severityLevel=severityLevel;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getIllness(){
        return illness;
    }

    public int getSeverityLevel(){
        return severityLevel;
    }

    public String toString(){
        return (this.getFirstName()+" "+this.getLastName()+": "+this.getIllness()+" "+this.getSeverityLevel());
    }

    public int compareTo(Patient otherPatient){
        if(this.getSeverityLevel()>otherPatient.getSeverityLevel()){
            return -1;
        }
        else if(this.getSeverityLevel()==otherPatient.getSeverityLevel()){
            return 0;
        }
        else{
            return 1;
        }
    }

}
