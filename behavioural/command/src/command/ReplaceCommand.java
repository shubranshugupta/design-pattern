package command;

import editor.Editor;

public class ReplaceCommand extends Command {
    private String word;
    private String replacement;

    public ReplaceCommand(Editor editor, String word, String replacement) {
        super(editor);
        this.word = word;
        this.replacement = replacement;
    }

    @Override
    public boolean execute() {
        backup();
        editor.textArea.setText(editor.textArea.getText()
                .replaceAll("(?<!\\S)" + word + "(?!\\S)", replacement));
        return true;
    }
}
