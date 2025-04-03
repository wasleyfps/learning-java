package academy.devdojo.maratonajava.javacore.Kenum.domain;

public enum TypeClient {
    NATURAL_PERSON(1, "Natural Person"),
    LEGAL_PERSON(2, "Legal Person");
    
    private int value;
    private String nameReport;
    
    TypeClient(int value, String nameReport) {
        this.value = value;
        this.nameReport = nameReport;
    }
    
    public static TypeClient typeClientForNameReport(String nameReport) {
        for (TypeClient typeClient : values()) {
            if (typeClient.getNameReport().equals(nameReport)) {
                return typeClient;
            }
        }
        return null;
    }
    
    public String getNameReport() {
        return nameReport;
    }
    
    public int getValue() {
        return value;
    }
}
