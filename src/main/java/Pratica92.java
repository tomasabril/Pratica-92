
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná DAINF - Departamento
 * Acadêmico de Informática IF62C - Fundamentos de Programação 2
 *
 *
 * @author Tomas Abril
 */
public class Pratica92 {

    private static final long HORA_CHEIA = 60000; // 60s
    private static final long INTERVALO_CHEIO = 60000; // 60s
    private static final SimpleDateFormat sdf = new SimpleDateFormat("'Hora atual:' HH:mm:ss");

    public static void main(String[] args) {
        System.out.println("Olá, Java!");
        System.out.println(sdf.format(new Date()));
        long atraso = HORA_CHEIA - new Date().getTime() % HORA_CHEIA;

        Timer timerM = new Timer("timer-minuto");
        timerM.scheduleAtFixedRate(new timerhora(), atraso, INTERVALO_CHEIO/12);
        
        
    }
}
