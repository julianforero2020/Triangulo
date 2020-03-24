

public class Color
{
  private int rojo;
  
  private int verde;
    
  private int azul;

    
    
    public Color( int pRojo, int pVerde, int pAzul )
    {
        rojo = pRojo;
        verde = pVerde;
        azul = pAzul;
    }

    
    public int darRojo( )
    {
        return rojo;
    }

    public int darVerde( )
    {
        return verde;
    }

    public int darAzul( )
    {
        return azul;
    }

 
    public void cambiarRojo( int pRojo )
    {
        rojo = pRojo;
    }


    public void cambiarVerde( int pVerde )
    {
        verde = pVerde;
    }

   
    public void cambiarAzul( int pAzul )
    {
        azul = pAzul;
    }

}
