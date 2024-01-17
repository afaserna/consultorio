import ui.UIMenu;

public class Main {
    public static void main(String[] args) {
       Doctor myDoctor = new Doctor();
       myDoctor.name = "Andres Arboleda";
       myDoctor.showName();
       myDoctor.showId();
       System.out.println(myDoctor.id);

       Doctor myDoctorAnn= new Doctor();
       myDoctor.showId();
       System.out.println(myDoctor.id);
       UIMenu.showMenu();



    }
}