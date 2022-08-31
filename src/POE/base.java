package POE;
import java.util.Arrays;
public class base 
{
    //private int t=20;
                 
    
    public static void ciclo(int Pos)
    {   
        int z=0;
                 int y=0;
                  int a[] = {1,0,0};
                  int a1[] = {0,0,0};
                  int a2[] = {0,0,0};
                  
                 int a3[] = {0,0,0};
                int a4[] = {1,1,1};
                 int a5[] = {1,1,1};
                 int contador[] = {Pos+1,0,0,-1,-1,-1};
                 int len = 1;
                 int c=1;
        int destPos;
        if(Pos==2)
        {
            len=1;
        }            
                int sourcePos;               
                sourcePos=0;              
            int i=1;
            a1=a;
    { 
    while(i==1)
    {      
        final int  k[] = {0,0,0};
        destPos=Pos;
        a2=k;
        
       System.arraycopy(a1, sourcePos, a2, destPos, len);    
       System.out.println("Iniciando operacion");         
           System.out.println(Arrays.toString(a1));
           System.out.println("-------------------------");
           System.out.println(Arrays.toString(a2));
           System.out.println("\n");
           for(int x=0;x<a1.length;x++)
           {
                   if(a1[x] ==1)
                   {                                  
                                           a3[x]=1;                           
                   }                 
                   if(a1[x]==0)
                   {
                           if(a2[x]==1)
                           {
                                   a3[x]=1;   
                           }
                           else
                           {
                                   a3[x]=0;
                           }
                   }                 
           }
           a1=a3;
           if (Arrays.equals(a1, a4)) 
           {
                   i=0;
                   System.out.println("La secuencia final fue\n");
                   System.out.println(Arrays.toString(contador));
           }
           a5=a1;
           if (Arrays.equals(a1, a5)) 
           {             
               z++;
                   if(z==6)
                   {
                       i=0;
                   }
           } 
           else{z=0;}
           System.out.println("Resultado de la operacion OR\n");
           System.out.println(Arrays.toString(a1));
           if(Arrays.equals(a1, a5))
        {           
            y++;
            
            
            
            
            if(y>=1)
            {            
        if (destPos==0) 
           {
                   Pos=1;
                   System.out.println("\tSe utiliza la posicion 2\t");
                   
                   contador[c]=Pos+1;
                   c++;
                   if(Pos==2)
        {
            len=2;
        }
           }
           if(destPos==1)
           {
                      Pos=2; 
                      System.out.println("\tSe utiliza la posicion 3\t");
                      
                      contador[c]=Pos+1;
                      c++;
           }  
           if(destPos==2)
        {
                   Pos=0;
                   System.out.println("\tSe utiliza la posicion 1\t");
                   
                   contador[c]=Pos+1;
                   c++;
                   if(Pos==2)
        {
            len=2;
        }
        }          
        }       
    }
    else y=0; 
           
   }
}
}
    

   // public void setarray(int a[])
   // {
   //     this.array = a;
    //}
    //public int[] getarray()
    //{
   //     return  array;
   // }
    
    
    
    
    //public  void mostrar_nrt () 
   // {
   // System.out.println("arrays de los alumnos: ");
   // System.out.println(Arrays.toString(array));
   

    //}
    public base() {}
    //public Evento(String date, String hour, String tel)
    //{
     //   this.array =date;
     //   this.registro =hour;
     //   this.telefono =tel;
}