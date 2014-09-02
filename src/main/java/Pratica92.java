
import java.io.IOException;
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

	private static final long MINUTO_CHEIO = 60000; // 60s
	private static final long INTERVALO_CHEIO = 60000; // 60s
	private static final SimpleDateFormat sdf = new SimpleDateFormat("'Hora atual:' HH:mm:ss");

	public static void main(String[] args) throws IOException {

		System.out.println("inicio: " + sdf.format(new Date()));
		long atraso = MINUTO_CHEIO - new Date().getTime() % MINUTO_CHEIO;

		Timer timerM = new Timer("timer-minuto");
		Timer timerImpar = new Timer("timer-munuto-impar");

		timerM.scheduleAtFixedRate(new TimerHoraTask(timerImpar), atraso, INTERVALO_CHEIO);

		System.in.read();
		timerImpar.cancel();
		timerM.cancel();

		System.out.println("hora de termino: " + sdf.format(new Date()));
	}
}
