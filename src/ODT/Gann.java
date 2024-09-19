package ODT;

import Database.looping;

public class Gann {

    public String PrintGann(){

        System.out.println("Printing Gann this Result Of Gann Levels ...." );
        return "Gann";
    }


    public static void main(String[] args) {
        Gann gann = new Gann();
        gann.PrintGann();

        looping loop = new looping();
        loop.myloop(6);


    }
}
