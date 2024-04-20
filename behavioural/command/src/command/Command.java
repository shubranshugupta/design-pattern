package command;

import editor.Editor;

public abstract class Command {
    protected Editor editor;
    private String backup;

    public Command(Editor editor) {
        this.editor = editor;
    }

    public void backup() {
        backup = editor.textArea.getText();
    }

    public abstract boolean execute();

    public void undo() {
        editor.textArea.setText(backup);
    }
}
