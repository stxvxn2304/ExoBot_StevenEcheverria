package ANTDRON2K25.esBusinessComponent.esInterfaces;

import java.util.List;

import ANTDRON2K25.esBusinessComponent.esEntities.esAlimento;
import ANTDRON2K25.esBusinessComponent.esEntities.esHormiga;

public interface esIEntomologo {
    public List<esHormiga> esEtlAntNest();
    public List<esAlimento> esEtlAntFood();
    public esHormiga esAlimentarAnt(esHormiga h, esAlimento a); 
    //Refactorizacion
    public esAlimento esPreparar(esAlimento alimento);
}
