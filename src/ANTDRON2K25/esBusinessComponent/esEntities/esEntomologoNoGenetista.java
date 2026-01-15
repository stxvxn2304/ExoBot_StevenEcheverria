package ANTDRON2K25.esBusinessComponent.esEntities;

public class esEntomologoNoGenetista extends esEntomologo {
    public esAlimento esPreparar(esAlimento alimento) {
        System.out.println((alimento instanceof esNectarivoro)? "[ Preparado ]-<Nectarívoro>":"[ Preparado ]-<Herbivoro>");       
        return alimento;
    }
}
