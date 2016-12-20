package com.greenfoxacademy.springstart.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Random;

/**
 * Created by gabkamabka on 2016.12.19..
 */
public class greetingsWeb {

    String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
            "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
            "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
            "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

    String[] colors = {"blue", "cyan", "gray", "green", "brown", "purple", "orange", "green", "lime", "yellow", "light-blue", "purple",};
    private Random rand = new Random();

    @RequestMapping("/web/greetings")
    public String greetings(Model model) {
        model.addAttribute("hello", getHello(hellos));
        model.addAttribute("color", getColor(colors));
        model.addAttribute("fontSize", getFontSize());

        return "greetings";
    }

    public String getHello(String[] hellos) {
        return hellos[rand.nextInt(hellos.length)];
    }

    public String getColor(String[] colors) {
        return colors[rand.nextInt(colors.length)];
    }

    public int getFontSize() {
        return rand.nextInt(48) + 12;
    }
}




