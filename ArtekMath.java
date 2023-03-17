
public class ArtekMath {
    public static float radToDeg(float deg_r) {
        return (float) Math.toDegrees(deg_r);
    }
    /*Actividad 1 - Métodos para Seno*/
    /*Función simple*/
    public float GetSin(float deg)
    {
        float result = (float) Math.sin(deg);
        if(deg<90){
            System.out.println("sin("+deg+"): "+String.format("%.2f",result)+"\n");
        }else{
            System.out.println("sin("+deg+"): "+String.format("%.0f",result)+"\n");
        }
        return result;
    }

    // Función para calcular el seno en grados
    public float sinDeg(float deg_r) {
        float sin = (float) Math.sin(deg_r);
        System.out.println("sin("+deg_r+" rad): "+sin+"\n");
        return radToDeg(sin);
    }

    /*Función que recibe un String y entrega resultado en radianes*/
    public float GetSin_r(String deg){
        float deg_f = Float.parseFloat(deg);
        float deg_r = (float) Math.toRadians(deg_f);
        float sin_r = (float) Math.sin(deg_r);

        if(deg_f<90){
            System.out.println("sin("+deg+"): "+String.format("%.2f",sin_r)+" rad"+"\n");
        }else{
            System.out.println("sin("+deg+"): "+String.format("%.0f",sin_r)+" rad"+"\n");
        }
        return sin_r;
    }

    /*Función que recibe enteros y entrega resultado en flotante*/
    public float GetSin(Integer opposite,Integer hypotenuse){
        float opposite_f = opposite.floatValue();
        float hypotenuse_f = hypotenuse.floatValue();
        float sin = (opposite_f/hypotenuse_f);
        System.out.println("Sin("+opposite+","+hypotenuse+")"+": "+sin+"\n");
        return sin;
    }
    /*Función que recibe flotante y entrega resultado en flotante*/
    public float GetSin_f(Float opposite,Float hypotenuse){
        float sin_f = (opposite/hypotenuse);
        System.out.println("Sin("+opposite+","+hypotenuse+")"+": "+sin_f+"\n");
        return sin_f;
    }
    /*Función que recibe cadena de caractéres y entrega resultado en flotante*/
    public float GetSin_s(String opposite,String hypotenuse) {
        float opposite_f = Float.parseFloat(opposite);
        float hypotenuse_f = Float.parseFloat(hypotenuse);
        float sin_f = (opposite_f/hypotenuse_f);
        System.out.println("Sin("+opposite+","+hypotenuse+")"+": "+sin_f+"\n");
        return sin_f;
    }
    /*Actividad 2 - Métodos para Coseno*/
    /*Función simple*/
    public float GetCos(float deg)
    {
        float result = (float) Math.cos(deg);
        if(deg<90){
            System.out.println("cos("+deg+"): "+String.format("%.2f",result)+"\n");
        }else{
            System.out.println("cos("+deg+"): "+String.format("%.0f",result)+"\n");
        }
        return result;
    }

    // Función para calcular el coseno en grados
    public float cosDeg(float deg_r) {
        float cos = (float) Math.cos(deg_r);
        System.out.println("cos("+deg_r+" rad): "+cos+"\n");
        return radToDeg(cos);
    }

    /*Función que recibe un String y entrega resultado en radianes*/
    public float GetCos_r(String deg){
        float deg_f = Float.parseFloat(deg);
        float deg_r = (float) Math.toRadians(deg_f);
        float cos_r = (float) Math.cos(deg_r);
        if(deg_f<90){
            System.out.println("sin("+deg+"): "+String.format("%.2f",cos_r)+" rad"+"\n");
        }else{
            System.out.println("sin("+deg+"): "+String.format("%.0f",cos_r)+" rad"+"\n");
        }
        return cos_r;
    }
    /*Función que recibe enteros y entrega resultado en flotante*/
    public float GetCos(Integer adjacent,Integer hypotenuse){
        float adjacent_f = adjacent.floatValue();
        float hypotenuse_f = hypotenuse.floatValue();
        float cos = (adjacent_f/hypotenuse_f);
        System.out.println("Cos("+adjacent+","+hypotenuse+")"+": "+cos+"\n");
        return cos;
    }
    /*Función que recibe flotante y entrega resultado en flotante*/
    public float GetCos_f(Float adjacent,Float hypotenuse){
        float cos_f = (adjacent/hypotenuse);
        System.out.println("Cos("+adjacent+","+hypotenuse+")"+": "+cos_f+"\n");
        return cos_f;
    }
    /*Función que recibe cadena de caractéres y entrega resultado en flotante*/
    public float GetCos_s(String adjacent, String hypotenuse){
        float adjacent_f = Float.parseFloat(adjacent);
        float hypotenuse_f = Float.parseFloat(hypotenuse);
        float cos_f = (adjacent_f/hypotenuse_f);
        System.out.println("Cos("+adjacent+","+hypotenuse+")"+": "+cos_f+"\n");
        return cos_f;
    }
    /*Actividad 3 - Métodos para Tangente*/
    /*Función simple*/
    public float GetTan(float deg)
    {
        float result = (float) Math.tan(deg);
        if(deg<90){
            System.out.println("tan("+deg+"): "+String.format("%.2f",result)+"\n");
        }else{
            System.out.println("tan("+deg+"): "+String.format("%.0f",result)+"\n");
        }
        return result;
    }
    // Función para calcular la tangente en grados
    public static float tanDeg(float deg_r) {
        float tan = (float) Math.tan(deg_r);
        System.out.println("tan("+deg_r+" rad): "+tan+"\n");
        return radToDeg(tan);
    }
    /*Función que recibe un String y entrega resultado en radianes*/
    public float GetTan_r(String deg){
        float deg_f = Float.parseFloat(deg);
        float tan = (float) Math.cos(deg_f);
        float tan_r = (float) Math.toRadians(tan);

        if(deg_f<90){
            System.out.println("sin("+deg+"): "+String.format("%.2f",tan_r)+" rad"+"\n");
        }else{
            System.out.println("sin("+deg+"): "+String.format("%.0f",tan_r)+" rad"+"\n");
        }

        return tan_r;
    }
    /*Función que recibe enteros y entrega resultado en flotante*/
    public float GetTan(Integer opposite, Integer adjacent){
        float adjacent_f = adjacent.floatValue();
        float opposite_f = opposite.floatValue();
        float tan = (opposite_f/adjacent_f);
        System.out.println("Sin("+opposite+","+adjacent+")"+": "+tan+"\n");
        return tan;
    }
    /*Función que recibe flotante y entrega resultado en flotante*/
    public float GetTan_f(Float opposite, Float adjacent){
        float tan_f = (opposite/adjacent);
        System.out.println("Sin("+opposite+","+adjacent+")"+": "+tan_f+"\n");
        return tan_f;
    }
    /*Función que recibe cadena de caractéres y entrega resultado en flotante*/
    public float GetTan_s(String opposite, String adjacent){
        float adjacent_f = Float.parseFloat(adjacent);
        float opposite_f = Float.parseFloat(opposite);
        float tan_f = (opposite_f/adjacent_f);
        System.out.println("Sin("+opposite+","+adjacent+")"+": "+tan_f+"\n");
        return tan_f;
    }
}