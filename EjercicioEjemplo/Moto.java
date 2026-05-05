package EjercicioEjemplo;
public class Moto extends Vehiculo{

    public Moto (String Marca){
        super(Marca);
    }
    @Override
    public void Acelerar(){
        setVelocidad(getVelocidad() + 20);
        System.out.println("Esta " + getMarca() + ", Va a " + getVelocidad() + "km/h.");
    }

    @Override
    public void Frenar(){
        setVelocidad(getVelocidad() - 5);
        System.out.println("Y esta moto " + getMarca() + " Frena a " + getVelocidad() + " Tenlo muy encuenta");
    }
}