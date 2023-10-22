package ex1;

public class AdapterPostgreToJS extends JavaScriptCode implements PostgreSQLCode {
    @Override
    public void select() {
        SelectObject();
    }

    @Override
    public void update() {
        UpdateObject();
    }

    @Override
    public void delete() {
        DeleteObject();
    }
}
