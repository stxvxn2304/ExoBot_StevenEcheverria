package ANTDRON2K25.esBusinessComponent.esEntities;

public class esGenoma {
    private String esTipoGenoma;
    
    public String getEsTipoGenoma() {
        return esTipoGenoma;
    }

    public void setEsTipoGenoma(String esTipoGenoma) {
        this.esTipoGenoma = esTipoGenoma;
    }

    @Override
    public String toString() {
        return getClass().getName()
                + "\n Tipo Genoma     : " + getEsTipoGenoma()
                + "\n --------------------------- ";
    }
}
