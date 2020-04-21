import javax.swing.JOptionPane;
public class AppBloco
{
   public static void main(String [] args)
   {
   
      NotasArray notasArray = new NotasArray();
      int menu;
      String nota = null;
      
      do
      {
         menu = Integer.parseInt(JOptionPane.showInputDialog("1 Adicionar nota\n2 Remover nota\n3 Alterar nota" + "\n4 Listar todas as notas\n5 Sair"));
         
         if(menu == 1)
         {
            nota = JOptionPane.showInputDialog("Nota:");
            BlocoDeNotas notas = new BlocoDeNotas(nota);
            notasArray.addNotas(notas);
         }
         
         else if(menu == 2)
         {
            nota = JOptionPane.showInputDialog("Nome para remover:");
            if(notasArray.remover(nota))
            {
               JOptionPane.showMessageDialog(null, "Removida");
            }
            else 
            {
               JOptionPane.showMessageDialog(null, "Não encontrada");
            }
         }
         
         else if(menu == 3)
         {
            nota = JOptionPane.showInputDialog("Nota para alterar:");
            nota.setNota(nota);
            
            JOptionPane.showMessageDialog(null, "Nota alterada");
         }  
         
         else if(menu == 4)
         {
            notasArray.listarNotas();
         }
         else 
         {
            JOptionPane.showMessageDialog(null,"Opcao invalida");
         }
      
      }while(menu != 5);
   }
}
      
       