package ShortestPath;

import java.util.ArrayList;

public class Reis {

    public static void reis(ArrayList<Stap> stappen, Character startPunt, Character eindPunt) {
        ArrayList<Character> bezochtePunten = new ArrayList<>();
        ArrayList<Stap> bezochteStappen = new ArrayList<>();
        Character huidigPunt = startPunt;
        int huidigPad = 0;
        int kortstePad = 0;
        for (int i = 0; 1 < stappen.size(); i++){
            if (i == 10){break;}

            Stap beginStap = stappen.get(i);
            //System.out.println(i);
            //System.out.println(beginStap.naam);

            if (startPunt == beginStap.naam){
                bezochtePunten.add(beginStap.naam);

                    //System.out.println(huidigPunt);
                while (huidigPunt != eindPunt){
                    for (int u = 0; 1 < stappen.size(); u++){
                        if (u == 10){break;}
                        Stap volgendeStap = stappen.get(u);

                        if (volgendeStap.naam == beginStap.doel) {
                            //System.out.println(beginStap.lengte);
                            huidigPad += beginStap.lengte;
                            //System.out.println(huidigPad);
                            beginStap = volgendeStap;
                            huidigPunt = beginStap.naam;
                            bezochtePunten.add(huidigPunt);

                        }
                    }
                }
                kortstePad = huidigPad;
                huidigPunt = 0;
                huidigPad = 0;
                System.out.println(kortstePad);

                System.out.println(bezochtePunten);
                bezochtePunten.clear();

            }
        }

        }
    }

