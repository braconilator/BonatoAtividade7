package br.usjt.ads20.appfilmes;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.TreeSet;

import br.usjt.ads20.appfilmes.model.Hero;

public class SectionIndexBuilder {
    public static Object[] buildSectionHeaders(Hero[] heroes) {
        ArrayList<String> results = new ArrayList<>();
        TreeSet<String> used = new TreeSet<>();

        if (heroes != null) {
            for (Hero hero : heroes) {
                String letter = hero.getTitulo().substring(0, 1);
                if (!used.contains(letter)) {
                    results.add(letter);
                }
                used.add(letter);
            }
        }
        return results.toArray(new Object[0]);
    }

    public static Hashtable<Integer, Integer> buildPositionForSectionMap(Hero[] herois) {
        Hashtable<Integer, Integer> results = new Hashtable<>();
        TreeSet<String> used = new TreeSet<>();
        int section = -1;

        if (herois != null) {
            for (int i = 0; i < herois.length; i++) {
                String letter = herois[i].getTitulo().substring(0, 1);
                if (!used.contains(letter)) {
                    section++;
                    used.add(letter);
                    results.put(section, i);
                }
            }
        }
        return results;
    }

    public static Hashtable<Integer, Integer> buildSectionForPosition(Hero[] heroes) {
        Hashtable<Integer, Integer> results = new Hashtable<>();

        TreeSet<String> used = new TreeSet<>();
        int section = -1;

        if (heroes != null) {
            for (int i = 0; i < heroes.length; i++) {
                String letter = heroes[i].getTitulo().substring(0, 1);
                if (!used.contains(letter)) {
                    section++;
                    used.add(letter);
                }
                results.put(i, section);
            }
        }
        return results;
    }
}
