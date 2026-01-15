package ANTDRON2K25.esBusinessComponent.esInterfaces;

import ANTDRON2K25.esBusinessComponent.esEntities.esAlimento;

public interface esIHormiga {
    public Boolean esSaltar();
    public Boolean esCortar();
    //Refactorizacion
    public Boolean esComer(esAlimento alimento);
}
