package gm.zona_fit;

import com.formdev.flatlaf.FlatDarculaLaf;
import gm.zona_fit.gui.ZonaFitForma;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import javax.swing.*;

@SpringBootApplication
public class ZonaFitSwing {

    public static void main(String[] args) {
        // Configurar Modo Oscuro
        FlatDarculaLaf.setup();
        // Instanciar la fabrica de SpringBoot
        ConfigurableApplicationContext contextoSpring = new SpringApplicationBuilder(
                ZonaFitSwing.class
        ).headless(false).web(WebApplicationType.NONE).run(args);

        // Crear un objeto de tipo Swing
        SwingUtilities.invokeLater(() -> {
            var zonaFitForma = contextoSpring.getBean(ZonaFitForma.class);
            zonaFitForma.setVisible(true);
        });
    }
}
