package com.example.application.views.accion;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

@PageTitle("Accion")
@Route(value = "Accion", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
@Uses(Icon.class)
public class AccionView extends Composite<VerticalLayout> {

    public AccionView() {
        H1 h1 = new H1();
        H4 h4 = new H4();
        Checkbox checkbox = new Checkbox();
        Checkbox checkbox2 = new Checkbox();
        Checkbox checkbox3 = new Checkbox();
        Checkbox checkbox4 = new Checkbox();
        Button buttonPrimary = new Button();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        h1.setText("Bienvenido al Registro Civil");
        h1.setWidth("max-content");
        h4.setText("Seleccione que operación quiere realizar");
        h4.setWidth("max-content");
        checkbox.setLabel("Agregar a un ciudadano");
        checkbox.setWidth("100%");
        checkbox2.setLabel("Buscar a un ciudadano");
        checkbox2.setWidth("100%");
        checkbox3.setLabel("Ver todos los ciudadanos");
        checkbox3.setWidth("100%");
        checkbox4.setLabel("Imprimir un certificado");
        checkbox4.setWidth("100%");
        buttonPrimary.setText("Continuar");
        getContent().setAlignSelf(FlexComponent.Alignment.CENTER, buttonPrimary);
        buttonPrimary.setWidth("min-content");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        getContent().add(h1);
        getContent().add(h4);
        getContent().add(checkbox);
        getContent().add(checkbox2);
        getContent().add(checkbox3);
        getContent().add(checkbox4);
        getContent().add(buttonPrimary);
    }
}
