
package com.develcom.herramientas;

import com.develcom.enlaces.Expedientes;
import com.develcom.enlaces.Usuario;
import javax.swing.JTextField;
import java.util.List;
import javax.swing.text.BadLocationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Autocompletar {
    
    private static final Logger LOG = LoggerFactory.getLogger(Autocompletar.class);


    public void addTexto(JTextField textField, String newDato) {

        String datoBuscado;
        int nroActual = textField.getText().length();

        LOG.info("nuevo dato " + newDato);
        datoBuscado = newDato.substring(nroActual, newDato.length());

        if (newDato.isEmpty() || datoBuscado.isEmpty()) {
            return;
        }

        try {
            LOG.info("dato buscado " + datoBuscado);
            textField.getDocument().insertString(textField.getCaretPosition(), datoBuscado, null);
        } catch (BadLocationException e) {
            LOG.error("error al insertar el dato", e);
        }

        textField.select(nroActual, textField.getText().length());
    }

    public String getTextoListaUsuario(String datoBuscar, List<Usuario> usuarios) {

        int nroPosicion = getPosicionLista(datoBuscar, usuarios, null);

        if (nroPosicion == -1) {
            LOG.info("dato a buscar " + datoBuscar);
            return datoBuscar;
        }
        //return veDatos[nroPosicion];

        return usuarios.get(nroPosicion).getIdUsuario();
    }

    public String getTextoListaExpediente(String datoBuscar, List<Expedientes> expedientes) {

        int nroPosicion = getPosicionLista(datoBuscar, null, expedientes);

        if (nroPosicion == -1) {
            LOG.info("dato a buscar " + datoBuscar);
            return datoBuscar;
        }
        //return veDatos[nroPosicion];

        return expedientes.get(nroPosicion).getExpediente();
    }

    public int getPosicionLista(String datoBuscar, List<Usuario> usuarios, List<Expedientes> expedientes) {

        try {

            if (usuarios != null) {

                for (int i = 0; i < usuarios.size(); i++) {

                    if (datoBuscar.equalsIgnoreCase(usuarios.get(i).getIdUsuario().substring(0, datoBuscar.length()))) {
                        LOG.info("posicion " + i);
                        return i;
                    }

                }
            }

            if (expedientes != null) {

                for (int i = 0; i < expedientes.size(); i++) {

                    if (datoBuscar.equalsIgnoreCase(expedientes.get(i).getExpediente().substring(0, datoBuscar.length()))) {
                        LOG.info("posicion " + i);
                        return i;
                    }

                }
            }
        } catch (Exception e) {
            LOG.error("error al obtener la posicion del vector", e);
        }
        return -1;
    }
}
