package Ejercicio1.folder;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

/**
 *
 * @author Hansy Gonzalez
 * @author Marcell Granados
 */
public class Status {

    private StatusEnum status;
    private GregorianCalendar date;

    public Status(GregorianCalendar date) {
        this.status = StatusEnum.PROCESS_WAITING;
        this.date = date;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public GregorianCalendar getDate() {
        return date;
    }

    public void setDate(GregorianCalendar date) {
        this.date = date;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy – mm:ss:S");
        return "Estado: " + status.getDescription() + ", fecha: " + dateFormat.format(date.getTime());
    }

    public boolean updateStatus() {
        status = status.getNext();
        date = new GregorianCalendar();
        return status.hasNext();
    }
}
