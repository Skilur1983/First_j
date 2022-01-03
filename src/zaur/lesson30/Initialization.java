package zaur.lesson30;

public class Initialization {
    int a = 3; // 3 if one comments Initialization() and initialization block

    Initialization(){
        a = 4; // 4
    }
    // Initialization block. It's called each time we create this class instance
    {
        a = 5; // 5 if one comments Initialization()
    }

    public static void main(String[] args) {
        Initialization i = new Initialization();
        System.out.println(i.a);
    }
}

class A{
    final static int a; // constants may be set while static initialization
    final static int b = 2;
    static int c;

    // static initialization
    static {
        a = 3;
//      b = 3; constants can't be updated while static initialization
    }
}