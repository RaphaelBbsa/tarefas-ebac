package Módulos.mod22.stream;

import java.awt.*;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class CriandoStream {

    public static void main(String[] args) {
        Stream <String> exemplo1 = List.of("Rapha", "Luan").stream();

        Map <Integer, String> map1 = Map.of(1,"Rapha",2,"King" );
        Stream<Integer> chaves = map1.keySet().stream();
        Stream <String> valores = map1.values().stream();


    }
}
