import java.io.FileNotFoundException;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.io.File;

public class Main {
    public static void main(String[] args){

        /*
        Patient first=new Patient("Susan","Kelley", "Spinal injury",5);
        Patient second=new Patient("Debra","King", "Cardiac arrest",5);
        Patient third=new Patient("Denise","Peters", "Spinal injury",5);
        Patient fourth=new Patient("Peter","Perez", "Third-degree burn",4);
        Patient fifth=new Patient("Brandon","Wood", "Cut finger",2);
        Patient sixth=new Patient("Sharon","Ford", "Upset stomach",1);
*/

        /*
        System.out.println(first.getFirstName());
        System.out.println(second.getFirstName());
        System.out.println(first.getLastName());
        System.out.println(second.getLastName());
        System.out.println(first.getIllness());
        System.out.println(second.getIllness());
        System.out.println(first.getSeverityLevel());
        System.out.println(second.getSeverityLevel());
        */

        PriorityQueue<Patient> doctor=new PriorityQueue<Patient>();
/*
        doctor.add(sixth);
        for (Patient a:doctor) {
            System.out.println(a.getFirstName()+" "+a.getLastName()+": "+a.getIllness());
        }
        System.out.println("\n");
        doctor.add(fifth);
        for (Patient a:doctor) {
            System.out.println(a.getFirstName()+" "+a.getLastName()+": "+a.getIllness());
        }
        System.out.println("\n");
        doctor.add(fourth);
        for (Patient a:doctor) {
            System.out.println(a.getFirstName()+" "+a.getLastName()+": "+a.getIllness());
        }
        System.out.println("\n");
        doctor.add(third);
        for (Patient a:doctor) {
            System.out.println(a.getFirstName()+" "+a.getLastName()+": "+a.getIllness());
        }
        System.out.println("\n");
        doctor.add(second);
        for (Patient a:doctor) {
            System.out.println(a.getFirstName()+" "+a.getLastName()+": "+a.getIllness());
        }
        System.out.println("\n");
        doctor.add(first);
        for (Patient a:doctor) {
            System.out.println(a.toString());
        }

        System.out.println("\n");
        while(!doctor.isEmpty()){
            System.out.println(doctor.poll().toString());
        }
*/

        File inputFile=new File("patients");
        Scanner in=null;

        try{
            in=new Scanner(inputFile);
        }catch (FileNotFoundException e){
            System.out.println("Cannot open patients");
            System.exit(0);
        }


        while (in.hasNext()){
            String firstName;
            String lastName;
            String illness;
            int severityLevel;

            firstName=in.nextLine();
            lastName=in.nextLine();
            illness=in.nextLine();
            severityLevel=Integer.parseInt(in.nextLine());

            Patient a=new Patient(firstName,lastName,illness,severityLevel);
            doctor.add(a);
        }

        while(!doctor.isEmpty()){
            System.out.println(doctor.poll().toString());
        }


    }
}
