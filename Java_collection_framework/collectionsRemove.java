import java.util.*;
public class collectionsRemove {
    public static void main(String args[]){
        int count=1;
        int deleteElement = 0;
        ArrayList<Integer> list=new ArrayList<Integer>();
        ArrayList<Integer> copyList= new ArrayList<Integer>();
        list.add(30);//Adding object in arraylist
        list.add(30);
        list.add(10);
        list.add(30);
        Iterator itr=list.iterator();
        System.out.println("The original Collection:"+list);
        while(itr.hasNext()){
            int element=(int)itr.next();
            if(copyList.contains(element)){
                count+=1;
                if(count==3){
                    deleteElement=element;
                }
            }
            else{
                copyList.add(element);
            }
        }
        list.removeAll(Collections.singleton(deleteElement));
        System.out.println(list);
    }
}