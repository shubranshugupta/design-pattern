package command;

import editor.Editor;

public class DeleteCommand extends Command {
    private String word;

    public DeleteCommand(Editor editor, String word) {
        super(editor);
        this.word = word;
    }

    @Override
    public boolean execute() {
        backup();
        editor.textArea.setText(editor.textArea.getText()
                .replaceAll("(?<!\\S)" + word + "(?!\\S)", ""));
        return true;
    }
}
