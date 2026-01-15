package ANTDRON2K25.esDataAccessComponent.esDAOs;

import ANTDRON2K25.esApp.esInfrastructureComponent.esAppException;
import ANTDRON2K25.esDataAccessComponent.esDTOs.esAntCiberDronDTO;
import ANTDRON2K25.esDataAccessComponent.esHelpers.DataHelperSQLiteDAO;

public class esAntCiberDronDAO extends DataHelperSQLiteDAO<esAntCiberDronDTO> {

    public esAntCiberDronDAO() throws esAppException {
        super(esAntCiberDronDTO.class, "esAntCiberDron", "esIdAntCiberDron");
    }

}
