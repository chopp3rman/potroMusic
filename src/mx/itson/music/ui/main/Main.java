
package mx.itson.music.ui.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import mx.itson.music.entidades.Artista;
import mx.itson.music.entidades.Canción;
import mx.itson.music.entidades.Álbum;
import mx.itson.music.enums.Género;

/**
 *
 * @author CHOPER
 */
public class Main 
{
    public static void main(String[] args) 
    {
        try{
        List<Artista> artistas = new ArrayList<>();
        List<Álbum> albumes = new ArrayList<>();
        List<Canción> canciones = new ArrayList<>();
        
        
        Artista artista = new Artista();
        
        artista.setNombre("Esperón");
        
        artista.setDescripcion("Akon (Aliaune Badara Thiam) es un cantante, compositor, productor, rapero, actor y empresario senegalés-estadounidense");
        
        artista.setSitioWeb("https://www.youtube.com/@Akon/videos");
        
        Álbum a = new Álbum();
        
        a.setArtista(artista);
                
        a.setNombre("Trouble");
        
        a.setLanzamiento(2005);
        
        a.setGénero(Género.OTRO);
        
        
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do 
        {
            System.out.println("------------Menu de opciones, arme la mejor playlist completamente a su gusto 7w7------------");
            System.out.println("1. Agregar artista/album/cancion");
            System.out.println("2. Eliminar cancion/album/artista");
            System.out.println("3. Buscar cancion/album/artista");
            System.out.println("4. Terminar accion");
            System.out.println("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion)
                { case 1:
                    System.out.println("-----------Esta en el menu de agregar en tu lista uwu-----------");
                    System.out.println(" 1. Artista/ 2. Album/ 3. Cancion");
                    System.out.println("Ingresa un numero del 1-3: ");
                    int eleccion = scanner.nextInt();
                    scanner.nextLine(); //consumamos el salto de linea en todos los nexInt 
                 
                    if (eleccion ==1)
                    {
                        
                        Artista artista2 = new Artista();
                        System.out.println("Ingrese el nombre del artista: ");
                        String nombre = scanner.nextLine();
                        artista2.setNombre(nombre);
                        System.out.println("Ingrese la descripcion del artista: ");
                        String descripcion = scanner.nextLine();
                        artista2.setDescripcion(descripcion);
                        System.out.println("Ingrese el sitio web: ");
                        String sitioWeb = scanner.nextLine();
                        artista2.setSitioWeb(sitioWeb);
                      
                       artistas.add(artista2);

                        System.out.println("El artista se agrego con exito. bien echo");
                        
                        
                    } else if (eleccion == 2)
                                {
                                    
                                Álbum album = new Álbum();
                                System.out.println("Ingresa el nombre del album: ");
                                String nombre = scanner.nextLine();
                                album.setNombre(nombre);
                                System.out.println("Ingresa el lanzamineto del album (Con numeros): ");
                                int lanzamiento = scanner.nextInt();
                                scanner.nextLine();
                                album.setLanzamiento(lanzamiento);
                                album.setGénero(Género.OTRO);
                                albumes.add(album);
                                System.out.println("El album se agrego con exito yupi");
                                
                                
                                } else if (eleccion ==3)
                                {
                                    Canción cancion = new Canción();
                                    System.out.println("Ingrese el nombre de la cancion: ");
                                    String nombre = scanner.nextLine();
                                    cancion.setNombre(nombre);
                                    System.out.println("Ingrese la duracion de la cancion (Con numeros): ");
                                    int duracion = scanner.nextInt();
                                    cancion.setDuracion(duracion);
                                    scanner.nextLine();
                                    System.out.println("Ingrese el orden en donde esta ubicada en el album (Con numeros): ");
                                    int orden = scanner.nextInt();
                                    cancion.setOrden(orden);
                                    scanner.nextLine();
                                    canciones.add(cancion);
                                    System.out.println("La cancion se agrego con exito. buen trabajo");
                                    
                                
                                } else{
                                    System.out.println("El dato ingresado no es valido intentelo de nuevo uwu");
                                }
                                    break;
                                    
                                    case 2:
                                        System.out.println("-----------Estas en el menu de eliminar de tu lista :( -----------");
                                        System.out.println(" 1. Artista/ 2. Album/ 3. Cancion");
                                        System.out.println("Ingresa un numero del 1-3: ");
                                         int eleccion2 = scanner.nextInt();
                                         scanner.nextLine();
                                         
                                         if (eleccion2 == 1)
                                         {
                                             
                                             System.out.println("Ingresa el nombre del artista que quieres eliminar: ");
                                             String nombreEliminar = scanner.nextLine();
                                             boolean eliminado = false;
                                             // Usar un iterator para eliminar el artista
                                             Iterator<Artista> iterator = artistas.iterator();
                                             while (iterator.hasNext())
                                             {
                                                 Artista artista2 = iterator.next();
                                                 // El .equalsIgnoreCase sirve para ignorar las mayusculas y minusculas.
                                                 if (artista2.getNombre().equalsIgnoreCase(nombreEliminar)) 
                                                 {
                                                     iterator.remove();
                                                     eliminado = true;
                                                     System.out.println("El artista se elimino correctamente :) ");
                                                     break;
                                                 }
                                             }
                                             if(!eliminado)
                                                {
                                                    System.out.println("Artista no encontrado");
                                                 }
                                         } else if (eleccion2 == 2)
                                                    {
                                                        
                                                        System.out.println("Ingresa el nombre del album que quieres eliminar:  ");
                                                        String nombreEliminar = scanner.nextLine();
                                                        boolean eliminado = false;
                                                        
                                                        Iterator<Álbum> iterator =albumes.iterator();
                                                        while (iterator.hasNext())
                                                        {
                                                            Álbum album = iterator.next();
                                                            if(album.getNombre().equalsIgnoreCase(nombreEliminar))
                                                            {
                                                                iterator.remove();
                                                                eliminado = true;
                                                                System.out.println("El album se elimino correctamente : [ ");
                                                                break;
                                                                        
                                                            }
                                                            
                                                        } if(!eliminado)
                                                                {
                                                                    System.out.println("Album no encontrado");
                                                            
                                                                }
                                             
                                                    } else if (eleccion2 == 3)
                                                                    {
                                                                        System.out.println("Ingrese el nombre de la cancion que quiere eliminar: ");
                                                                        String nombreEliminar = scanner.nextLine();
                                                                        boolean eliminado = false;
                                                                        
                                                                        Iterator<Canción> iterator = canciones.iterator();
                                                                        while (iterator.hasNext());
                                                                        {
                                                                            Canción cancion = iterator.next();
                                                                            if(cancion.getNombre().equalsIgnoreCase(nombreEliminar))
                                                                            {
                                                                                iterator.remove();
                                                                                eliminado = true;
                                                                                System.out.println("La cancion se elimino correctamente 7w7");
                                                                                break;
                                                                                
                                                                            }
                                                                        
                                                                        } if(!eliminado)
                                                                            {
                                                                                System.out.println("Cancion no encontrada");
                                                                                
                                                                            
                                                                            }
                                                        
                                                                    } else {
                                                                                 System.out.println("El dato ingresado no es valido intete denuevo unu");
                                                        
                                                                              }
                                    case 3:
                                         System.out.println("-----------Esta en el menu de buscar en tu lista uwu-----------");
                                         System.out.println(" 1. Artista/ 2. Album/ 3. Cancion");
                                         System.out.println("Ingresa un numero del 1-3: ");
                                         int eleccion3 = scanner.nextInt();
                                         scanner.nextLine();
                                         
                                         if(eleccion3 ==1)
                                         {
                                             System.out.println("Ingresa el nombre del artista que quieres buscar: ");
                                             String nombreBuscar = scanner.nextLine();
                                             boolean encontrado = false;
                                             
                                             for(Artista artista2 : artistas)
                                             {
                                                 if(artista2.getNombre().equalsIgnoreCase(nombreBuscar)){
                                                     System.out.println("Artista encontrado :D");
                                                     System.out.println(artista2);
                                                     encontrado = true;
                                                     break;
                                                 }
                                                 
                                             } if(!encontrado)
                                                    {
                                                        System.out.println("Artista no encontrado");
                                                 
                                                    }
                                                 
                                             } else if(eleccion3 == 2)
                                             {
                                                 System.out.println("Ingrese el nombre del album que quiere buscar :D");
                                                 String nombreBuscar = scanner.nextLine();
                                                 boolean encontrado = false;
                                                 
                                                 for (Álbum album : albumes)
                                                    {
                                                        if(album.getNombre().equalsIgnoreCase(nombreBuscar))
                                                        {
                                                            System.out.println("Album encontrado enorabuena :D");
                                                            System.out.println(album);
                                                            encontrado = true;
                                                            break;             
                                                        }
                                                     
                                                    } if(!encontrado)
                                                            {
                                                                System.out.println("Album no encontrado");
                                                        
                                                            }
                                             } else if(eleccion3 == 3)
                                             {
                                                 System.out.println("Ingrese el nombre de la cancion que quiere buscar: ");
                                                 String nombreBuscar = scanner.nextLine();
                                                 boolean encontrado = false;
                                                 
                                                 for (Canción cancion: canciones)
                                                 {
                                                     if(cancion.getNombre().equalsIgnoreCase(nombreBuscar))
                                                     {
                                                         System.out.println("Cancion encontrado yupiii");
                                                         System.out.println(cancion);
                                                         encontrado = true;
                                                         break;
                                                         
                                                     }
                                                     
                                                 } if(!encontrado)
                                                        {
                                                            System.out.println("Cancion no encontrada");
                                                     
                                                        }
                                             } else
                                                    {
                                                        System.out.println("El dato ingresado no es valido, por favor lea bien las instrucciones e intente denuevo unu");
                                                 
                                                    }
                                    case 4:
                                        System.out.println("terminando la accion");
                                        break;
                                        
                                        
                                         }
                                }while (opcion !=4);
                        
                    
                    
                } catch(Exception ex)
                    {
                        System.out.println("El dato ingresado no es valido intete denuevo");
                    
                    }
}     
}    

