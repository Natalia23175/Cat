package com.company;

public class Main {

    public static void main(String[] args) {
        Cat catFirst = new Cat();
        // Przypisanie wartości do imienia  <nazwa zmiennej>.<nazwa pola> = <nowa wartość>
        catFirst.name = "Burek";
        // Przypisanie wartości do wieku
        catFirst.age = 7;
        // Wykonanie metody RUN
        catFirst.run();

        // Wyswietlenie Imienia <nazwa zmiennej>.<nazwa pola>
        System.out.println("Imie kota: " + catFirst.name);
        // Wyswietlenie wieku <nazwa zmiennej>.<nazwa pola>
        System.out.println("Wiek: " + catFirst.age);


        // Nazewnictwo Klas - Zawsze z wielkie litery, w przypadku wielu słow wykorzystujemy CammelCase -> CarRadio
        // Nazewnictwo Zmiennych -> Zawsze z malej litery, kolejne slowa z wielkie, -> carRadio, catFirst, catSecond -> nazwy zmiennych powinny być konretne
        // Nazewnictwo Metod -> Zawsze z malej litery (Czasowniki), kolejne slowa z wielkie, Nazwy konkretne wskazujace na to co dana metoda robi.
        // Wszystko po angielsku

        // <- komentarz liniowy
        /*
         * <- komentarz wieloliniowy
         * */

    }

    }

