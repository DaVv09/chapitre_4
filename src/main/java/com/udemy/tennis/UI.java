package com.udemy.tennis;

import com.udemy.tennis.controller.EpreuveController;
import com.udemy.tennis.controller.ScoreController;

public class UI {
    public static void main(String... args){
         EpreuveController controller=new EpreuveController();
         controller.afficheDerniereEpreuve();
    }
}
