#  Advanced Calculator

Ein erweiterter Taschenrechner in Java, der neben den Grundrechenarten auch wissenschaftliche Funktionen wie Logarithmen, Wurzeln und Trigonometrie unterstützt.  
Dieses Projekt dient als Übung für objektorientierte Programmierung, Fehlerbehandlung (Exceptions) und die Nutzung der Java `Math`-Bibliothek.

##  Funktionen (Features)
- **Grundrechenarten:** Addition, Subtraktion, Multiplikation und Division.
- **Wissenschaftliche Funktionen:**
    - Quadratwurzel (√)
    - Logarithmus (ln und log10)
    - Trigonometrie (Sinus, Cosinus, Tangens) – *Eingabe in Grad*
    - Potenzieren (x^y)
    - Fakultät (!)
- **Fehlerbehandlung:** Division durch Null und ungültige Eingaben (z. B. Wurzel aus negativen Zahlen) werden abgefangen.

##  Verwendete Technologien (Technologies)
- **Java 25** (oder die von dir verwendete Version)
- **Gradle** (Build-Management)

## Ausführen des Projekts (How to Run)
1. Stelle sicher, dass Java und Gradle auf deinem System installiert sind.
2. Öffne das Projekt in IntelliJ IDEA.
3. Führe die `Main.java`-Klasse aus.
4. Wähle im Menü die gewünschte Rechenoperation aus.

##  Projektstruktur (Project Structure)
- `src/main/java/service`: Enthält die `CalculatorService`-Klasse (Logik und Berechnungen).
- `src/main/java/org/example`: Enthält die `Main`-Klasse (Benutzeroberfläche/Menü).

##  Autorin (Author)
- **Nada Barakeh**