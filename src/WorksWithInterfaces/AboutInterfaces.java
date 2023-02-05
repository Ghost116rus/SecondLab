package WorksWithInterfaces;

interface IFunc {
    public int getF();
}
interface IConst {
    public static final int verConst= 100;
}
class ClassInt implements IFunc, IConst {
    public int getF (){ return verConst;}
}

/* Интерфейсы и неоднозначность*/
interface IConst1 {
    static final int verConst= 101;
}
interface IConst2 {
    int verConst= 102;
}
interface IConst3 extends IConst1, IConst2 {
    static final int verConst= 100;
    int get (boolean b);
}
class ClassInt1 implements IConst3 {
    public int get (boolean b){ return b ? IConst1.verConst : IConst2.verConst;}
}

public class AboutInterfaces
{
    public static void showHowItWorks()
    {
        /* Интерфейсы */
//        ClassInt cI = new ClassInt();
//        System.out.println ("verConst= " + cI.getF());
//        IFunc iF = cI;
//        IConst iC = cI;
//        System.out.println ("verConst= " + iF.getF());
//
//        // System.out.println ("verConst= " + iC.getF()); // Error
//        // Cannot find 'getF()' in 'IConst'
//        System.out.println ("verConst= " + iC.verConst);
//        System.out.println ("verConst= " + ClassInt.verConst);

        /* Интерфейсы и неоднозначность*/

        ClassInt1 cI= new ClassInt1();
        System.out.print ("cI.verConst= " + cI.verConst);
        System.out.println (" ClassInt.verConst= " + ClassInt.verConst);

        IConst1 iC1= cI;
        System.out.print ("iC1.verConst= " + iC1.verConst);
        IConst2 iC2= cI;
        System.out.print (" iC2.verConst= " + iC2.verConst);
        IConst3 iC= cI;
        System.out.println (" iC.verConst= " + iC.verConst);

        System.out.print ("IConst1.verConst= " + IConst1.verConst);
        System.out.print (" IConst2.verConst= " + IConst2.verConst);
        System.out.println (" IConst.verConst= " + IConst.verConst);

        System.out.println ("cI.get(true)= " + cI.get(true) + " cI.get(false)= "+ cI.get(false));

    }
}
