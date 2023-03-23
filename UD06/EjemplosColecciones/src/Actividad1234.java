import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Actividad1234 {
    
    static Map<LocalDate, List<Registro>> regDiasTemp = new LinkedHashMap<>(); 

    public static void main(String[] args) {

        List<Registro> lRegistros = new ArrayList<>();
        lRegistros.add(new Registro(10.0, LocalTime.of(8, 10)));
        lRegistros.add(new Registro(14.0, LocalTime.of(11, 30)));
        lRegistros.add(new Registro(16.0, LocalTime.of(14, 30)));

        regDiasTemp.put(LocalDate.of(2023, 03, 22), lRegistros);

        List<Registro> lRegistros2 = new ArrayList<>();
        lRegistros2.add(new Registro(8.0, LocalTime.of(8, 10)));
        lRegistros2.add(new Registro(11.0, LocalTime.of(11, 30)));
        lRegistros2.add(new Registro(13.0, LocalTime.of(14, 30)));

        regDiasTemp.put(LocalDate.of(2023, 03, 23), lRegistros2);

        System.out.println(regDiasTemp);

        verTemperaturasDia(LocalDate.of(2023, 03, 23));

    }



}
