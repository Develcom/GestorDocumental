package com.develcom.herramientas.codificacion;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class CodDecodArchivos {

    private static final Logger LOG = LoggerFactory.getLogger(CodDecodArchivos.class);

    /**
     * Decodifica un archivo
     *
     * @param rutaArchivoCodificado Ruta del archivo codificado
     * @param rutaArchivoDeco Ruta del archivo decodificado
     */
    public void decodificar(String rutaArchivoCodificado, String rutaArchivoDeco) {

//        traza.info("descodificar " + rutaArchivoCod + " en  " + rutaArchivoDeco);
        byte[] buffer;
        InputStream in;
        BufferedOutputStream bos;
        File archivoCod = new File(rutaArchivoCodificado);
        File archivoDecodificado = new File(rutaArchivoDeco);
        int len;
        long t1, t2, dif;
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSS");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT+0"));
        Calendar tiempoInicio = Calendar.getInstance();
        //Calendar tiempoDiferencia = Calendar.getInstance();
        Calendar tiempoFinal;
        GregorianCalendar tiempoF = new GregorianCalendar();
        GregorianCalendar tiempoI = new GregorianCalendar();

        try {
            t1 = tiempoInicio.getTimeInMillis();
            tiempoI.setTimeInMillis(t1);
            
            in = new Base64API.InputStream(new FileInputStream(rutaArchivoCodificado));
            bos = new BufferedOutputStream(new FileOutputStream(archivoDecodificado));
            
            LOG.info("tamaño del archivo " + archivoCod.getName() + " " + archivoCod.length() / 1024 + " kilobytes");
            LOG.info("Decodificando...  " + sdf.format(tiempoI.getTime()));
            
//             buffer = new byte[3];
             buffer = new byte[10485760];
//            for (int n = in.read(buffer); n > 0; n = in.read(buffer)) {
//                bos.write(buffer);
//            }
            while ((len = in.read(buffer)) > 0) {
                bos.write(buffer, 0, len);
            }
            bos.close();
            in.close();

            tiempoFinal = Calendar.getInstance();
            t2 = tiempoFinal.getTimeInMillis();
            dif = t2 - t1;
            tiempoF.setTimeInMillis(dif);

            LOG.info("Tiempo de conversión total de decodificación fue " + sdf.format(tiempoF.getTime()));

            LOG.info("tamaño del archivo " + archivoDecodificado.getName() + " " + archivoDecodificado.length() + " bytes");
        } catch (FileNotFoundException e) {
            LOG.error("error archivo no encontrado en la decodificacion", e);
        } catch (IOException e) {
            LOG.error("error de entrada salida en la decodificacion", e);
        }
    }

    /**
     * Codifica un archivo
     *
     * @param rutaArchivoDeco Ruta del archivo decodificado
     * @param rutaArchivoCod Ruta del archivo codificado
     */
    public void codificar(String rutaArchivoDeco, String rutaArchivoCod) {

        LOG.info("codificando el archivo " + rutaArchivoDeco + " en el archivo " + rutaArchivoCod);

        OutputStream out;
        BufferedInputStream bis;
        File fileDeco = new File(rutaArchivoDeco);
        File fileCod = new File(rutaArchivoCod);

        long t1, t2, dif;
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSS");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT+0"));
        Calendar tiempoInicio = Calendar.getInstance();
        //Calendar tiempoDiferencia = Calendar.getInstance();
        Calendar tiempoFinal;
        GregorianCalendar tiempo = new GregorianCalendar();

        try {
            t1 = tiempoInicio.getTimeInMillis();

            out = new Base64API.OutputStream(new FileOutputStream(rutaArchivoCod));
            //BufferedWriter out = new BufferedWriter(new FileWriter(System.getProperty("user.home")+"/prueba.txt"));

            LOG.info("tamaño del archivo " + fileDeco.getName() + " " + fileDeco.length() / 1024 + " kilobytes");
            bis = new BufferedInputStream(new FileInputStream(fileDeco));
            int bytes = (int) fileDeco.length();
            //byte[] buffer = new byte[8192];
            byte[] buffer = new byte[bytes];
            bis.read(buffer);

            LOG.info("Codificando: " + fileDeco.getName());
            out.write(buffer);
            out.close();
            bis.close();

            tiempoFinal = Calendar.getInstance();
            t2 = tiempoFinal.getTimeInMillis();
            dif = t2 - t1;
            tiempo.setTimeInMillis(dif);

            LOG.info("Tiempo de conversión total de decodificación fue " + sdf.format(tiempo.getTime()));

            LOG.info("tamaño del archivo " + fileCod.getName() + " " + fileCod.length() + " bytes");
        } catch (IOException ex) {
            LOG.error("Error al codificar el archivo " + fileDeco.getName(), ex);
        }
    }
    
    
//    public void codificarArchivos(String sourceFile, String targetFile, boolean isChunked) throws Exception {
// 
//        byte[] base64EncodedData = Base64.encodeBase64(loadFileAsBytesArray(sourceFile), isChunked);
// 
//        writeByteArraysToFile(targetFile, base64EncodedData);
//    }
// 
//    public void codificarArchivos(String sourceFile, String targetFile) throws Exception {
// 
//        byte[] decodedBytes = Base64.decodeBase64(loadFileAsBytesArray(sourceFile));
// 
//        writeByteArraysToFile(targetFile, decodedBytes);
//    }
//    
//    private byte[] loadFileAsBytesArray(String fileName) throws FileNotFoundException, IOException {
// 
//        File file = new File(fileName);
//        int length = (int) file.length();
//        BufferedInputStream reader = new BufferedInputStream(new FileInputStream(file));
//        byte[] bytes = new byte[length];
//        reader.read(bytes, 0, length);
//        reader.close();
//        return bytes;
// 
//    }
// 
//    private void writeByteArraysToFile(String fileName, byte[] content) throws FileNotFoundException, IOException {
// 
//        File file = new File(fileName);
//        BufferedOutputStream writer = new BufferedOutputStream(new FileOutputStream(file));
//        writer.write(content);
//        writer.flush();
//        writer.close();
// 
//    }
}
