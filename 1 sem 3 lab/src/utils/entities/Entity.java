package utils.entities;

import utils.ConsolePrinter;
import utils.PrinterInterface;
import utils.actions.Action;

import java.util.Objects;

public abstract class Entity {
    private final String description;

    private final PrinterInterface printer;

    public Entity(String description) {
        this.description = description;
        printer = new ConsolePrinter();
    }

    public void performAction(Action act){
        if(act != null)
            getPrinter().printString(this + ": " + act.perform());
    }

    public void looksLike(Entity ent){
        if(ent != null)
            getPrinter().printString(this + " похож на " + ent);
    }

    public abstract String stringify();

    public String getDescription() {
        return description;
    }
    public PrinterInterface getPrinter() {
        return printer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entity entity = (Entity) o;
        return Objects.equals(description, entity.description) && Objects.equals(printer, entity.printer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, printer);
    }

    @Override
    public String toString() {
        return "Entity{" +
                "description='" + description + '\'' +
                ", printer=" + printer +
                '}';
    }
}
