package booksstore;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
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
        Panel p2 = new Panel(new GridLayout(1,2));
        Panel p3 = new Panel(new GridLayout(1,4));
        Panel p4 = new Panel(new GridLayout(1,2));
        book    = new TextField();
        add     = new Button("Add");
        derecha     = new Button(">");
        izquierda     = new Button("<");
        clear     = new Button("Clear");
        enable    = new List();
        disable    = new List();
        remove  = new Button("Remove");
        
        p2.add(new Label ("Enable"));p2.add(new Label ("Disable"));
        
        p1.add(new Label("Tittle"), BorderLayout.WEST);
        p1.add( book,               BorderLayout.CENTER);
        p1.add(add,                 BorderLayout.EAST);
        p1.add(p2, BorderLayout.SOUTH);
        
        p3.add(remove); p3.add(derecha); p3.add(izquierda); p3.add(clear);
        p4.add(enable); p4.add(disable);
        
        add(p1, BorderLayout.NORTH);
        add(p4, BorderLayout.CENTER);
        add(p3, BorderLayout.SOUTH);   
        
        setTitle("Book Store");
        setSize(400, 400);
        events();
        setVisible(true);
        
    }
    
    //--------------------------------------------------------------------------
    
    private void events()
    {
        //-----------Closing windows and system---------------------------------
        addWindowListener( new WindowAdapter() 
        {
            public void windowClosing(WindowEvent e)
            {
                dispose();
                System.exit(0);
            }
        });
        
        //----------------------------------------------------------------------
        
        add.addActionListener(new ActionListener()
        {
        public void actionPerformed(ActionEvent e) 
        {
          enable.add(book.getText());
          book.setText("");
        }        
        });
        
        //----------------------------------------------------------------------
         remove.addActionListener(new ActionListener()
         {
             public void actionPerformed(ActionEvent e)
             {
                 enable.remove(enable.getSelectedIndex());
             }
         });
         
         //----------------------------------------------------------------------
        
        book.addActionListener(new ActionListener()
        {
        public void actionPerformed(ActionEvent e) 
        {
          enable.add(book.getText());
          book.setText("");
        }        
        });
        
        //----------------------------------------------------------------------
        
        derecha.addActionListener(new ActionListener()
        {
        public void actionPerformed(ActionEvent e) 
        {
          disable.add(enable.getSelectedItem());
          enable.remove(enable.getSelectedIndex());         
        }        
        });
        
        //----------------------------------------------------------------------
        
        izquierda.addActionListener(new ActionListener()
        {
        public void actionPerformed(ActionEvent e) 
        {
          enable.add(disable.getSelectedItem());
          disable.remove(disable.getSelectedIndex());         
        }        
        });
        
        //----------------------------------------------------------------------
        
        clear.addActionListener(new ActionListener()
        {
        public void actionPerformed(ActionEvent e) 
        {
          enable.removeAll();
          disable.removeAll();
        }        
        });
        
        
    }    
    //--------------------------------------------------------------------------
    
    public static void main(String[] args) 
    {
        new  BooksStore();
    }
    
}
