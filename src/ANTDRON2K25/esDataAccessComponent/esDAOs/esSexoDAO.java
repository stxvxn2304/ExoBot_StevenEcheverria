package ANTDRON2K25.esDataAccessComponent.esDAOs;

import ANTDRON2K25.esApp.esInfrastructureComponent.esAppException;
import ANTDRON2K25.esDataAccessComponent.esDTOs.esSexoDTO;
import ANTDRON2K25.esDataAccessComponent.esHelpers.DataHelperSQLiteDAO;

public class esSexoDAO extends DataHelperSQLiteDAO<esSexoDTO>{
    public esSexoDAO() throws esAppException {
        super(esSexoDTO.class, "esSexo", "esIdSexo");
    }
}
