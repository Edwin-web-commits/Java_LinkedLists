import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit=new LinkedList<String>();
       /* placesToVisit.add("Johanessburg");
        placesToVisit.add("Pretoria");
        placesToVisit.add("Durban");
        placesToVisit.add("Limpopo");
        placesToVisit.add("Witbank");



        printList(placesToVisit);
         placesToVisit.add(1,"Polokwane");
         printList(placesToVisit);
        */
        addInOrder(placesToVisit,"Burgersford");
        addInOrder(placesToVisit,"Phalabora");
        addInOrder(placesToVisit,"Limpopo");
        addInOrder(placesToVisit,"Jtohanesburg");
        addInOrder(placesToVisit,"Pretoria");
        addInOrder(placesToVisit,"Durban");

        printList(placesToVisit);
    }
     private static void printList(LinkedList<String>linkedList)
    {
        Iterator<String>i=linkedList.iterator();
        while(i.hasNext())
        {
            System.out.println("Now I am visiting ->"+i.next());
        }
        System.out.println("==========");
    }
    private static boolean addInOrder(LinkedList<String>linkedList,String newCity)
    {
        ListIterator<String>stringListIterator=linkedList.listIterator();
        while(stringListIterator.hasNext())
        { int comparison=stringListIterator.next().compareTo(newCity);

           if(comparison==0)
           {// equal, do not add
               System.out.println(newCity + "is already included as a destination. ");
               return false ;
           }
           else if(comparison>0)
           {
               // new city should be added before this one.
               stringListIterator.previous();
               stringListIterator.add(newCity);
               return true ;
           }
           else if(comparison<0)
           {
               //move on next city
           }

        }
        stringListIterator.add(newCity);
        return true;
    }
}
