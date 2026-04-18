package herencia.ejercici2;

public class CuentaCorriente extends Cuenta {
    private double limiteSobregiro;

    public CuentaCorriente(String titular, double saldo, double limiteSobregiro) {
        super(titular, saldo);
        this.limiteSobregiro = limiteSobregiro;
    }

    @Override 
    public void retirar(double monto) {
        if (monto > 0 && monto <= (getSaldo() + limiteSobregiro)) {
            double nuevoSaldo = getSaldo() - monto;
            setSaldo(nuevoSaldo); 
            System.out.println("Retiro con sobregiro exitoso, su nuevo saldo es: " + getSaldo());
        } else {
            System.out.println("Error, el monto excede el limite de sobregiro permitido");
        }
    }

    @Override
    public String toString() {
        return "[Cuenta Corriente] " + super.toString() + " (Límite: " + limiteSobregiro + ")";
    }
}


