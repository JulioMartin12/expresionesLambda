import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class main {

    public static void main(String[] args) {
        List<String> listaString = Arrays.asList("Hola", "contento", "viaje", "trabajo");
     Transformador transformadorMayuscula= string -> string.stream().map(a-> a.toUpperCase()).collect(Collectors.toList());
        List<String> listaMayusculas=transformadorMayuscula.UpperString(listaString);
        System.out.println(listaMayusculas);
    }


}
//TRANSFORMADOR
//        Implemente un método que reciba como parámetro una lista de strings y una interfaz
//        funcional que transforme cada String de la lista en mayúsculas. El método debe devolver un
//        nuevo listado de String transformados.