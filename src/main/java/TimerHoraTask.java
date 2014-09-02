
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author a1013343 Tomás Abril
 */
public class TimerHoraTask extends TimerTask {

	private final Date horaAtual = new Date();
	private final SimpleDateFormat sdf = new SimpleDateFormat("'Hora:' HH:mm:ss");
	private final Timer timerImpar;
	private TimerTask imparTask;

	public TimerHoraTask(Timer timerminutoimpar) {
		this.timerImpar = timerminutoimpar;
	}

	@Override
	public void run() {
		horaAtual.setTime(System.currentTimeMillis());
		System.out.println(sdf.format(horaAtual));
		if ((horaAtual.getTime() % 120000) >= 60000) {
			imparTask = new TimerImparTask();
			timerImpar.scheduleAtFixedRate(imparTask, 0, 10000);

		} else {
			if (imparTask != null) {
				imparTask.cancel();
			}
		}
	}

}
