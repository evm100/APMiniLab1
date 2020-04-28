package sorts;

import java.util.ArrayList;

public class CircleQueueAL
{
	private int head, tail, current;	

	private static ArrayList<Object> list = new ArrayList<Object>();
	/**
	 *Constructor for the SinglyLinkedList object
	 *Generates an empty list.
	 */
	public CircleQueueAL()
	{
		head = 0;
		tail = -1;
		current = 0;
	}

	/**
	 *Returns wether or not array list is empty
	 *
	 * @return list empty or not.
	 */
	private boolean empty() {
		return (list.size() == 0);
	}
	
	/**
	 *Returns the head opaqueObject.
	 *
	 * @returnthe head opaqueObject in Stack.
	 */
	public Object getFirstObject() {
		if (empty()) return null;
		return list.get(head);
	}
	
	/**
	 *Returns the tail opaqueObjects.
	 *
	 * @returnthe current opaqueObject in Stack.
	 */
	public Object getLastObject() {
		if (empty()) return null;
		return list.get(tail);
	}
	
	/**
	 *Returns the current Object
	 *
	 * @returnthe current Object in Stack.
	 */
	public Object getObject() {
		return list.get(current);
	}
	
	/**
	 *Advances the current node.
	 *
	 */
	public void setNext() {
		current++;
		if(current >= list.size()) current = head;
	}
	
	/**
	 *Reverses the current node.
	 *
	 */
	public void setPrevious() {
		current--;
		if(current < 0) current = tail;
	}
	
	
	/**
	 *Add a new object at the end of the Queue,
	 *
	 * @paramopaqueObjectis the data to be inserted in the Queue object.
	 */
	public void add(Object opaqueObject) {
		list.add(opaqueObject);
		tail++;
	}
	
	/**
	 *Delete an object from the front of the Queue,
	 *
	 */
	public Object delete() {
		Object deleting = list.get(head);
		list.remove(head);
		return deleting;
	}
	
	
	/**
	 *Returns a string representation of this Queue
	 *
	 * @returnstring representation of this Queue
	 */
	public String toString() {
		
		//initiates string that will be expanded and returned
		String queueToString = "";
	    
		//adds every item in array list as a string to the final string, formatted
	    for (Object item : list) {
	    	queueToString += "("+item.toString()+"), ";
	    }
	    
	    //removes the extra ", " at the end
	    if (queueToString.length() > 1) queueToString = queueToString.substring(0, queueToString.length()-2);
	    
	    return "[" + queueToString + "]";
	}
	
	/**
	 * Performs insertion sort based off of the contents of object
	 */
	public void insertionSort() {	
		
		for (int i=0; i < list.size()-1; i++) {
			
			int k = i+1;
			//saves the current object that will be moved to lowest spot it can go to
			Object swap = list.get(k);
			//compares the strings. if the previous one is lower in value, it will keep moving the current (i) one until it cannot go lower.
			while (k>0 && swap.toString().compareTo(list.get(k-1).toString()) < 0) {
				//pushes objects in arraylist forward to accomodate for the object moving down
				list.set(k, list.get(k-1));
				k--;
			}
			//
			list.set(k, swap);
		}
	} 

	public void selectionSort() {
		
		//starts at the beginning of list, covers all list. each time starts one later
		for (int i=0; i < list.size()-1; i++) {
			
			//lowest value object index
			int min = i;
			//looks for lowest value object in search interval.
			for (int k = i+1; k < list.size(); k++) {
				if (list.get(k).toString().compareTo(list.get(min).toString()) < 0) {
					min = k;
				}
			}
			//swaps the lowest found object w the one on the first slot in the interval
			Object swap = list.get(min);
			list.set(min, list.get(i));
			list.set(i, swap);
		}
	}
}

