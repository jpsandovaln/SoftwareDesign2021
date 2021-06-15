package visitor;

public class WordToPdf implements  Asset{
    private String outputName;
    private String binary;

    public WordToPdf(String outputName, String binary) {
        this.outputName = outputName;
        this.binary = binary;
    }

    @Override
    public void convert() {
        System.out.println("converting word to pdf");
    }

    @Override
    public void accept(IVisitor visitor) throws Exception {
        visitor.visitWordToPdf(this);
    }

    public String getOutputName() {
        return outputName;
    }

    public void setOutputName(String outputName) {
        this.outputName = outputName;
    }

    public String getBinary() {
        return binary;
    }

    public void setBinary(String binary) {
        this.binary = binary;
    }
}
