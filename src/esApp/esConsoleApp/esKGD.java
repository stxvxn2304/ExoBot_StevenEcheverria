package esApp.esConsoleApp;

public class esKGD {
    private String esCedula;
    private String esNombre;
    
    public esKGD(String esCedula, String esNombre) {
        this.esCedula = esCedula;
        this.esNombre = esNombre;
    }
    public String getesCedula() {
        return esCedula;
    }
    public void setesCedula(String esCedula) {
        this.esCedula = esCedula;
    }
    public String getesNombre() {
        return esNombre;
    }
    public void setesNombre(String esNombre) {
        this.esNombre = esNombre;
    }
    
    public void esShow(){
        System.out.println("[+] Alumno:");
        System.out.println(getesCedula() + " | " + getesNombre());
    }

    @Override
    public String toString(){
        return getClass().getName()
        + "\n esCedula    : "+ getesCedula()
        + "\n esNombre    : "+ getesNombre();
    }
}
