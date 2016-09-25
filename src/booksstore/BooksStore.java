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
    private List list;
    private Button remove;
    
    //--------------------------------------------------------------------------    
    
    public BooksStore()
    {
        Panel p = new Panel(new BorderLayout());
        book    = new TextField();
        add     = new Button("Add");
        list    = new List();
        remove  = new Button("Remove");
        
        p.add(new Label("Tittle"), BorderLayout.WEST);
        p.add( book,               BorderLayout.CENTER);
        p.add(add,                 BorderLayout.EAST);
        
        add(p, BorderLayout.NORTH);
        add(list, BorderLayout.CENTER);
        add(remove,BorderLayout.SOUTH);
        
        setTitle("Book Register");
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
          list.add(book.getText());
          book.setText("");
        }        
        });
        
        //----------------------------------------------------------------------
         remove.addActionListener(new ActionListener()
         {
             public void actionPerformed(ActionEvent e)
             {
                 list.remove(list.getSelectedIndex());
             }
         });
         
         //----------------------------------------------------------------------
        
        book.addActionListener(new ActionListener()
        {
        public void actionPerformed(ActionEvent e) 
        {
          list.add(book.getText());
          book.setText("");
        }        
        });
        
    }    
    //--------------------------------------------------------------------------
    
    public static void main(String[] args) 
    {
        
    }
    
}
