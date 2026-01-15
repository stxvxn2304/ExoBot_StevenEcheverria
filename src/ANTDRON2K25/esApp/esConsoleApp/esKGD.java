package ANTDRON2K25.esApp.esConsoleApp;

public class esKGD {
    private String esNombre;
    private String esCedula;
    private String esUsuario;
    private String esClave;
    
    public esKGD(String esNombre, String esCedula, String esUsuario, String esClave) {
        this.esNombre = esNombre;
        this.esCedula = esCedula;
        this.esUsuario = esUsuario;
        this.esClave = esClave;
    }

    public String getEsNombre() {
        return esNombre;
    }
    public void setEsNombre(String esNombre) {
        this.esNombre = esNombre;
    }
    public String getEsCedula() {
        return esCedula;
    }
    public void setEsCedula(String esCedula) {
        this.esCedula = esCedula;
    }
    public String getEsUsuario() {
        return esUsuario;
    }
    public void setEsUsuario(String esUsuario) {
        this.esUsuario = esUsuario;
    }
    public String getEsClave() {
        return esClave;
    }
    public void setEsClave(String esClave) {
        this.esClave = esClave;
    }

    @Override
    public String toString() {
        return getClass().getName()
        + " \n Nombre   : " + getEsNombre   ()
        + " \n Cedula   : " + getEsCedula   ()
        + " \n Usuario  : " + getEsUsuario  ()
        + " \n Clave    : " + getEsClave    ();
    }    
    

}
