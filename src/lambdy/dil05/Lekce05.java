package lambdy.dil05;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.time.*;
import java.time.format.*;

public class Lekce05 {
    public static void main(String[] args) {
        // Odkomentuj prave jedno volani podle pracovniho snimku.
        // Prvni spusteni je bez vypisu; zatim neni zapnuta zadna uloha.
        // ukazkaLimit();
        // ukazkaSeznam();
        // zachyceni();
        // soucet();
        // propojeni();
    }

    // Spolecna ukazka: podle pokynu v prezentaci.
    static void ukazkaLimit() {
        int limit = 10;
        // TODO ukazka: postupuj podle pracovniho snimku.
    }

    // Spolecna ukazka: podle pokynu v prezentaci.
    static void ukazkaSeznam() {
        List<String> names = new ArrayList<>();
        names.add("Eva");
        // TODO ukazka: postupuj podle pracovniho snimku.
    }

    // Uloha 5.1. A a C projdou, B ne. Opravená metoda vypíše 2.
    static void zachyceni() {
        // TODO 5.1: Posuď a oprav zachycení. Zde pis sve reseni.
    }

    // Uloha 5.2. Pro [1, 2, 3] dva řádky 6. Pro [] dva řádky 0.
    static void soucet() {
        List<Integer> numbers = List.of(1, 2, 3);
        // TODO 5.2: Dvě verze součtu. Zde pis sve reseni.
    }

    // Uloha 5.3. Adam a Alena. Prázdný vstup dá prázdný seznam bez výpisu.
    static void propojeni() {
        List<String> names = List.of("Eva", "", "Adam", "Alena");
        // TODO 5.3: Propojení naučených částí. Zde pis sve reseni.
    }
}
