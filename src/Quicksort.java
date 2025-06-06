import java.util.ArrayList;

public class Quicksort {

    
    /**
     * Recursivelty performs the quicksort of a list of integers.
     * @param array - the array to be sorted.
     * @return - the recursive call of the join of the sorted before, pivot and sorted after array.
     */
    public ArrayList<Integer> sort(ArrayList<Integer> array) {

        ArrayList<Integer> before = new ArrayList<Integer>();
        ArrayList<Integer> after = new ArrayList<Integer>();

        if (array.size() < 1) {
            return array;
        }

        int pivot = array.get(array.size()-1); 
        
        for (int i = 0; i < array.size() - 1; i++) {

            if (array.get(i) < pivot) {
                before.add(array.get(i));
            } else {
                after.add(array.get(i));
            }
            
        }

        return join(sort(before), pivot, sort(after));

    }


    /**
     * Joins the before array, the pivot and the after array.
     * @param before - the array of elements before the pivot.
     * @param pivot - the value of the pivot element
     * @param after - the array of elements after the pivot.
     * @return - the new joined list.
     */

   public ArrayList<Integer> join(ArrayList<Integer> before, int pivot, ArrayList<Integer> after) {


        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < before.size(); i++) {
                list.add(before.get(i));
        }
        list.add(pivot);
        for (int i = 0; i < after.size(); i++) {
                list.add(after.get(i));
        }

       return list;

   }

  

  
}