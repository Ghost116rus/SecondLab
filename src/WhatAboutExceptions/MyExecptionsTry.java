package WhatAboutExceptions;

class MyException extends Exception {

    //public MyException () {}
    public String toString () { return "MyException happened";}
}

public class MyExecptionsTry
{
    private static void Func ( ) { int m=10, n=0; n= m/n; }

    private static void Func2() throws MyException
    {
        int m = 0, n = 10;
        if((m/n) == 0) throw new MyException ();

        System.out.print ("Next");
    }


    public static void showHowItWorks()
    {
        try
        {
            Func ();
        } catch (ArithmeticException e)
        {
            System.out.println ("ArithmeticException happened");
        } catch (Exception e)
        {
            System.out.println ("Exception happened");
        } finally {
            System.out.println ("finally");
        }
    }

    public static void TestMyExc() {
        try
        {Func2();}
        catch (MyException e) {System.out.println (e);}
    }

}

