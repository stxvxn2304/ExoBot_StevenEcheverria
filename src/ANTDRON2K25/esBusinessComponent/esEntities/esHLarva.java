package ANTDRON2K25.esBusinessComponent.esEntities;

import java.util.List;

import ANTDRON2K25.esApp.esInfrastructureComponent.esAppException;
import ANTDRON2K25.esDataAccessComponent.esDTOs.esHormigaDTO;


public class esHLarva extends esHormiga {
    @Override
    public Boolean esSaltar() {
        System.out.println("La hormiga larva esta saltando normalmente...");
        return true;
    }

    @Override
    public Boolean esCortar() {
        System.out.println("La hormiga larva esta cortando normalmente...");
        return true;
    }

    @Override
    public Boolean esComer(esAlimento alimento) {
        if (alimento instanceof esNectarivoro) {
            return true;
        }else{
            this.setEsEstado(false); //Muere
            return false;
        }
    }
    public esHormigaDTO getLarva(int id) throws esAppException{
        data = factory.getBy(id);
        return data;
    }
    
    public List<esHormigaDTO> getLarvas() throws esAppException {
        return factory.getAll();
    }
    
    public esHormiga comer(String comida) {
        if (comida.equals("carne")) {
            return new esHObrera();
        }
        return this;
    }

    @Override
    public String toString() {
        return "HLarva {}";
    }
}
