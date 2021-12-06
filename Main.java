import TPFinalP2.Bicicleta;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        FileOutputStream fileOutputStream = new FileOutputStream("Listado Bicicletas.dat");
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
        int choice, i, opt,  mod, op, marca, choice2, opcion = 0,  cambios, rodado, tipo;
        String finalizar = "";
        String continuarCambios = "";
        LinkedList<Bicicleta> list = new LinkedList<>();
        Marcas[] marcas = Marcas.values();

        System.out.println("=========================================");
        System.out.println("||Bienvenido a Bicicleteria Juan Carlo ||");
        System.out.println("=========================================");

        do{
            try{
                System.out.println("Introduzca una opcion");
                System.out.println("1 ==> AGREGAR\n2 ==> BUSCAR\n3 ==> ELIMINAR\n4 ==> IMPRIMIR LISTA DE BICIS\n5 ==> MODIFICAR\n6 ==> SALIR");
                System.out.print("OPCION: ");
                opt = in.nextInt();
                switch(opt){
                    case 1 -> {
                        System.out.println("Selecciono la opcion <<AGREGAR>>");
                        Bicicleta bici = new Bicicleta();
                        i = 3;
                        do{
                            try{
                                System.out.println("Por Favor seleccione el tipo");
                                System.out.print("1 => " + marcas[5] + "\n2 => " + marcas[6] + "\n3 => " + marcas[7] + "\n4 => " + marcas[8] + "\n**Opcion**: ");
                                tipo = in.nextInt();
                                if(tipo > 0 && tipo < 5){
                                    bici.setTipo(tipo);
                                    break;
                                }else{
                                    i--;
                                    System.out.println("Opcion incorrecta, le quedan " + i + " intentos");
                                }
                            }catch(InputMismatchException e){
                                i--;
                                System.out.println("Debe introducir una opcion válida, quedan " + i + " intentos");
                                System.out.println("Error ==> " + e);
                                in.nextLine();
                            }
                            if(i == 0){
                                System.out.println("Se superaron los intentos, se le asignara el tipo MTB");
                                tipo = 1;
                                bici.setTipo(tipo);
                            }
                        }
                        while(i >= 1);
                        i = 3;
                        do{
                            try{
                                System.out.println("Por favor elija su rodado");
                                System.out.print("1 => 26\n2 => 27.5\n3 => 29\n");
                                System.out.print("OPCION: ");
                                rodado = in.nextInt();
                                if(rodado > 0 && rodado < 4){
                                    bici.setRodado(rodado);
                                    break;
                                }else{
                                    i--;
                                    System.out.println("Debe introducir una opcion válida, quedan " + i + " intentos");
                                }
                            }catch(InputMismatchException e){
                                i--;
                                System.out.println("Debe introducir una opcion válida, quedan " + i + " intentos");
                                System.out.println("Error ==> " + e);
                                in.nextLine();
                            }
                            if(i == 0){
                                System.out.println("Se superaron los intentos, se le asignara el rodado 29");
                                rodado = 3;
                                bici.setRodado(rodado);
                            }
                        }
                        while(i >= 1);
                        i = 3;
                        do{
                            try{
                                System.out.println("Por favor elija la Marca");
                                for(i = 0; i < 5; i++) System.out.println((i + 1) + " => " + marcas[i]);
                                System.out.print("OPCION: ");
                                choice = in.nextInt();
                                if(choice > 0 && choice < 6){
                                    bici.setMarca(choice);
                                    break;
                                }else{
                                    i--;
                                    System.out.println("Debe introducir una opcion válida, quedan " + i + " intentos");
                                }
                            }catch(InputMismatchException e){
                                i--;
                                System.out.println("Debe introducir una opcion válida, quedan " + i + " intentos");
                                System.out.println("Error ==> " + e);
                                in.nextLine();
                            }
                            if(i == 0){
                                System.out.println("Se superaron los intentos, se le asignara la marca SLP");
                                choice = 1;
                                bici.setMarca(choice);
                            }
                        }
                        while(i >= 1);
                        i = 3;
                        do{
                            try{
                                System.out.println("Por favor digite la cantidad de cambios deseados");
                                System.out.print("1 => 21\n2 => 27\n3 => 33\n**Opcion**: ");
                                cambios = in.nextInt();
                                if(cambios > 0 && cambios < 4){
                                    bici.setCambios(cambios);
                                    break;
                                }else{
                                    i--;
                                    System.out.println("Debe introducir una opcion válida, quedan " + i + " intentos");
                                }
                            }catch(InputMismatchException e){
                                i--;
                                System.out.println("Debe introducir una opcion válida, quedan " + i + " intentos");
                                System.out.println("Error ==> " + e);
                                in.nextLine();
                            }
                            if(i == 0){
                                System.out.println("Se superaron los intentos, se le asignara 33 cambios");
                                cambios = 3;
                                bici.setCambios(cambios);
                            }
                        }
                        while(i >= 1);
                        i = 3;
                        do{
                            try{
                                System.out.println("Por ultimo elija el tamaño de su cuadro");
                                System.out.print("1 => " + marcas[9] + "\n2 => " + marcas[10] + "\n3 => " + marcas[11] + "\n4 => " + marcas[12] + "\n5 => " + marcas[13] + "\n**Opcion**: ");
                                choice2 = in.nextInt();
                                if(choice2 > 0 && choice2 < 6){
                                    bici.setCuadro(choice2);
                                    break;
                                }else{
                                    i--;
                                    System.out.println("Debe introducir una opcion válida, quedan " + i + " intentos");
                                }
                            }catch(InputMismatchException e){
                                i--;
                                System.out.println("Debe introducir una opcion válida, quedan " + i + " intentos");
                                System.out.println("Error ==> " + e);
                                in.nextLine();
                            }
                            if(i == 0){
                                System.out.println("Se superaron los intentos, se le asignara el cuadro XL");
                                choice2 = 5;
                                bici.setCuadro(choice2);
                            }
                        }
                        while(i >= 1);
                        i = 2;
                        do{
                            try{
                                System.out.println("Estos son los datos de su bicicleta\n" + bici +
                                        "\nsi son correctos marque 1 para agregar a la lista de su pedido\n" +
                                        "de lo contrario presione 2 para reiniciar el proceso");
                                System.out.print("**Opcion**: ");
                                opcion = in.nextInt();
                                if(opcion == 1){
                                    list.add(bici);
                                    break;
                                }else if(opcion == 2) break;
                                else break;
                            }catch(Exception e){
                                i--;
                                System.out.println("Debe intruducir una opcion valida  <<error>> " + e);
                                System.out.println("Por Favor reintente");
                                in.nextLine();
                            }
                            if(i == 0){
                                System.out.println("Se superaron los intentos, se reinicia el sistema");
                                break;
                            }
                        }
                        while(opcion != 2);
                    }
                    case 2 -> {
                        System.out.println("Selecciono la opcion <<BUSCAR>>");
                        i = 3;
                        do{
                            try{
                                System.out.println("Por favor ingrese la marca de la bicicleta a <<BUSCAR>>");
                                for(i = 0; i < 5; i++) System.out.println((i + 1) + " => " + marcas[i]);
                                System.out.print("OPCION: ");
                                choice = in.nextInt();
                                Bicicleta aux = new Bicicleta();
                                aux.setMarca(choice);
                                boolean flag = false;
                                if(choice > 0 && choice < 6){
                                    if(list.isEmpty()){
                                        System.out.println("La lista esta vacia");
                                        break;
                                    }
                                    if(list.size() > 0){
                                        for(i = 0; i < list.size(); i++){
                                            if(aux.equals(list.get(i))){
                                                System.out.println("Bicicleta <<" + (i + 1) + ">> " + list.get(i).toString());
                                                flag = true;
                                            }
                                        }
                                    }
                                    if(! flag){
                                        System.out.println("No se encontro la marca solicitada dentro de la lista");
                                        break;
                                    }
                                }else{
                                    i--;
                                    System.out.println("Opcion incorrecta, quedan " + i + " intentos, reintente");
                                }
                            }catch(InputMismatchException e){
                                i--;
                                System.out.println("Debe introducir una opcion válida, quedan " + i + " intentos");
                                System.out.println("Error ==> " + e);
                                in.nextLine();
                            }
                        }
                        while(i >= 1);
                    }
                    case 3 -> {
                        i = 3;
                        do{
                            try{
                                System.out.println("Por favor ingrese la marca de la bicicleta a <<ELIMINAR>>");
                                for(i = 0; i < 5; i++) System.out.println((i + 1) + " => " + marcas[i]);
                                System.out.print("OPCION: ");
                                choice = in.nextInt();
                                Bicicleta aux = new Bicicleta();
                                aux.setMarca(choice);
                                boolean flag = false;
                                if(choice > 0 && choice < 6){
                                    if(list.size() == 0){
                                        System.out.println("La lista esta vacia");
                                        break;
                                    }else if(list.size() > 0){
                                        for(i = 0; i < list.size(); i++){
                                            if(aux.equals(list.get(i))){
                                                System.out.println("Bicicleta <<" + (i + 1) + ">> " + list.get(i).toString());
                                                flag = true;
                                            }
                                        }
                                        if(flag){
                                            try{
                                                System.out.println("Seleccione con el numero indicado, cual Bicicleta desea eliminar: ");
                                                choice = in.nextInt();
                                                list.remove((choice - 1));
                                                System.out.println("Emininando el elemento...");
                                            }catch(IndexOutOfBoundsException e){
                                                System.out.println("Debe introducir una opcion válida");
                                                System.out.println("Error ==> " + e);
                                                in.nextLine();
                                            }
                                        }else System.out.println("Elemento no encontrado dentro de la lista");
                                        break;
                                    }
                                }else{
                                    i--;
                                    System.out.println("Opcion incorrecta, quedan " + i + " intentos, reintente");
                                }
                            }catch(InputMismatchException e){
                                i--;
                                System.out.println("Debe introducir una opcion válida, quedan " + i + " intentos");
                                System.out.println("Error ==> " + e);
                                in.nextLine();
                            }
                            if(i == 0){
                                System.out.println("Se superaron los intentos");
                                break;
                            }
                        }
                        while(i >= 1);
                    }
                    case 4 -> {
                        if(list.size() <= 0){
                            System.out.println("Lista de Bicicletas vacias");
                        }else{
                            System.out.println("Imprimiendo Bicicletas cargadas");
                            for(Bicicleta iterator : list){
                                System.out.println(iterator);
                            }
                        }
                    }
                    case 5 -> {
                        System.out.println("Selecciono la opcion de <<MODIFICAR>>");
                        do{
                            try{
                                if(list.size() == 0){
                                    System.out.println("La lista se encuentra vacia");
                                    break;
                                }
                                else if(list.size() > 0){
                                    System.out.println("Bicicletas cargadas a la lista");
                                    for(i = 0; i < list.size(); i++){
                                        System.out.println("Bici N° <<"+(i+1)+">> ==> "+list.get(i));
                                    }
                                    System.out.println("Seleccione la Bicicleta que desea modificar");
                                    mod = in.nextInt();//mod tiene la posicion +1 del objeto bici dentro de list
                                    System.out.println("Que desea modificar?");
                                    System.out.print("1: MARCA\n2: TIPO\n3: CUADRO\n4: CAMBIOS\n5: RODADO\n6: EXIT\nOpcion: ");
                                    op = in.nextInt();
                                    switch(op){
                                        case 1 ->{
                                            System.out.println("Selccione la Marca a reemplazar");
                                            for(i = 0; i < 5; i++){
                                                System.out.println("<<"+(i+1)+">> "+marcas[i]);
                                            }
                                            marca = in.nextInt();
                                            list.get((mod-1)).setMarca(marca);
                                            System.out.println("Cambios realizados");
                                            do{
                                                System.out.println("Desea realizar otros cambios? <<S>> o <<N>>");
                                                continuarCambios = in.next();
                                                continuarCambios = continuarCambios.toLowerCase();
                                                if(continuarCambios.equals("s")){
                                                    System.out.println("Volviendo al menu");
                                                    break;
                                                }
                                                else if(continuarCambios.equals("n")){
                                                    break;
                                                }
                                                else System.out.println("Opcion incorrecta");
                                            }
                                            while(!continuarCambios.equals("s") || !continuarCambios.equals("n"));
                                        }
                                        case 2 ->{
                                            System.out.println("Seleccione el Tipo a reemplazar");
                                            for(i = 5; i < 9; i++){
                                                System.out.println("<<"+(i-4)+">> "+marcas[i]);
                                            }
                                            marca = in.nextInt();
                                            list.get((mod-1)).setTipo(marca);
                                            System.out.println("Cambios realizados");
                                            do{
                                                System.out.println("Desea realizar otros cambios? <<S>> o <<N>>");
                                                continuarCambios = in.next();
                                                continuarCambios = continuarCambios.toLowerCase();
                                                if(continuarCambios.equals("s")){
                                                    System.out.println("Volviendo al menu");
                                                    break;
                                                }
                                                else if(continuarCambios.equals("n")){
                                                    break;
                                                }
                                                else System.out.println("Opcion incorrecta");
                                            }
                                            while(!continuarCambios.equals("s") || !continuarCambios.equals("n"));
                                        }
                                        case 3 ->{
                                            System.out.println("Seleccione el cuadro a reemplazar");
                                            for(i = 9; i < 14; i++){
                                                System.out.println("<<"+(i-8)+">> "+marcas[i]);
                                            }
                                            marca = in.nextInt();
                                            list.get((mod-1)).setCuadro(marca);
                                            System.out.println("Cambios realizados");
                                            do{
                                                System.out.println("Desea realizar otros cambios? <<S>> o <<N>>");
                                                continuarCambios = in.next();
                                                continuarCambios = continuarCambios.toLowerCase();
                                                if(continuarCambios.equals("s")){
                                                    System.out.println("Volviendo al menu");
                                                    break;
                                                }
                                                else if(continuarCambios.equals("n")){
                                                    break;
                                                }
                                                else System.out.println("Opcion incorrecta");
                                            }
                                            while(!continuarCambios.equals("s") || !continuarCambios.equals("n"));
                                        }
                                        case 4 ->{
                                            System.out.println("Seleccione el cambio a reemplazar");
                                            System.out.print("1 => 21\n2 => 27\n3 => 33\n**Opcion**: ");
                                            marca = in.nextInt();
                                            list.get((mod-1)).setCambios(marca);
                                            System.out.println("Cambios realizados");
                                            do{
                                                System.out.println("Desea realizar otros cambios? <<S>> o <<N>>");
                                                continuarCambios = in.next();
                                                continuarCambios = continuarCambios.toLowerCase();
                                                if(continuarCambios.equals("s")){
                                                    System.out.println("Volviendo al menu");
                                                    break;
                                                }
                                                else if(continuarCambios.equals("n")){
                                                    break;
                                                }
                                                else System.out.println("Opcion incorrecta");
                                            }
                                            while(!continuarCambios.equals("s") || !continuarCambios.equals("n"));
                                        }
                                        case 5 ->{
                                            System.out.println("Seleccione el Rodado a reemplazar");
                                            System.out.print("1 => 26\n2 => 27.5\n3 => 29\n");
                                            marca = in.nextInt();
                                            list.get((mod-1)).setCambios(marca);
                                            System.out.println("Cambios realizados");
                                            do{
                                                System.out.println("Desea realizar otros cambios? <<S>> o <<N>>");
                                                continuarCambios = in.next();
                                                continuarCambios = continuarCambios.toLowerCase();
                                                if(continuarCambios.equals("s")){
                                                    System.out.println("Volviendo al menu");
                                                    break;
                                                }
                                                else if(continuarCambios.equals("n")){
                                                    break;
                                                }
                                                else System.out.println("Opcion incorrecta");
                                            }
                                            while(!continuarCambios.equals("s") || !continuarCambios.equals("n"));
                                        }
                                        case 6 -> System.out.println("Saliendo...");
                                        default -> System.out.println("Opcion incorrecta");
                                    }
                                }
                            }catch(InputMismatchException e){
                                System.out.println("Error ==> "+e);
                            }
                        }
                        while(!continuarCambios.equals("n"));
                    }
                    case 6 -> {
                        System.out.println("Gracias por utilizar nuestros servicios");
                        return;
                    }
                    default -> System.out.println("Introduzca una opcion valida");
                }
            }catch(InputMismatchException e){
                System.out.println("Debe introducir una opcion válida");
                System.out.println("Error ==> " + e);
                in.nextLine();
            }
            do{
                try{
                    System.out.println("Desea realizar otra operacion?<<S>> o <<N>>");
                    finalizar = in.next();
                    finalizar = finalizar.toLowerCase();
                    if(finalizar.equals("s")){
                        System.out.println("Comencemos de nuevo :D");
                        break;
                    }else if(finalizar.equals("n")){
                        outputStream.writeObject(list);
                        outputStream.close();
                        break;
                    }else System.out.println("Error, opcion incorrecta");
                }catch(InputMismatchException | IOException e){
                    System.out.println("Error ==> " + e);
                    in.nextLine();
                }
            }
            while(! finalizar.equals("s") || ! finalizar.equals("n"));
        }
        while(! finalizar.equals("n"));
        System.out.println("Gracias por utilizar nuestros servicios de pedidos de Bicicletas, vuelva pronto!!");
    }
}