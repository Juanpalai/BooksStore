package booksstore;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * Author Juan Pablo Lagos
 */
public class BooksStore extends Frame 
{
    private TextField book;
    private Button add;    
    private Button derecha;
    private Button izquierda;
    private Button clear;
    private List enable;
    private List disable;
    private Button remove;
    
    //--------------------------------------------------------------------------    
    
    public BooksStore()
    {
        Panel p1 = new Panel(new BorderLayout());
        Panel p2 = new Panel(new BorderLayout());
        Panel p3 = new Panel(new BorderLayout());
        Panel p4 = new Panel(new BorderLayout());
        book    = new TextField();
        add     = new Button("Add");
        derecha     = new Button(">");
        izquierda     = new Button("<");
        clear     = new Button("Clear");
        enable    = new List();
        disable    = new List();
        remove  = new Button("Remove");
        
        p1.add(new Label("Tittle"), BorderLayout.WEST);
        p1.add( book,               BorderLayout.CENTER);
        p1.add(add,                 BorderLayout.EAST);
        
        //p2.add(new Label("Enable"), BorderLayout.NORTH);
        p2.add( enable,             BorderLayout.EAST);
        
        //p3.add(new Label("Disable"),BorderLayout.NORTH);
        p2.add( disable,            BorderLayout.WEST);
        
        p4.add(remove); p4.add(derecha); p4.add(izquierda); p4.add(clear);
        
        add(p1, BorderLayout.NORTH);
        add(p2, BorderLayout.CENTER);
        add(p3, BorderLayout.CENTER);
        add(p4, BorderLayout.SOUTH);
        
        setTitle("Book Store");
        setSize(400, 400);
        events();
        setVisible(true);
        
    }
    
    //--------------------------------------------------------------------------
    
    private void events()
    {       
        
    }    
    //--------------------------------------------------------------------------
    
    public static void main(String[] args) 
    {
        new  BooksStore();
    }
    
}
