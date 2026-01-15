package ANTDRON2K25.esBusinessComponent.esEntities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import ANTDRON2K25.esApp.esInfrastructureComponent.esAppConfig;
import ANTDRON2K25.esApp.esInfrastructureComponent.esTools.esCMDColor;
import ANTDRON2K25.esApp.esInfrastructureComponent.esTools.esCMDProgress;
import ANTDRON2K25.esBusinessComponent.esInterfaces.esIEntomologo;

public abstract class esEntomologo implements esIEntomologo {
    public List<esHormiga> esEtlAntNest() {
        List<esHormiga> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(esAppConfig.ANTNEST))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                // Separar elementos por coma
                String[] elementos = linea.split(",");

                for (String elem : elementos) {
                    elem = elem.trim(); // quitar espacios

                    if (elem.equals("HLarva")) {
                        System.out.print(esCMDColor.BLUE);
                        try {
                            esCMDProgress.showLoad();
                        } catch (InterruptedException _) {
                        }
                        System.out.println(elem + esCMDColor.RESET);
                        lista.add(new esHLarva());

                    } else if (elem.equals("HObrera")) {
                        System.out.print(esCMDColor.BLUE);
                        try {
                            esCMDProgress.showLoad();
                        } catch (InterruptedException _) {
                        }
                        System.out.println(elem + esCMDColor.RESET);
                        lista.add(new esHObrera());

                    } else {
                        System.out.print(esCMDColor.RED);
                        try {
                            esCMDProgress.showLoad();
                        } catch (InterruptedException _) {
                        }
                        System.out.println(elem + esCMDColor.RESET);
                    }
                }
            }

        } catch (IOException e) {
            System.out.println(esCMDColor.RED + "Error al leer el archivo" + esCMDColor.RESET);
        }

        return lista;
    }

    public List<esAlimento> esEtlAntFood() {
        List<esAlimento> lista = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(esAppConfig.ANTFOOD))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                // Separar por guion "-" y quitar espacios
                String[] elementos = linea.split("-");

                for (String elem : elementos) {
                    elem = elem.trim(); // quitar espacios al inicio y final
                    if (elem.equals("Nectarívoros")) {
                        System.out.print(esCMDColor.BLUE);
                        try {
                            esCMDProgress.showLoad();
                        } catch (InterruptedException _) {
                        }
                        System.out.println(elem + esCMDColor.RESET);
                        lista.add(new esNectarivoro());

                    } else if (elem.equals("Herbívoros")) {
                        System.out.print(esCMDColor.BLUE);
                        try {
                            esCMDProgress.showLoad();
                        } catch (InterruptedException _) {
                        }
                        System.out.println(elem + esCMDColor.RESET);
                        lista.add(new esHerbivoro());

                    } else {
                        System.out.print(esCMDColor.RED);
                        try {
                            esCMDProgress.showLoad();
                        } catch (InterruptedException _) {
                        }
                        System.out.println(elem + esCMDColor.RESET);
                    }
                }
            }

        } catch (IOException e) {
            System.out.println(esCMDColor.RED + "Error al leer el archivo" + esCMDColor.RESET);
        }

        return lista;
    }

    public esHormiga esAlimentarAnt(esHormiga h, esAlimento a){
        if(h.esComer(a)) return h;
        else return null;
    }

}
