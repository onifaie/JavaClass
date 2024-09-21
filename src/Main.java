


import Controller.useif;

import java.sql.Connection;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        System.out.println("-----------Begin Programming---------");
//        getCounterValue(10);
//        System.out.println(calculateGannLevels(100,80));
//        printGannLevels(calculateGannLevels(5723.88,5686.42));
//        System.out.println(checkStudentGrade(101));
        useif d = new useif();
        System.out.println(d.cheak(90));

    }





    private static int getCounterValue(int limit) {
        int counter = 0;
        for (int i = 0; i < limit; i++) {
            System.out.println(counter++);
            System.out.println(checkStudentGrade(95));
        }
        return counter;
    }


    private static String checkStudentGrade(int grade) {
        if (grade >= 90) {
            return "Excellent";
        } else if (grade >= 75) {
            return "Very Good";
        } else if (grade >= 60) {
            return "Good";
        } else {
            return "Needs Improvement";
        }
    }



}

