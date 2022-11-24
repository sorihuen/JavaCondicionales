import java.util.Scanner;

public class Tema10 {
    private static Scanner sc = new Scanner(System.in);
    String nombre, apellido, numIdentificacion;
    Cuenta cuentas[];
    Cliente cliente;
    int numeroCuenta, cantidadCuentas;
    int opcion, indiceNumeroCuentas;
    double saldo, cantidadDinero;

    public void Banco() {

      System.out.println(" Ingrese el nombre del Cliente:");
      nombre = sc.nextLine();
      System.out.println(" Ingrese el apellido del Cliente:");
      apellido = sc.nextLine();
      System.out.println(" Ingrese el numero de Identificacion:");
      numIdentificacion = sc.nextLine();
      System.out.println(" Ingrese la cantidad de cuentas que tiene el cliente:");
      cantidadCuentas = capturaopcion();
      System.out.println(" ");

      cuentas = new Cuenta[cantidadCuentas];

      for(int i = 0 ; i < cuentas.length; i ++){

        System.out.println("Ingrese la " + (i + 1)+ " cuenta:");
        System.out.println(" Ingrese el numero de cuenta:");
        numeroCuenta = sc.nextInt();

        System.out.println(" Ingrese el saldo de la cuenta:");
        saldo =  sc.nextDouble();
        System.out.println(" ");
        cuentas[i] = new Cuenta(numeroCuenta, saldo);


      }
      cliente = new Cliente(nombre,apellido,numIdentificacion,cuentas);

      do{
        System.out.println("---------- MENU -------------");
        System.out.println(" [1]. Ingresar saldo");
        System.out.println(" [2]. Retirar saldo");
        System.out.println(" [3]. Consultar saldo de la cuenta");
        System.out.println(" [0]. Salir del Sistema");
        System.out.println("--------------------------------");
        System.out.println(" Digite una opcion");
        opcion =  sc.nextInt();

        switch (opcion){
            case 1:
               System.out.println(" Digite el numero de cuenta");
               numeroCuenta = sc.nextInt();
               indiceNumeroCuentas = buscarNumeroDeCuenta(cuentas, numeroCuenta);

               if (indiceNumeroCuentas ==-1){
                System.out.println("Cuenta no encontrada, verifique su numero de cuenta"); 
                System.out.println(" ");
               }else{
                System.out.println(" Ingrese la cantidad de Dinero a depositar");
                cantidadDinero = sc. nextDouble();

                cliente. ingresarDinero(indiceNumeroCuentas, cantidadDinero);
                System.out.println(" ==== Deposito Exitoso ====");
                System.out.println(" Saldo Disponible: " + cliente.consultarSaldo(indiceNumeroCuentas));

               }
              
            break;

            case 2:
              System.out.println(" Digite el numero de cuenta");
               numeroCuenta = sc.nextInt();
               indiceNumeroCuentas = buscarNumeroDeCuenta(cuentas, numeroCuenta);

               if(indiceNumeroCuentas == -1){
                 System.out.println("No exite una cuenta con ese numero"); 
                 System.out.println(" "); 
                }
                else{
                    System.out.println("Ingrese la cantidad a retirar"); 
                    cantidadDinero = sc.nextDouble();

                    if (cliente.consultarSaldo(indiceNumeroCuentas) < cantidadDinero){
                        System.out.println(" ==== Saldo Insuficiente ===");
                        System.out.println(" "); 
                    
                       
                    }else{
                        cliente.retirarDinero(indiceNumeroCuentas, cantidadDinero);
                        System.out.println(" ");
                        System.out.println(" ==== Retiro con Exito ===");
                        System.out.println(" Saldo Disponible: " + cliente.consultarSaldo(indiceNumeroCuentas));
                        System.out.println(" "); 


                       
                    }


                }


             
            break;

            case 3:
             System.out.println(" Digite el numero de cuenta");
             numeroCuenta = sc.nextInt();
             indiceNumeroCuentas = buscarNumeroDeCuenta(cuentas, numeroCuenta);

             if(indiceNumeroCuentas == -1){
               System.out.println("No exite una cuenta con ese numero"); 
               System.out.println(" "); 
             }else{
                System.out.println("Saldo Disponible: " + cliente.consultarSaldo(indiceNumeroCuentas));
                System.out.println(" ");
             }
              
            break;

            case 0:
            System.out.println(" ====== Saliendo del Sistema =======");
            opcion = 0;
            System.out.println(" ");
        
        
            break;

            default:
            System.out.println(" ---------- Opcion Invalida ---------");
        




        }



      }while(opcion!=0);


    }
    private static int capturaopcion(){
       
        return Integer.parseInt(sc.nextLine());

    }
 
    public static int buscarNumeroDeCuenta(Cuenta cuentas[], int numeroAbuscar){
        int indice = 0;
        int iterador = 0;
        boolean numeroEncontrado = false;

        while((iterador < cuentas.length)  &&  (numeroEncontrado == false)){
            if (cuentas [iterador]. getNumeroCuenta() == numeroAbuscar){
                numeroEncontrado = true;
                indice = iterador;

            }
            iterador ++;

        }
        if ( numeroEncontrado == false){
            indice =-1;
        }
        return indice;


    }

   


    




}
   
        







    















  
    
