/**
 *
 * @author Hansy Gonzalez
 * @author Marcell Granados
 */
public enum StatusEnum {
    DELIVERED("Entregado", null),
    IN_TRANSIT("En tránsito", DELIVERED),
    DISPATCH_WAITING("En espera para ser despachado", IN_TRANSIT),
    PROCESSING("En procesamiento", DISPATCH_WAITING),
    PROCESS_WAITING("En espera de ser procesado", PROCESSING);
    
    private final String description;
    private final StatusEnum next;

    private StatusEnum(String description, StatusEnum next) {
        this.description = description;
        this.next = next;
    }

    public String getDescription() {
        return description;
    }

    public StatusEnum getNext() {
        return next;
    }

    public boolean hasNext(){
        return next != null;
    }
    
}
