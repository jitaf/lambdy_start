# Startovací projekt pro žáky: lambda výrazy v Javě

JDK 25, obyčejný projekt Java. Každý díl má vlastní balíček a připravené importy.
Třídy `Lekce01` až `Lekce05` už mají `main` i všechny pracovní metody.

## Jak začít

1. V IntelliJ otevři složku projektu nebo vlož její `src` do svého Java projektu.
2. Nastav projektové JDK 25 a složku `src` jako kořen zdrojového kódu.
3. Otevři třídu pro dnešní díl, například `src/lambdy/dil01/Lekce01.java`.
4. V `main` odkomentuj právě jedno volání podle pracovního snímku. Ostatní nech zakomentovaná.
5. Piš **do těla uvedené metody pod TODO**. Hlavičku metody, třídu ani main nevytvářej znovu.
6. Spusť `main`, porovnej výstup s kritériem Hotovo a potom pokračuj dalším úkolem.

Na začátku jsou všechna volání zakomentovaná. Program se přeloží a skončí
bez výpisu. Prázdná TODO metoda také není hotovým řešením.

## Jak poznáš, co máš dělat

- **Čteme a vysvětlujeme:** nic do projektu nepřidávej; odhadni výsledek nebo odpověz.
- **Programujeme společně:** snímek uvede konkrétní soubor, metodu a místo doplnění.
- **Programuj samostatně:** splň očíslovanou úlohu a její kritérium Hotovo.
- **Porovnej vlastní řešení:** oprav jen odpovídající metodu, ostatní řešení nemaž.

Pokračování ve stejné metodě může používat její dřívější proměnné.
Jiná metoda má své vlastní proměnné a nic z předchozí metody automaticky
nepřebírá. Definice tříd a rozhraní v samostatných souborech zůstávají společné.

## Připravené typy a nové soubory

- `dil01`: Printer.java a Calculator.java už jsou přiložené.
  Printer má `void print(String text)`. Lambda v úloze 1.1 dodá tělo této metody.
- V úloze 1.2 sám vytvoříš Concatenator.java a v 1.5 MessageFormatter.java, oba v `dil01`.
- `dil03`: Calculator.java je připravené pro výklad. V úloze 3.5 vytvoříš Greeting.java.
- `dil04` a `dil05`: Student.java je přiložené v každém balíčku zvlášť.
  Obsahuje konstruktor se jménem a getter getName().
- Při vytvoření souboru použij stejnou deklaraci `package` jako ostatní soubory daného dílu.

## Mapa práce

### Díl 1: Lekce01.java

Společné ukázky: `ukazkaRunnable()`.

**Úloha 1.1: Runnable a Printer → `runnablePrinter()`**

Výchozí stav: Printer.java je připravený: void print(String text). Runnable poskytuje Java.

1. V těle metody vytvoř Runnable pro výpis Welcome.
2. Vytvoř Printer pro výpis předaného textu.
3. Zavolej run a dvakrát print, pro Java a prázdný text.

Hotovo: Tři řádky: Welcome, Java a prázdný řádek.

Ponechání a návaznost: Ponech Printer.java i Calculator.java. Následující úloha má vlastní metodu a vlastní proměnné.

**Úloha 1.2: Vlastní Concatenator → `spojeni()`**

Výchozí stav: Metoda spojeni je prázdná. V balíčku dil01 zatím není Concatenator.

1. V balíčku dil01 vytvoř soubor Concatenator.java.
2. Deklaruj String concat(String a, String b).
3. Ve spojeni vytvoř lambdu a ověř A + B i prázdný první vstup.

Hotovo: Výpis AB a B. Prázdný řetězec nezpůsobí chybu.

Ponechání a návaznost: Nové rozhraní ponech v projektu. Printer ani původní metodu nemaž.

**Úloha 1.3: Tři operace → `kalkulacka()`**

Výchozí stav: Calculator.java je připravený: int compute(int a, int b). Lokální proměnné zatím nejsou vytvořené.

1. Vytvoř tři lambdy typu Calculator: součet, součin a rozdíl.
2. Každou zavolej pro (10, 4), potom pro (-2, 0).

Hotovo: Pro (10, 4): 14, 40, 6. Pro (-2, 0): -2, 0, -2.

Ponechání a návaznost: Calculator.java zůstává společnou definicí; proměnné patří jen této metodě.

**Úloha 1.4: Porovnání délek → `porovnaniDelek()`**

Výchozí stav: Comparator je z java.util; import je připravený. Tato metoda nepřebírá cmp z ukázky.

1. Vytvoř nový Comparator<String> a porovnávej délky přes Integer.compare.
2. Zavolej compare pro pes/kocka, prázdný text/a a pes/les.

Hotovo: Znaménka výsledků jsou záporné, záporné, nula.

Ponechání a návaznost: Vlastní rozhraní se nyní nemění. Nový komparátor patří jen této metodě.

**Úloha 1.5: MessageFormatter → `formatovani()`**

Výchozí stav: Metoda formatovani je připravená, rozhraní MessageFormatter vytvoříš nyní.

1. Vytvoř MessageFormatter.java s metodou String format(String name).
2. Ve formatovani vytvoř tři lambdy: Hello, WELCOME a User.
3. Všechny zavolej pro Tom i prázdné jméno. Vstupy jsou bez null.

Hotovo: Pro Tom: Hello, Tom / WELCOME, TOM / User: Tom. Pro prázdné jméno zůstane jen prefix.

Ponechání a návaznost: Ulož celý balíček dil01. Další díl má vlastní připravená data a třídu.

### Díl 2: Lekce02.java

Společné ukázky: `ukazkaSoucet()`, `ukazkaSlova()`, `ukazkaDuplicity()`.

**Úloha 2.1: Délky vybraných slov → `delkySlov()`**

Výchozí stav: V metodě už je List<String> input. Příklady se slovy words jsou v jiné metodě.

1. Řádek s input ponech. Pod TODO přidej stream nad input.
2. Vyber slova na A, odstraň duplicitní slova a převeď je na délky.
3. Výsledek ulož do lengths a vypiš. Potom ověř prázdný vstup.

Hotovo: Připravený vstup dá [4, 6], prázdný vstup [].

Ponechání a návaznost: Ponech i společné ukázky. Žádná z jejich lokálních proměnných se do této metody nepřenáší.

### Díl 3: Lekce03.java

Společné ukázky: `ukazkaConsumer()`, `ukazkaPredikaty()`, `ukazkaSupplier()`.

**Úloha 3.1: Consumer → `consumer()`**

Výchozí stav: Import Consumer je připravený. Společná ukázka má vlastní metodu, proto vytvoř nové print a length.

1. Vytvoř Consumer pro výpis textu a druhý pro výpis délky.
2. Spoj je pomocí andThen.
3. Výsledek zavolej pro Java a prázdný řetězec.

Hotovo: Čtyři řádky: Java, 4, prázdný řádek, 0.

Ponechání a návaznost: Obě vytvořené akce zůstávají v consumer. Interval začne v samostatné metodě.

**Úloha 3.2: Interval (10, 100] → `interval()`**

Výchozí stav: V metodě je připravené pole values = {10, 11, 100, 101}. Predikáty vytvoř nové.

1. Vytvoř above10 a atMost100, spoj je přes and.
2. Z negace celého intervalu vytvoř outside.
3. Pro každý prvek values vypiš výsledek obou predikátů.

Hotovo: inRange: false, true, true, false. outside má vždy opačný výsledek.

Ponechání a návaznost: Predikáty positive a even ze společné ukázky zůstávají v jiné metodě.

**Úloha 3.3: Skládání Function → `transformace()`**

Výchozí stav: Metoda je prázdná. Trim, upper ani prefix z výkladové ukázky v ní neexistují.

1. Vytvoř vlastní funkce strip, upper a prefix.
2. Slož je, aby se nejprve odstranily mezery, pak změnila velikost písmen a nakonec přidal prefix.
3. Ověř text s mezerami, samotné mezery a Function.identity.

Hotovo: Vysledek: JAVA / Vysledek: s koncovou mezerou / Java.

Ponechání a návaznost: Nezasahuj do předchozí metody interval; Function má vlastní lokální proměnné.

**Úloha 3.4: Známka a čas → `dodavatele()`**

Výchozí stav: Importy pro Supplier, IntFunction, LocalTime i DateTimeFormatter jsou připravené. Metoda je prázdná.

1. Napiš mapování známek 1 až 5 na text a ověř pevně 1 i 5.
2. Vytvoř Supplier s náhodnou známkou a zavolej get.
3. Do stejné metody přidej Supplier pro čas HH:mm; ověř formát na 09:05.

Hotovo: Pevné testy: vyborne, nedostatecne, 09:05. Náhodná známka i aktuální čas se mění.

Ponechání a návaznost: Čas dopisuj pod známku ve stejné metodě dodavatele, předchozí kód nemaž.

**Úloha 3.5: Vlastní Greeting → `pozdrav()`**

Výchozí stav: Metoda pozdrav je připravená. Greeting.java ve startovacím projektu zatím není.

1. V balíčku dil03 vytvoř Greeting.java: void repeat(String text, int count).
2. V pozdrav implementuj opakovaný výpis lambdou.
3. Zavolej ji pro Ahoj a 3, potom pro Ahoj a 0.

Hotovo: Celkem tři řádky Ahoj; volání s nulou nic nepřidá.

Ponechání a návaznost: Greeting.java ponech v balíčku. Následující zpracování jmen má vlastní metodu.

**Úloha 3.6: Zpracování jmen → `jmena()`**

Výchozí stav: V metodě už je List<String> names. Predikát, funkci a akci vytvoř znovu v této metodě.

1. Vytvoř startsA, upper a print vhodných funkcionálních typů.
2. V cyklu propoj test, apply a accept.
3. Ověř připravená data a potom prázdný seznam.

Hotovo: Výpis ADAM a ALENA. Pro prázdný seznam žádný výpis.

Ponechání a návaznost: Metoda nespoléhá na proměnné z consumer ani transformace.

### Díl 4: Lekce04.java

Společné ukázky: `ukazkaTisk()`.

**Úloha 4.1: Přepis na method reference → `reference()`**

Výchozí stav: Importy jsou připravené. V této metodě nejsou print, length ani same.

1. Vytvoř Consumer pro výpis, Function pro délku a BiPredicate pro equalsIgnoreCase.
2. Použij reference na metody.
3. Zavolej je pro Java, prázdný text a dvojici java/JAVA.

Hotovo: Tři řádky: Java, 0, true.

Ponechání a návaznost: Nezaměňuj společnou ukázku ukazkaTisk s touto vlastní úlohou.

**Úloha 4.2: Třídění podle délky → `trideni()`**

Výchozí stav: V metodě je měnitelný seznam words. Jeho vytvoření už neopisuj.

1. Vytvoř Comparator<String> pomocí comparingInt a String::length.
2. Použij words.sort a vypiš seznam.

Hotovo: [a, pes, kocka]. Délka je klíč pro porovnání, nikoli hotový Comparator.

Ponechání a návaznost: Seznam words patří jen do trideni; továrny budou v další metodě.

**Úloha 4.3: Továrny na objekty → `tovarny()`**

Výchozí stav: Student.java s konstruktorem Student(String name) a getterem getName je přiložený v dil04.

1. Vytvoř Function<String, Student> přes Student::new a vytvoř Janu.
2. Vypiš její getName().
3. Přes Supplier vytvoř dva různé seznamy; přidej A jen do prvního.

Hotovo: Jana / [A] / []. Druhý seznam se nezmění.

Ponechání a návaznost: Student.java nemaž. Díl 5 má vlastní připravenou kopii Student.

### Díl 5: Lekce05.java

Společné ukázky: `ukazkaLimit()`, `ukazkaSeznam()`.

**Úloha 5.1: Posuď a oprav zachycení → `zachyceni()`**

Výchozí stav: Příklady A, B, C jsou na předchozím snímku i v ZACHYCENI_ABC.txt. Metoda zachyceni je prázdná.

1. Zapiš ke každému, zda se přeloží, a uveď důvod.
2. Do metody napiš opravu B: použij novou proměnnou snapshot.
3. Zavolej Runnable. Chybnou variantu B nech mimo aktivní Java zdroj.

Hotovo: A a C projdou, B ne. Opravená metoda vypíše 2.

Ponechání a návaznost: Funkční opravu ponech. Záměrně chybný kód patří do zápisu, ne do odevzdávaného programu.

**Úloha 5.2: Dvě verze součtu → `soucet()`**

Výchozí stav: V metodě už je numbers = [1, 2, 3]. Ukázka chybného forEach se sem nekopíruje.

1. Doplň součet cyklem a součet přes mapToInt a sum.
2. Vypiš oba výsledky.
3. Pak změň jen připravený vstup na prázdný seznam a spusť znovu.

Hotovo: Pro [1, 2, 3] dva řádky 6. Pro [] dva řádky 0.

Ponechání a návaznost: Ponech obě správné varianty; mutable holder pro tuto úlohu nepotřebuješ.

**Úloha 5.3: Propojení naučených částí → `propojeni()`**

Výchozí stav: Student.java i vstupní names jsou v dil05 připravené. Vytvoř nové funkcionální proměnné.

1. Predicate vybere jména na A a Function přes Student::new vytvoří studenta.
2. Supplier vytvoří nový ArrayList<Student>. Consumer vypíše getName.
3. V sekvenčním cyklu přidej vybrané studenty do seznamu a vypiš je.

Hotovo: Adam a Alena. Prázdný vstup dá prázdný seznam bez výpisu.

Ponechání a návaznost: Odevzdej celý projekt; vysvětli změnu obsahu seznamu při zachování reference.

## Co odevzdat

Ulož do Gitu celé `src` včetně nově vytvořených rozhraní a tento seznam
hotových úloh. U každé dokončené úlohy uveď běžný a hraniční vstup a
očekávaný výsledek. Nedokončené úlohy označ číslem. Chybný kód pro diskusi
nech v komentáři nebo v samostatném textovém zápisu.
Před přechodem na další díl oprav nebo dočasně zakomentuj nepřeložitelný pokus.
