package lambdy.dil04;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.time.*;
import java.time.format.*;

public class Lekce04 {
    public static void main(String[] args) {
        // Odkomentuj prave jedno volani podle pracovniho snimku.
        // Prvni spusteni je bez vypisu; zatim neni zapnuta zadna uloha.
        // ukazkaTisk();
        // reference();
        // trideni();
        // tovarny();
    }

    // Spolecna ukazka: podle pokynu v prezentaci.
    static void ukazkaTisk() {
        Consumer<String> printLambda = s -> System.out.println(s);
        printLambda.accept("Java");
        // TODO ukazka: postupuj podle pracovniho snimku.
    }

    // Uloha 4.1. Tři řádky: Java, 0, true.
    static void reference() {
        // TODO 4.1: Přepis na method reference. Zde pis sve reseni.
    }

    // Uloha 4.2. [a, pes, kocka]. Délka je klíč pro porovnání, nikoli hotový Comparator.
    static void trideni() {
        List<String> words = new ArrayList<>(List.of("kocka", "pes", "a"));
        // TODO 4.2: Třídění podle délky. Zde pis sve reseni.
    }

    // Uloha 4.3. Jana / [A] / []. Druhý seznam se nezmění.
    static void tovarny() {
        // TODO 4.3: Továrny na objekty. Zde pis sve reseni.
    }
}
