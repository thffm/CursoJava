package entities;

public  abstract  class Pessoa {
    private String name;
    private Double annualIncome;

    public Pessoa(){

    }
    public Pessoa(String name, Double annualIncome) {
        this.name = name;
        this.annualIncome = annualIncome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(Double annualIncome) {
        this.annualIncome = annualIncome;
    }

    public abstract double tax();

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(name+": ");
        sb.append(String.format("%.2f $",tax()));
        return sb.toString();
    }




}
