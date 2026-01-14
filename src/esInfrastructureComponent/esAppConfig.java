//  © 2K26 ❱──💀──❰ pat_mic ? code is life : life is code
package esInfrastructureComponent;

import java.net.URL;

public abstract class esAppConfig {
    //Paths Storage
    public static final String DATABASE = "jdbc:sqlite:esStorage\\esDataBase\\esAntCiberDron.sqlite";
    public static final String DATAFILE = "esStorage\\esDataFile\\EcheverriaSteven.csv";
    public static final String LOGFILE  = "esStorage\\esLogs\\esAppErrors.log";

    //Resources
    public static final URL URL_MAIN    = esAppConfig.class.getResource("src\\esInfrastructureComponent\\esAssets\\Img\\Logo.png");
    public static final URL URL_LOGO    = esAppConfig.class.getResource("src\\esInfrastructureComponent\\esAssets\\Img\\Logo.png");
    public static final URL URL_SPLASH  = esAppConfig.class.getResource("src\\esInfrastructureComponent\\esAssets\\Img\\Splash.png");

    //AppMSGs
    public static final String MSG_DEFAULT_ERROR    = "Ups! Error inesperado. Por favor, contacte al administrador del sistema.";
    public static final String MSG_DEFAULT_CLASS    = "undefined";
    public static final String MSG_DEFAULT_METHOD   = "undefined";

    private esAppConfig() {}
}
