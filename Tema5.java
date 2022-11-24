    import java.util.ArrayList;
    import java.util.List;
    import java.util.Scanner;

    public class Tema5 {
        private static Scanner sc = new Scanner(System.in);
        static List<productos> lista = new ArrayList<productos>();
        static List<productos> lista1 = new ArrayList<productos>();
        static List<productos> lista2 = new ArrayList<productos>();
        static int compra;

        public void Drogueria() {
            boolean respuesta = true;
            int opcion;

            System.out.println("2. **** Bienvenidos a la Drogueria Mi Salud ****");
            System.out.println(" ");
            do {
                sc = new Scanner(System.in);
                menu();
                opcion = capturaopcion();

                respuesta = opciones(opcion);

            } while (respuesta == true);

        }

        private static void menu() {

            System.out.println("Seleccione del menu Principal:");
            System.out.println(" ");
            System.out.println("1. ***** Productos para la Salud *****");
            System.out.println("2. ***** Cuidado Personal ****");
            System.out.println("3. **** Maternidad ***");
            System.out.println("4. **** Cambios o Devoluciones ***");
            System.out.println("0. Salir del taller");
            System.out.println("------------------------------------------");

        }

        private static int capturaopcion() {

            return Integer.parseInt(sc.nextLine());

        }

        private static boolean opciones(int opcion) {
            switch (opcion) {

                case 1:

                    productoSalud();
                    System.out.println(" ");
                    System.out.println("------------------------------------");

                    return true;

                case 2:
                    productoPersonal();
                    System.out.println(" ");
                    System.out.println("---------------------------------------");
                    return true;

                case 3:
                    productoMaternal();
                    System.out.println(" ");
                    System.out.println("----------------------------------------");
                    return true;

                case 4:

                    System.out.println("Devoluciones:");
                    devolucion(lista);
                    return true;

                case 0:
                System.out.println("****Saliendo del sistema******");
                    return false;

                default:

                    System.out.println(" Opcion Invalida");
            }
            return true;

        }

        private static void productoSalud() {
            System.out.println("Productos Disponibles");
            System.out.println(" ");

            lista.add(new productos(1, "Entereogermina plus", "Bacterias", "Caja X 10 Amp $ 68.500"));
            lista.add(new productos(2, "Dolex Gripa (500 mg)", "Congestion nasal, dolores musculares",
                    "Caja X 12 Tabletas $ 11.750"));
            lista.add(new productos(3, "Bion3", "Vitaminas y Minerales", "Caja X 30 Tabletas $ 30.150"));

            for (int i = 0; i < lista.size(); i++) {
                System.out.println(lista.get(i).toString());
                System.out.println(" ");
            }
            System.out.println("----------------------------------------------------------");
            System.out.println("Seleccione el producto a comprar:");

            compra = capturaopcion();
            System.out.println(" ");
            if (compra == 1) {
                System.out.println("Usted Agrego a su carrito de compra " + lista.get(0).getNombreProducto());
                System.out.println(" ");
            }
            if (compra == 2) {
                System.out.println("Usted Agrego a su carrito de compra " + lista.get(1).getNombreProducto());
                System.out.println(" ");
            }
            if (compra == 3) {
                System.out.println("Usted Agrego a su carrito de compra " + lista.get(2).getNombreProducto());
                System.out.println(" ");
            }

        }

        private static void productoPersonal() {

            lista1.add(new productos(1, "Crema Corporal Nivea (800 ml)", "Humectacion", "$ 41.300"));
            lista1.add(new productos(2, "Enjuague Bucal Colgate (250 ml)", "Antibacteriano", "Sin Alcohol $ 19.600"));
            lista1.add(new productos(3, "Desodorante Lady Speed Stick Crema (50 g)", "Proteccion", "$ 14.000"));

            for (int i = 0; i < lista1.size(); i++) {
                System.out.println(lista1.get(i).toString());
                System.out.println(" ");
            }
            System.out.println("----------------------------------------------------------");
            System.out.println("Seleccione el producto a comprar:");

            compra = capturaopcion();
            System.out.println(" ");
            if (compra == 1) {
                System.out.println("Usted Agrego a su carrito de compra " + lista1.get(0).getNombreProducto());
                System.out.println(" ");
            }
            if (compra == 2) {
                System.out.println("Usted Agrego a su carrito de compra " + lista1.get(1).getNombreProducto());
                System.out.println(" ");
            }
            if (compra == 3) {
                System.out.println("Usted Agrego a su carrito de compra " + lista1.get(2).getNombreProducto());
                System.out.println(" ");
            }

        }

        private static void productoMaternal(){
            lista2.add(new productos(1, "Pañal Pampers Etapa 5", "Proteccion", "24 pañales $ 44.000"));
            lista2.add(new productos(2, "Crema antipañalitis tesura (110 g)", "Proteccion", "$ 14.400"));
            lista2.add(new productos(3, "Formula crecimiento Baby Etapa 3 ", "Alimentacion", "(900 g) $ 36.120"));
            for (int i = 0; i < lista2.size(); i++) {
                System.out.println(lista2.get(i).toString());
                System.out.println(" ");
            }
            System.out.println("----------------------------------------------------------");
            System.out.println("Seleccione el producto a comprar:");

            compra = capturaopcion();
            System.out.println(" ");
            if (compra == 1) {
                System.out.println("Usted Agrego a su carrito de compra " + lista2.get(0).getNombreProducto());
                System.out.println(" ");
            }
            if (compra == 2) {
                System.out.println("Usted Agrego a su carrito de compra " + lista2.get(1).getNombreProducto());
                System.out.println(" ");
            }
            if (compra == 3) {
                System.out.println("Usted Agrego a su carrito de compra " + lista2.get(2).getNombreProducto());
                System.out.println(" ");
    
            } 



        }

        private static void devolucion(List<productos> list){
            System.out.println( "1. Salud");
            System.out.println( "2. Cuidado personal");
            System.out.println( "3. Maternidad");
            System.out.println("Ingrese la seccion del producto a devolver");
            int seccion = capturaopcion();

            if (seccion == 1) {
                String[] nombreProductos = new String[3];
                nombreProductos[0] = "1.Entereogermina plus";
                nombreProductos[1] = "2. Dolex Gripa ";
                nombreProductos[2] = "3. Bion3";
                recorrerArray(nombreProductos);
            
            }
            

           if (seccion == 2){
            String[] nombreProductos = new String[3];
                nombreProductos[0] = "1. Crema Corporal Nivea";
                nombreProductos[1] = "2. Enjuague Bucal Colgate";
                nombreProductos[2] = "3. Desodorante Lady Speed Stick Crema";
                recorrerArray(nombreProductos);
            }


           if ( seccion == 3){
            String[] nombreProductos = new String[3];
                nombreProductos[0] = "1. Pañal Pampers Etapa 5";
                nombreProductos[1] = "2. Crema antipañalitis tesura";
                nombreProductos[2] = "3. Formula crecimiento Baby Etapa 3";
                recorrerArray(nombreProductos);

            }

        }
        public static void recorrerArray(String[] nombreProductos){
    
                 for (int i = 0; i < nombreProductos.length; i++) {
                    System.out.println(nombreProductos[i]);
                }
                System.out.println("Ingrese el producto a devolver");
                int opc = capturaopcion();
                if (opc ==1){
                    System.out.println(" Su devolucion es :" + nombreProductos[0]);
                    System.out.println(" Elija del menu un nuevo producto");
                    System.out.println(" ");
                    System.out.println("------------------------------------------");
                }
                if (opc ==2){
                    System.out.println(" Su devolucion es :" + nombreProductos[1]);
                    System.out.println(" Elija del menu un nuevo producto");
                    System.out.println(" ");
                    System.out.println("------------------------------------------");
                }
                if (opc ==3){
                    System.out.println(" Su devolucion es :" + nombreProductos[2]);
                    System.out.println(" Elija del menu un nuevo producto");
                    System.out.println(" ");
                    System.out.println("------------------------------------------");
                }

        }
    }












    
        
   
