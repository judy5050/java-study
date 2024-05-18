package exception.ex3.esception;

public class ConnectionExceptionV3 extends NetworkClientExceptionV3{
    private final String address;

    public ConnectionExceptionV3(String address, String message) {
        super(message);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
