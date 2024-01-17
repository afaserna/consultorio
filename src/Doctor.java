public class Doctor {
    static int id=0; //siempre sera autoincrementado
    String name;
    String speciality;
    Doctor(){
        System.out.println("construyendo el objeto doctor");
        id++;
    }
    Doctor(String name, String speciality){
        System.out.println("el nombre del doctor asigando es: "+ name);
        this.name = name;
        this.speciality = speciality;
    }

    //comportamientos

    public void showName(){
        System.out.println(name);
    }
    public void showId (){
        System.out.println("Id doctor es "+ id);
    }

}
