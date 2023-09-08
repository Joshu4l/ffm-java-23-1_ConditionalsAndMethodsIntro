//Schreibt eine Java-Methode, die zwei Zahlen als Parameter entgegennimmt und das Ergebnis ihrer Addition zurückgibt.
// Schritt 1: Schreibe eine Methode mit dem Namen 'add', die zwei int-Parameter entgegennimmt und die Summe der beiden Zahlen zurückgibt.
// Schritt 2: Rufe die Methode innerhalb deiner main() Methode auf und gib das Ergebnis auf der Konsole aus.
// Schritt 3: Verstehe dein Programm - Debugge es und gehe jede Zeile Schritt für Schritt durch.
// Schritt 4: Erweitere die 'add'-Methode, um auch Gleitkommazahlen (double) zu unterstützen.
// Schritt 5: Schreibe eine weitere Methode namens 'subtract', die zwei int-Parameter entgegennimmt und die Differenz der beiden Zahlen zurückgibt.
// Schritt 6: Schreibe eine weitere Methode namens 'makePositive', die positive Zahlen einfach zurückgibt und negative Zahlen zu positiven Zahlen umwandelt. (bei Argument '5' wird '5' zurückgegeben, aber bei Argument '-28' wird '28' zurückgegeben)
// Schritt 7: Erstelle eine bedingte Anweisung: wenn die erste Zahl größer ist als die zweite, soll die Methode 'subtract' aufgerufen werden, andernfalls die Methode 'add'-
// Schritt 8: Schreibe eine Methode, die prüft, ob eine Zahl gerade ist. Gerade Zahlen sollen einfach zurückgegeben werden, ungerade Zahlen sollen verdoppelt werden.
// Schritt 9: Schreibe eine Methode, die eine Zeichenkette als Parameter entgegennimmt und prüft, ob sie ein Palindrom ist (von vorne und hinten gelesen gleich)
//            Gib true zurück, wenn es ein Palindrom ist, sonst gib false zurück.

import java.util.Arrays;

public class ConditionalsAndMethods {

    public static void main (String [] args) {

        // Printe das Ergebnis folgender Addition:
        System.out.println(add(40, 2));

        // Printe das Ergebnis folgender Subtraktion:
        System.out.println(subtract(3, 7));

        // Printe das Ergebnis des folgenden makePositive-Aufrufs:
        System.out.println(makePositive(10));

        // Printe das Subtraktions- bzw. Additionsergebnis abhängig vom Größenunterschied folgender Zahlen:
        System.out.println(decideOperation(10, 3));

        // Printe das Ergebnis der Even- / Uneven-Prüfung
        System.out.println(treatEvenOrUneven(3));

    }


    public static double add (double number1, double number2) {
        return number1 + number2;
    }

    public static double subtract (double number1, double number2) {
        return number1 - number2;
    }

    public static double makePositive (double inputNumber) {
        if (inputNumber < 0) {
            return inputNumber * (-1);
        } else {
            return inputNumber;
        }
    }

    public static double decideOperation (double number1, double number2) {
        if (number1 > number2) {
            return subtract(number1, number2);
        } else {
            return add(number1, number2);
        }
    }

    public static double treatEvenOrUneven (double inputNumber) {
        if (inputNumber % 2 == 0) {
            return inputNumber;
        } else {
            return inputNumber*2;
        }
    }

}
