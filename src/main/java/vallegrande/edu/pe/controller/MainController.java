package vallegrande.edu.pe.controller;

import vallegrande.edu.pe.model.ProductoDAO;
import vallegrande.edu.pe.view.MainView;

public class MainController {
    private MainView view;
    private ProductoDAO productoDAO;

    public MainController(MainView view) {
        this.view = view;
        this.productoDAO = new ProductoDAO();

        this.view.getBtnInicio().setOnAction(e -> this.view.mostrarInicio());
        this.view.getBtnProductos().setOnAction(e -> {
            this.view.mostrarProductos();
            cargarProductos();
        });
    }

    private void cargarProductos() {
        this.view.mostrarDatosProductos(productoDAO.listar());
    }
}