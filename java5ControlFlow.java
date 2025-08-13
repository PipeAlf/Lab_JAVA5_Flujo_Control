import java.util.Scanner;
//! Andrés Alfonso
public class Main {
    public static void main(String[] args) {
        facturacion();
        mascotas();
        parqueadero();
        promociones();
    }

    //! Primer ejercicio
    public static void facturacion(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese por favor el total de la compra: ");
        double total = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Ingrese la cantidad de articulos de la compra: ");
        int productos = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Tiene membresía? (S/N)");
        String membresia = scanner.nextLine();
        double totalDesc = 0;

        switch (membresia.toLowerCase()){
            case "s":
            case "si":
                if(productos>10){
                    totalDesc= total*0.85;
                    break;
                }else{
                    totalDesc= total*0.9;
                    break;
                }
            case "n":
            case "no":
                if(productos>10){
                    totalDesc=total*0.95;
                    break;
                }else{
                    totalDesc=total;
                    break;
                }
            default:
                System.out.println("Ingrese si tiene o no membresía!");
        }
        System.out.println("El total a pagar es de: " + totalDesc);
    }

    //! Segundo ejercicio
    public static void mascotas(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tipo de animal del usuario: ");
        String tipo = scanner.nextLine();
        System.out.println("Ingrese la edad de la mascota: ");
        int edad = scanner.nextInt();
        scanner.nextLine();
        String veterinario;
        boolean vacuna;

        switch (tipo.toLowerCase()){
            case "perro":
                if(edad>5){
                    veterinario = "Dra. Ana (Especialista en perros)";
                    vacuna=true;
                    break;
                }
                else{
                    veterinario = "Dra. Ana (Especialista en perros)";
                    vacuna=false;
                    break;
                }
            case "gato":
                if(edad>5){
                    veterinario = "Dra. Nath (Especialista en gatos)";
                    vacuna=true;
                    break;
                }else{
                    veterinario = "Dra. Nath (Especialista en gatos)";
                    vacuna = false;
                    break;
                }
            case "ave":
                veterinario = "Dra. Jess (Especialista en aves)";
                vacuna = false;
                break;
            default:
                veterinario = "Dr. Andrés (Veterinario general)";
                vacuna = false;
                break;
        }
        if(vacuna){
            System.out.println("Su mascota será atendida por: " + veterinario + " y se recomienda una vacuna adicional!");
        }else{
            System.out.println("Su mascota será atendida por: " + veterinario);
        }
    }

    //! Acceso a parqueadero

    public static void parqueadero(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tipo de vehículo (auto, moto, bicicleta): ");
        String vehiculo = scanner.nextLine();
        System.out.println("Ingrese la hora de llegada (24h): ");
        int hora = scanner.nextInt();
        scanner.nextLine();
        double total=0;
        double costo=0;

        switch (vehiculo.toLowerCase()){
            case "auto":
                costo = 15000;
                if(hora>=20 && hora<=24){
                    total=costo*1.2;
                    System.out.println("El total a pagar es de: " + total);
                    break;
                } else{
                    total=costo;
                    System.out.println("El total a pagar es de: " + total);
                    break;
                }
            case "moto":
                costo = 6000;
                if(hora>=20 && hora<=24){
                    total=costo*1.2;
                    System.out.println("El total a pagar es de: " + total);
                    break;
                } else{
                    total=costo;
                    System.out.println("El total a pagar es de: " + total);
                    break;
                }
            case "bicicleta":
                costo = 2000;
                if(hora>=20 && hora<=24){
                    total=costo*1.2;
                    System.out.println("El total a pagar es de: " + total);
                    break;
                } else{
                    total=costo;
                    System.out.println("El total a pagar es de: " + total);
                    break;
                }
            default:
                System.out.println("Ingrese un tipo de vehículo valido!");
        }

    }

    //! Promociones en tienda de ropa
    public static void promociones(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tipo de prenda a comprar (camisa, pantalón, chaqueta): ");
        String prenda = scanner.nextLine();
        System.out.println("Ingrese cuantas prendas desea comprar: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();
        double costoU = 0;
        double total = 0;

        switch (prenda.toLowerCase()){
            case "camisa":
                costoU = 60000;
                if(cantidad > 5){
                    total = (costoU * cantidad) * 0.85;
                    break;
                }else{
                    total = (costoU * cantidad);
                    break;
                }
            case "pantalon":
                costoU = 120000;
                if(cantidad > 5){
                    total = (costoU * cantidad) * 0.85;
                    break;
                }else{
                    total = (costoU * cantidad);
                    break;
                }
            case "chaqueta":
                costoU = 260000;
                if(cantidad > 5){
                    total = (costoU * cantidad) * 0.85;
                    break;
                }else{
                    total = (costoU * cantidad);
                    break;
                }
            default:
                System.out.println("Ingrese una prenda valida!");
        }
        System.out.println("El total a pagar es de: " + total);
    }
}
