import java.util.Scanner;

public class ConversorUnidades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Conversor de Unidades - Version 2.1");
        System.out.println("[1] Longitud\n[2] Peso\n[3] Temperatura");
        System.out.print("Tipo de conversion: ");
        int tipo = sc.nextInt();
    
         switch (tipo) {
            case 1:
                System.out.println("Conversion de longitud:");
                System.out.println("[1] M a Km\n[2] Km a M\n[3] M a Mi\n[4] Mi a M\n[5] Cm a In\n[6] In a Cm");
                procesarConversion(sc, 1);
                break;
            case 2:
                System.out.println("Conversion de peso:");
                System.out.println("[1] Kg a G\n[2] G a Kg\n[3] Kg a Lb\n[4] Lb a Kg\n[5] G a Oz\n[6] Oz a G");
                procesarConversion(sc, 2);
                break;
            case 3:
                System.out.println("Conversion de temperatura:");
                System.out.println("[1] C a F\n[2] F a C\n[3] C a K\n[4] K a C");
                procesarConversion(sc, 3);
                break;
            default:
                System.out.println("Tipo no valido");
        }
    }

    
            if (o == 1) {
                System.out.println(v + " m = " + (v / 1000) + " km");
            } else if (o == 2) {
                System.out.println(v + " km = " + (v * 1000) + " m");
            } else if (o == 3) {
                System.out.println(v + " m = " + (v * 0.000621371) + " mi");
            } else if (o == 4) {
                System.out.println(v + " mi = " + (v * 1609.34) + " m");
            } else if (o == 5) {
                System.out.println(v + " cm = " + (v * 0.393701) + " in");
            } else if (o == 6) {
                System.out.println(v + " in = " + (v * 2.54) + " cm");
            } else {
                System.out.println("Opcion no valida");
                f = false;
            }
        } else if (t == 2) {
            System.out.println("Conversion de peso:");
            System.out.println("[1] Kilogramos a Gramos");
            System.out.println("[2] Gramos a Kilogramos");
            System.out.println("[3] Kilogramos a Libras");
            System.out.println("[4] Libras a Kilogramos");
            System.out.println("[5] Gramos a Onzas");
            System.out.println("[6] Onzas a Gramos");
            System.out.print("Opcion: ");
            int o = sc.nextInt();
            System.out.print("Valor: ");
            double v = sc.nextDouble();

            if (o == 1) {
                System.out.println(v + " kg = " + (v * 1000) + " g");
            } else if (o == 2) {
                System.out.println(v + " g = " + (v / 1000) + " kg");
            } else if (o == 3) {
                System.out.println(v + " kg = " + (v * 2.20462) + " lb");
            } else if (o == 4) {
                System.out.println(v + " lb = " + (v * 0.453592) + " kg");
            } else if (o == 5) {
                System.out.println(v + " g = " + (v * 0.035274) + " oz");
            } else if (o == 6) {
                System.out.println(v + " oz = " + (v * 28.3495) + " g");
            } else {
                System.out.println("Opcion no valida");
                f = false;
            }
        } else if (t == 3) {
            System.out.println("Conversion de temperatura:");
            System.out.println("[1] Celsius a Fahrenheit");
            System.out.println("[2] Fahrenheit a Celsius");
            System.out.println("[3] Celsius a Kelvin");
            System.out.println("[4] Kelvin a Celsius");
            System.out.print("Opcion: ");
            int o = sc.nextInt();
            System.out.print("Valor: ");
            double v = sc.nextDouble();

            if (o == 1) {
                System.out.println(v + " C = " + (v * 9 / 5 + 32) + " F");
            } else if (o == 2) {
                System.out.println(v + " F = " + ((v - 32) * 5 / 9) + " C");
            } else if (o == 3) {
                System.out.println(v + " C = " + (v + 273.15) + " K");
            } else if (o == 4) {
                System.out.println(v + " K = " + (v - 273.15) + " C");
            } else {
                System.out.println("Opcion no valida");
                f = false;
            }
        } else {
            System.out.println("Tipo no valido");
        }
    }
}
