import mypackage.AboutClasses;
import WorksWithInterfaces.AboutInterfaces;
import WhatAboutExceptions.MyExecptionsTry;
import SecondLab.MainProgram;



public class Main {
    public static void main(String[] args)
    {
        /* Второй пунк */

        AboutClasses.showHowItWorks();

        AboutInterfaces.showHowItWorks();

        MyExecptionsTry.showHowItWorks();
        MyExecptionsTry.TestMyExc();


        System.out.println(MainProgram.process_sum(args));

    }
}