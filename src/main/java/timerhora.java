
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author a1013343
 */
public class timerhora extends TimerTask {

    private final Date horaAtual = new Date();
    private final SimpleDateFormat sdf = new SimpleDateFormat("'Hora:' HH:mm:ss");

    @Override
    public void run() {
        horaAtual.setTime(System.currentTimeMillis());
        System.out.println(sdf.format(horaAtual));
        if(horaAtual.getMinutes()%2==0) {
            
        }
    }

}
