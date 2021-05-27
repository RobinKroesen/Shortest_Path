package ShortestPath;

import java.util.*;

public class Reis{
    public int kortsteLengte;
    public ArrayList<Character> bezochtePunten;

    public void Reis(int kortsteLengte, ArrayList<Character> bezochtePunten){
        this.kortsteLengte = kortsteLengte;
        this.bezochtePunten = bezochtePunten;
    }

    public static void reis(ArrayList<Stap> stappen, Character startPunt, Character eindPunt){
        ArrayList<Character> bezochtePunten = new ArrayList<>();
        ArrayList<Character> eindPunten = new ArrayList<>();
        ArrayList<Integer> kortstePad = new ArrayList<Integer>();
        Map<Integer, ArrayList<Character>> resultaten = new HashMap<>();

        Character huidigPunt = startPunt;
        int huidigLengte = 0;
        int totaleLengte = 0;
        for (int i = 0; 1 < stappen.size(); i++){
            if (i == 10){break;}

            Stap beginStap = stappen.get(i);

            if (startPunt == beginStap.naam){
                bezochtePunten.add(beginStap.naam);

                while (huidigPunt != eindPunt){
                    for (int u = 0; 1 < stappen.size(); u++){
                        if (u == 10){break;}
                        Stap volgendeStap = stappen.get(u);

                        if ((volgendeStap.naam == beginStap.doel) & !bezochtePunten.contains(volgendeStap.doel)) {
                            huidigLengte += beginStap.lengte;
                            beginStap = volgendeStap;
                            huidigPunt = beginStap.naam;
                            bezochtePunten.add(huidigPunt);
                        }
                    }
                }
                totaleLengte = huidigLengte;
                huidigPunt = startPunt;
                kortstePad.add(totaleLengte);
                eindPunten = (ArrayList)bezochtePunten.clone();
                resultaten.put(totaleLengte, eindPunten);
                bezochtePunten.clear();
                huidigLengte = 0;

            }
        }
        int minAfstand = Collections.min(kortstePad);
        System.out.println("Het kortste pad is: " + minAfstand + "\nEn komt langs de punten: "+ resultaten.get(minAfstand));
        }

}

