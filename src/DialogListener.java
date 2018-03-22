/*
* Universidad del Valle de Guatemala
* Construcción de Compiladores
* 1er ciclo de 2018
* Rodrigo Eduardo Barrios Estrada
* DecafMain.java
* OJO, me basé en un programa que encontré en el capítulo 9 del libro oficial para el uso de ANTLR4, aquí el link al PDF:
 * http://www4.di.uminho.pt/~gepl/GQE/documents/books/Pragmatic.The.Definitive.ANTLR.4.Reference.Jan.2013.pdf
 */


import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import java.util.List;
import java.util.Collections;
import org.antlr.v4.runtime.Parser;
import javax.swing.*;
import java.awt.Container;
import java.awt.Color;




public class DialogListener extends BaseErrorListener {

   @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg,
                            RecognitionException e)
    {
        List<String> stack = ((Parser)recognizer).getRuleInvocationStack();
        Collections.reverse(stack);
        StringBuilder buf = new StringBuilder();
        buf.append("rule stack: "+stack+" ");
        buf.append("line "+line+":"+charPositionInLine+" at "+
                offendingSymbol+": "+msg);
        JDialog dialog = new JDialog();
        Container contentPane = dialog.getContentPane();
        contentPane.add(new JLabel(buf.toString()));
        contentPane.setBackground(Color.white);
        dialog.setTitle("Syntax error");
        dialog.pack();
        dialog.setLocationRelativeTo(null);
        dialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dialog.setVisible(true);
    }
}