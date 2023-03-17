import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String names = "Juan|Pedro|Maria|Luisa";
        String regex = "\\|"; // regex para separar los nombres por el carácter '|'


        ArtekString string = new ArtekString();
        String name = scanner.next();
        string.UpperName(name);
        string.LowerName(name);
        String[] result = ArtekString.SplitNames(names, regex);
        System.out.print("Lista de nombres: "+names+"\n");
        System.out.println("Nombres separados:");
        for (String name_s : result) {
            System.out.println(name_s);
        }
        string.ReverseName(name);
        string.DisorderName(name);
        string.ReplaceVowelsName(name);
        string.UpperLower(name);
        string.LowerUpper(name);


        /*Instanciamos la clase ArtekMath*/
        ArtekMath math = new ArtekMath();
        /*Pruebas*/
        /*Actividad 1 - Métodos para la función seno(x)*/
        /*a) String - Función seno recibiendo los grados del ángulo*/
        /*Ingreso del dato*/
        System.out.println("\nFunción sin(x) - Recibiendo el ángulo");
        System.out.print("Ingrese el valor de los grados: ");
        Float deg_in1 = scanner.nextFloat();

        math.GetSin(deg_in1);
        Float Sin = math.GetSin_r(String.valueOf(deg_in1));
        math.sinDeg(Sin);

        /*b) Enteros*/
        System.out.println("Función sin(x) - Recibiendo enteros");
        System.out.print("Ingrese el valor del cateto opuesto: ");
        int opposite = scanner.nextInt();
        System.out.print("Ingrese el valor de la hipotenusa: ");
        int hypotenuse = scanner.nextInt();
        math.GetSin(opposite, hypotenuse);

        /*c) Flotantes*/
        System.out.println("Función sin(x) - Recibiendo flotantes");
        System.out.print("Ingrese el valor del cateto opuesto: ");
        float opposite_fs = scanner.nextFloat();
        System.out.print("Ingrese el valor de la hipotenusa: ");
        float hypotenuse_fs = scanner.nextFloat();
        math.GetSin_f(opposite_fs, hypotenuse_fs);

        /*d) String*/
        System.out.println("Función sin(x) - Recibiendo strings");
        System.out.print("Ingrese el valor del cateto opuesto: ");
        String opposite_ss = scanner.next();
        System.out.print("Ingrese el valor de la hipotenusa: ");
        String hypotenuse_ss = scanner.next();
        math.GetSin_s(opposite_ss, hypotenuse_ss);

        /*Actividad 2 - Métodos para la función coseno(x)*/
        /*a) String - Función coseno recibiendo los grados del ángulo*/
        System.out.println("Función cos(x) - Recibiendo el ángulo");
        System.out.print("Ingrese el valor de los grados: ");
        Float deg_in2 = scanner.nextFloat();

        math.GetCos(deg_in2);
        Float Cos = math.GetCos_r(String.valueOf(deg_in2));
        math.cosDeg(Cos);
        /*b) Enteros*/
        System.out.println("Función cos(x) - Recibiendo enteros");
        System.out.print("Ingrese el valor del cateto adyacente: ");
        int adjacent_c = scanner.nextInt();
        System.out.print("Ingrese el valor de la hipotenusa: ");
        int hypotenuse_c = scanner.nextInt();
        math.GetCos(adjacent_c, hypotenuse_c);
        /*c) Flotantes*/
        System.out.println("Función cos(x) - Recibiendo flotantes");
        System.out.print("Ingrese el valor del cateto adyacente: ");
        float adjacent_fc = scanner.nextFloat();
        System.out.print("Ingrese el valor de la hipotenusa: ");
        float hypotenuse_fc = scanner.nextFloat();
        math.GetCos_f(adjacent_fc, hypotenuse_fc);
        /*d) Strings*/
        System.out.println("Función cos(x) - Recibiendo strings");
        System.out.print("Ingrese el valor del cateto adyacente: ");
        String adjacent_sc = scanner.next();
        System.out.print("Ingrese el valor de la hipotenusa: ");
        String hypotenuse_sc = scanner.next();
        math.GetCos_s(adjacent_sc, hypotenuse_sc);

        /*Actividad 3 - Métodos para la función tangente(x)*/
        /*a)*/
        System.out.println("Función tan(x) - Recibiendo el ángulo");
        System.out.print("Ingrese el valor de los grados: ");
        Float deg_in3 = scanner.nextFloat();

        math.GetTan(deg_in3);
        Float Tan = math.GetTan_r(String.valueOf(deg_in3));
        math.tanDeg(Tan);

        /*b)*/
        System.out.println("Función tan(x) - Recibiendo enteros");
        System.out.print("Ingrese el valor del cateto opuesto: ");
        int opposite_t = scanner.nextInt();
        System.out.print("Ingrese el valor de la adyacente: ");
        int adjacent_t = scanner.nextInt();
        math.GetTan(opposite_t, adjacent_t);
        /*c)*/
        System.out.println("Función tan(x) - Recibiendo flotantes");
        System.out.print("Ingrese el valor del cateto opuesto: ");
        float opposite_tf = scanner.nextFloat();
        System.out.print("Ingrese el valor de la adyacente: ");
        float adjacent_tf = scanner.nextFloat();
        math.GetTan_f(opposite_tf, adjacent_tf);
        /*d)*/
        System.out.println("Función tan(x) - Recibiendo strings");
        System.out.print("Ingrese el valor del cateto opuesto: ");
        String opposite_ts = scanner.next();
        System.out.print("Ingrese el valor de la adyacente: ");
        String adjacent_ts = scanner.next();
        math.GetTan_s(opposite_ts, adjacent_ts);
    }
}