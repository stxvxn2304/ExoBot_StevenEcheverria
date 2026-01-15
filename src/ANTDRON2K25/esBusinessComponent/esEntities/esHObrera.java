package ANTDRON2K25.esBusinessComponent.esEntities;

public class esHObrera  extends esHormiga {

    @Override
    public Boolean esSaltar() {
        System.out.println("La hormiga obrera esta saltando normalmente...");
        return true;
    }

    @Override
    public Boolean esCortar() {
        System.out.println("La hormiga obrera esta cortando normalmente...");
        return true;
    }

    @Override
    public Boolean esComer(esAlimento alimento) {
        if (alimento instanceof esHerbivoro) {
            return true;
        } else {
            this.setEsEstado(false); //Muere
            return false;
        }
    }

    public Boolean esSuperCortadora(Boolean esGenoma){
        if (esGenoma){
            System.out.println("La hormiga obrera esta usando la habilidad super cortadora...");
            return true;
        }else{
            System.out.println("La hormiga obrera no tiene la habilidad super cortadora...");
            return false;
        }
    }
    @Override
    public String toString() {
        return "HSoldado {}";
    }
}
