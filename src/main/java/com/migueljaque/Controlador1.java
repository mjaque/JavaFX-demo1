package com.migueljaque;

import java.io.IOException;
import javafx.fxml.FXML;

public class Controlador1 {

    @FXML
    private void cambiarAVista2() throws IOException {
        Programa.cambiarVista("vista2");
    }
}
