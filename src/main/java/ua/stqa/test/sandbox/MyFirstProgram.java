package ua.stqa.test.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
        hello("World");
        hello("users");
        double l=5;
        System.out.println("Площа квадрата з стороною" + l + "=" + area (l));
    }

    public static double area(double len) {
        return len * len;
    }

    public static void hello(String somebody) {
        System.out.println("Hello," + somebody+"!");
    }
}

//        String somebody = "World";
//        System.out.println("Hello "+ somebody + "!");

//        System.out.println(2 + 2); Выражения и операции
//        System.out.println(2  *2);
//        System.out.println(1 / 2);
//        System.out.println( 1.0 / 2);
//        System.out.println(1 / 2.0);
//        System.out.println( 2.0 / 2);
//        System.out.println( "2" + "2");
//        System.out.println( "2" + 2);
//        System.out.println( 2 + "2");
//        System.out.println( 2 + 2 * 2 );
//        System.out.println( (2+2)*2);


//Переменные и значения
        //int l= 8;
        //System.out.println( "Площа квадрата з стороною" + l +" = "+(l * l) );

// Типы переменных и значения
//        double l =8.0;
//        double s = l*l;
//        System.out.println( "Площа квадрата з стороною" + l +" = "+ s );





