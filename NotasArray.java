import java.util.ArrayList;
public class NotasArray
{
   private ArrayList <BlocoDeNotas> notas;
   
   // adicionar notas
   public NotasArray()
   {
      notas = new ArrayList <BlocoDeNotas> ();
   }
   
   public void addNotas (BlocoDeNotas blocoDeNotas)
   {
      notas.add(blocoDeNotas);
   }
   
   // remover notas
   public boolean remover (String nota)
   {
      int posicao = buscar(nota);
      if(posicao >= 0)
      {
         notas.remove(posicao);
         return true;
      } 
      else 
      {
         return false;
      }
   }
   
   // buscar notas
   public int procurarNotas (String notas)
   {
      return buscar(notas);
   }
   
   private int buscar(String nota)
   {
      for(int i = 0; i < notas.size(); i++)
      {
         BlocoDeNotas blocoDeNotas = notas.get(i);
         
         String nomeNota = blocoDeNotas.getNota();
         if(nota.equals(nomeNota))
         {
            return i;
         }
      }
      return -1;
   }
   
   // atualizar notas
   public void atualizar (String nota, String novaNota)
   {
      int posicao = buscar(nota);
		if(posicao >= 0)
      {
			BlocoDeNotas blocoDeNotas = new BlocoDeNotas(nota);
			blocoDeNotas.setNota(novaNota);
			notas.set(posicao, blocoDeNotas.setNota(novaNota));
      }         
   }
   
   public void listarNotas()
   {
		for(int i = 0; i <notas.size(); i++)
		{
			BlocoDeNotas blocoDeNotas = notas.get(i);
			System.out.println("Nota: "+ blocoDeNotas.getNota());
		}
	}

}  