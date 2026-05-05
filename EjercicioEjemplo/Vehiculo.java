package EjercicioEjemplo;
public abstract class Vehiculo{     //Aqui se crea la clase abstract, para poder heredarselas a otras clases  
    private String Marca;    //Se crea un atributo con nombre 
    private int Velocidad;   //Se crea el atributo con velociadad


    public Vehiculo(String Marca) {  //Llamo a el atributo Marca para poder escribirla 
    this.Marca=Marca;   //aqui se utiliza el this para poder asignar lo que escribio el usuario, es decir para poder confirmar de que marca es marca
    setVelocidad(0);    //aqui se envia la velocidad, esta inicia de 0 para que no exista el negativo y como todos los autos inicia en 0
} 

public String getMarca(){
    return Marca;
} 
public int getVelocidad(){
    return Velocidad;
}

protected void setVelocidad(int Velocidad){
    if (Velocidad > 0){
        this.Velocidad=0;
    }else{
        this.Velocidad=Velocidad;
    }
}
public abstract void Acelerar();
public abstract void Frenar();
}