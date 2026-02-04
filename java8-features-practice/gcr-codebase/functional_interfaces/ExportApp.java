package functional_interfaces;

interface ReportExporter {
    void exportCSV();
    void exportPDF();

    
    default void exportToJSON() {
        System.out.println("Exported to JSON");
    }
}

class SalesReport implements ReportExporter {
    public void exportCSV() {
        System.out.println("CSV export done");
    }
    public void exportPDF() {
        System.out.println("PDF export done");
    }
}

public class ExportApp {
    public static void main(String[] args) {
        ReportExporter r = new SalesReport();
        r.exportCSV();
        r.exportToJSON();   
    }
}
