


public class Triangulo
{

    
private Punto punto1;

    
private Punto punto2;

private Punto punto3;

private Color colorLineas;

private Color colorRelleno;

   
   
public Triangulo(   )
{
       

  punto1 = new Punto( 110, 54 );
  punto2 = new Punto( 250, 180 );
  punto3 = new Punto( 90, 100 );

       
 
  colorRelleno = new Color( 50, 160, 72 );
  colorLineas = new Color( 1, 85, 27 );
}

    
public Punto darPunto1( )
{
  return punto1;
}

   
public Punto darPunto2( )
{
  return punto2;
}

   
public Punto darPunto3( )
{
  return punto3;
}

    
public Color darColorLineas( )
{
  return colorLineas;
}

public Color darColorRelleno( )
{
  return colorRelleno;
}


public double darPerimetro( )
{
        
 return calcularLado1( ) + calcularLado2( ) + calcularLado3( );
}


public double darArea( )
{
      
 double perimetro = darPerimetro( );
 double s = perimetro / 2;

      
 double valorLado1 = s - calcularLado1( );
 double valorLado2 = s - calcularLado2( );
 double valorLado3 = s - calcularLado3( );

       
 double area = Math.sqrt( s * valorLado1 * valorLado2 * valorLado3 );
 return area;
}


public double darAltura( )
{
  double area = darArea( );
  double base = calcularLado1( );
  double altura = ( area / base ) * 2;
  return altura;
}

   
private double calcularLado1( )
{
        
  double valorX = Math.pow( punto1.darX( ) - punto2.darX( ), 2 );
  double valorY = Math.pow( punto1.darY( ) - punto2.darY( ), 2 );

       
  double distancia = Math.sqrt( valorX + valorY );
  return distancia;
}

private double calcularLado2( )
{
       
  double valorX = Math.pow( punto2.darX( ) - punto3.darX( ), 2 );
  double valorY = Math.pow( punto2.darY( ) - punto3.darY( ), 2 );

        
  double distancia = Math.sqrt( valorX + valorY );
  return distancia;
}

 
private double calcularLado3( )
{
   
    double valorX = Math.pow( punto3.darX( ) - punto1.darX( ), 2 );
    double valorY = Math.pow( punto3.darY( ) - punto1.darY( ), 2 );

        
    double distancia = Math.sqrt( valorX + valorY );
    return distancia;
}

  
public double calcularAnguloOpuesto( double pX1, double pY1, double pX2, double pY2, double pX3, double pY3 )
{
  double angulo1 = Math.atan2( pY2 - pY1, pX2 - pX1 );

       
  double angulo2 = Math.atan2( pY3 - pY1, pX3 - pX1 );

       
  if( Math.abs( angulo1 - angulo2 ) > Math.PI )
   {
      angulo1 = angulo1 < 0 ? angulo1 + 2.d * Math.PI : angulo1;
      angulo2 = angulo2 < 0 ? angulo2 + 2.d * Math.PI : angulo2;
   }

        
   double anguloOpuesto = ( angulo1 + angulo2 ) / 2.d + Math.PI;
   anguloOpuesto = anguloOpuesto % ( 2.d * Math.PI );
   return anguloOpuesto;
    }

 
public void cambiarPunto1( double pX, double pY )
{
   punto1.cambiarX( pX );
   punto1.cambiarY( pY );
}

  
public void cambiarPunto2( double pX, double pY )
{
  punto2.cambiarX( pX );
  punto2.cambiarY( pY );
}

public void cambiarPunto3( double pX, double pY )
{
  punto3.cambiarX( pX );
  punto3.cambiarY( pY );
}

   
public void cambiarColorRelleno( int pRojo, int pVerde, int pAzul )
{
  colorRelleno.cambiarRojo( pRojo );
  colorRelleno.cambiarVerde( pVerde );
  colorRelleno.cambiarAzul( pAzul );
}

  
public void cambiarColorLineas( int pRojo, int pVerde, int pAzul )
{
   colorLineas.cambiarRojo( pRojo );
   colorLineas.cambiarVerde( pVerde );
   colorLineas.cambiarAzul( pAzul );
}

  

public String metodo1( )
{
 return "Respuesta 1";
}

   
public String metodo2( )
{
  return "Respuesta 2";
}

}