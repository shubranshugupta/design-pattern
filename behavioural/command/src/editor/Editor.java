package editor;

import command.Command;
import command.CommandHistory;
import command.DeleteCommand;
import command.InsertCommand;
import command.ReplaceCommand;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Editor {
    public JTextArea textArea;
    private CommandHistory history;
    private String buttonClicked = "";

    public Editor() {
        history = new CommandHistory();
    }

    public void init() {
        JFrame frame = new JFrame("Text editor");
        JPanel contentPanel = new JPanel();
        textArea = new JTextArea();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setContentPane(contentPanel);
        frame.setVisible(true);

        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));

        textArea.setLineWrap(true);
        textArea.setFont(new Font("Arial", Font.PLAIN, 20));
        contentPanel.add(textArea, BorderLayout.CENTER);

        // Create Hidden Panel for input
        JPanel inputPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JTextField inputField1 = new JTextField(10);
        inputField1.setFont(new Font("Arial", Font.PLAIN, 20));
        inputField1.setFocusable(false);
        inputPanel.add(inputField1);

        JTextField inputField2 = new JTextField(10);
        inputField2.setFont(new Font("Arial", Font.PLAIN, 20));
        inputField2.setFocusable(false);
        inputPanel.add(inputField2);

        // Create Button Panel for functions
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton clearButton = new JButton("Clear");
        JButton insertButton = new JButton("Insert");
        JButton deleteButton = new JButton("Delete");
        JButton replaceButton = new JButton("Replace");
        JButton undoButton = new JButton("Undo");

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText("");
            }
        });
        buttonPanel.add(clearButton);

        undoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (history.isEmpty()) {
                    return;
                }
                Command command = history.pop();
                command.undo();
            }
        });
        buttonPanel.add(undoButton);

        insertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputField1.setFocusable(true);
                inputField1.setText("Enter text");
                inputField2.setFocusable(true);
                inputField2.setText("Enter position");

                clearButton.setEnabled(false);
                insertButton.setEnabled(false);
                deleteButton.setEnabled(false);
                replaceButton.setEnabled(false);
                undoButton.setEnabled(false);

                buttonClicked = "Insert";
            }
        });
        buttonPanel.add(insertButton);

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputField1.setFocusable(true);
                inputField1.setText("Enter text");
                inputField2.setFocusable(false);
                inputField2.setText("");

                clearButton.setEnabled(false);
                insertButton.setEnabled(false);
                deleteButton.setEnabled(false);
                replaceButton.setEnabled(false);
                undoButton.setEnabled(false);

                buttonClicked = "Delete";
            }
        });
        buttonPanel.add(deleteButton);

        replaceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputField1.setFocusable(true);
                inputField1.setText("Enter text");
                inputField2.setFocusable(true);
                inputField2.setText("Enter replacement");

                clearButton.setEnabled(false);
                insertButton.setEnabled(false);
                deleteButton.setEnabled(false);
                replaceButton.setEnabled(false);
                undoButton.setEnabled(false);

                buttonClicked = "Replace";
            }
        });
        buttonPanel.add(replaceButton);
        contentPanel.add(buttonPanel);

        JButton okButton = new JButton("Ok");
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (buttonClicked.equals("")) {
                    return;
                } else if (buttonClicked.equals("Insert")) {
                    String text = inputField1.getText();
                    try {
                        int position = Integer.parseInt(inputField2.getText());
                        executeCommand(new InsertCommand(Editor.this, text, position));
                    } catch (NumberFormatException ex) {
                        executeCommand(new InsertCommand(Editor.this, text, 0));
                    }
                } else if (buttonClicked.equals("Delete")) {
                    String text = inputField1.getText();
                    executeCommand(new DeleteCommand(Editor.this, text));
                } else if (buttonClicked.equals("Replace")) {
                    String text = inputField1.getText();
                    String replacement = inputField2.getText();
                    executeCommand(new ReplaceCommand(Editor.this, text, replacement));
                }

                inputField1.setText("");
                inputField1.setFocusable(false);

                inputField2.setText("");
                inputField2.setFocusable(false);

                clearButton.setEnabled(true);
                insertButton.setEnabled(true);
                deleteButton.setEnabled(true);
                replaceButton.setEnabled(true);
                undoButton.setEnabled(true);
                buttonClicked = "";
            }
        });
        inputPanel.add(okButton);
        contentPanel.add(inputPanel);
    }

    private void executeCommand(Command command) {
        if (command.execute()) {
            history.push(command);
        }
    }
}
