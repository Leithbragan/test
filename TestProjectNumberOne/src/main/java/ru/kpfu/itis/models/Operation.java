package ru.kpfu.itis.models;

public class Operation {

    private String nameOperation;
    private String arg_1;
    private String arg_2;
    private String symbol;
    private String total;

    public Operation(String arg_1, String arg_2, String nameOperation, String symbol, String total) {
        this.arg_1 = arg_1;
        this.arg_2 = arg_2;
        this.nameOperation = nameOperation;
        this.symbol = symbol;
        this.total = total;

    }

    public Operation() {
    }


    public String getNameOperation() {
        return nameOperation;
    }

    public void setNameOperation(String nameOperation) {
        this.nameOperation = nameOperation;
    }

    public String getArg_1() {
        return arg_1;
    }

    public void setArg_1(String arg_1) {
        this.arg_1 = arg_1;
    }

    public String getArg_2() {
        return arg_2;
    }

    public void setArg_2(String arg_2) {
        this.arg_2 = arg_2;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
}
