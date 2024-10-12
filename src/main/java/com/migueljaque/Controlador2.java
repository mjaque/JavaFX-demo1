package com.migueljaque;

import java.io.IOException;
import javafx.fxml.FXML;

public class Controlador2 {

    @FXML
    private void cambiarAVista1() throws IOException {
        Programa.cambiarVista("vista1");
    }
}