package com.develcom.servicios.herramientas;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class UtilitarioFecha {

    private SimpleDateFormat sdf;
    private Date date;

    public String tomarFecha(String formato) {
        Calendar calendar = new GregorianCalendar();

        sdf = new SimpleDateFormat(formato);
        String fecha = sdf.format(calendar.getTime());
        return fecha;
    }

    public String convertLongDate(long time) {
        String resp;

        date = new Date(time);
        //sdf = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");
        sdf = new SimpleDateFormat("dd/MM/yyyy - kk:mm:ss");
        resp = sdf.format(date.getTime());
        return resp;
    }

}
