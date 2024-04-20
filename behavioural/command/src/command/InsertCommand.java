package command;

import editor.Editor;

public class InsertCommand extends Command {
    private String word;
    private int position;

    public InsertCommand(Editor editor, String word, int position) {
        super(editor);
        this.word = word;
        this.position = position;
    }

    @Override
    public boolean execute() {
        backup();
        if (position > editor.textArea.getText().length())
            editor.textArea.append(" " + word);
        else if (position <= 0)
            editor.textArea.insert(word + " ", 0);
        else
            editor.textArea.insert(" " + word + " ", position);
        return true;
    }

}
