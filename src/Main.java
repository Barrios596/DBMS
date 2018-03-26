import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    private JPanel panel1;
    private JButton correrButton;
    private JTextArea textArea1;
    private JTextArea textArea2;
    private static String input;

    public Main() {
        correrButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input = textArea1.getText();
                CharStream stream = new org.antlr.v4.runtime.ANTLRInputStream(input);
                GramaticaSQLLexer lexer  = new GramaticaSQLLexer(stream);
                TokenStream tokenStream = new CommonTokenStream(lexer);
                GramaticaSQLParser parser = new GramaticaSQLParser(tokenStream);
                parser.removeErrorListeners();
                parser.addErrorListener(new DialogListener());
                ParseTree arbol = parser.programa();
                EvalVisitor visitor = new EvalVisitor();
                visitor.visit(arbol);

                textArea2.setText(visitor.salida);

                JFrame frame = new JFrame("Antlr AST");
                JPanel panel = new JPanel();
                TreeViewer viewr = new TreeViewer(Arrays.asList(parser.getRuleNames()),arbol);
                panel.add(viewr);
                frame.add(panel);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }

    public  static void main(String[] args){
        JFrame frame = new JFrame("Parser para Decaf");
        frame.setContentPane(new Main().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1300,800);
        frame.setVisible(true);
    }
}
