package com.adamortiz.analisis_fechas;

import java.time.DateTimeException;
import java.time.LocalDate;

public class AnalizadorFecha {

    public boolean fechaValida(int year, int month, int day) {
        if (year < 2000 || year > 2005) {
            return false;
        }
        try {
            LocalDate.of(year, month, day);
            return true;
        } catch (DateTimeException e) {
            return false;
        }
    }

    public boolean esBisiesto(int year) {
        return LocalDate.of(year, 1, 1).isLeapYear();
    }

    public String signoZodiacoOccidental(int month, int day) {
        if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) return "Aries";
        if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) return "Tauro";
        if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) return "Géminis";
        if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) return "Cáncer";
        if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) return "Leo";
        if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) return "Virgo";
        if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) return "Libra";
        if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) return "Escorpio";
        if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) return "Sagitario";
        if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) return "Capricornio";
        if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) return "Acuario";
        return "Piscis";
    }

    public String signoZodiacoChino(int year) {
        String[] signos = {
                "Mono", "Gallo", "Perro", "Cerdo",
                "Rata", "Buey", "Tigre", "Conejo",
                "Dragón", "Serpiente", "Caballo", "Cabra"
        };
        return signos[year % 12];
    }
}
