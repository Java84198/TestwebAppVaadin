package it.automation.italia.myshopping.views;

import com.nimbusds.jose.shaded.gson.JsonArray;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;

import com.vaadin.flow.router.Route;
import elemental.json.JsonObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


@Route("")
public class HomeView extends VerticalLayout {

    public HomeView() throws IOException {


        add(new H1("My Shopping 2025"));
        getStyle().setFont("Arial, Helvetica, sans-serif");
        getStyle().setBackground("#A7C7E7");
        setJustifyContentMode(JustifyContentMode.CENTER);
        setDefaultHorizontalComponentAlignment(Alignment.CENTER);

        TextField username = new TextField("Username");
        username.getStyle().set("width", "300px");
        username.getStyle().set("margin", "10px");

        PasswordField password = new PasswordField("Password");
        password.getStyle().set("width", "300px");
        password.getStyle().set("margin", "10px");

        Button login = new Button("Login");
        login.getStyle().set("background-color", "#4CAF50");
        login.getStyle().set("color", "white");
        login.getStyle().set("margin", "10px");

        Button Register = new Button("Register");
        Register.getStyle().set("background-color", "#008CBA");
        Register.getStyle().set("color", "white");
        Register.getStyle().set("margin", "10px");

        Paragraph paragraph = new Paragraph("Don't have an account yet?");
        paragraph.getStyle().set("color", "#333333");
        add(username, password, login, paragraph, Register);



        login.addClickListener(e -> {
            if(username.getValue().equals("Test") && password.getValue().equals("1234"))
            {
                getUI().ifPresent(ui -> ui.navigate("Page-Utente"));

            }
            else
            {
                getUI().ifPresent(ui -> ui.navigate("Page-Utente"));
            }
        });

        setSizeFull();
    }
}
