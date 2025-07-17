package it.automation.italia.myshopping.PaginaUtente;

import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import elemental.json.JsonArray;


@Route("Page-Utente")
public class PageUtente extends VerticalLayout
{
    public PageUtente()
    {

        setAlignItems( Alignment.CENTER);
        setJustifyContentMode(JustifyContentMode.CENTER);
        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        getStyle().setFont("Arial, Helvetica, sans-serif");
        getStyle().setBackground("#A7C7E7");

        Image image = new Image("logo.png", "Logo");










        image.setWidth("100px");
        image.setHeight("100px");
        add(image);


        setSizeFull();

    }

}
