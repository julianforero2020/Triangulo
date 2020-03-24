
public class Punto
{
   
    private double x;

 
    private double y;

  

public Punto( double pX, double pY )
{
    x = pX;
    y = pY;
}

    
public double darX( )
{
 return x;
}

 
public double darY( )
{
 return y;
}

public void cambiarX( double pX )
{
  x = pX;
}

 
public void cambiarY( double pY )
{
   y = pY;
}

}