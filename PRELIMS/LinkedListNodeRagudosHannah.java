/**
 * Name: Ragudos, Hannah T.
 * Schedule: TF: 9:00 - 10:30 AM
 * Date: September 5, 2023
 */

/**
 * Creates a template for node
 * @param <T> generic type
 */
public class LinkedListNodeRagudosHannah <T> {
    private T data; // first node
    private LinkedListNodeRagudosHannah <T> next; // next node

    // Creates ListNode
    public LinkedListNodeRagudosHannah (T data) {
        this.data = data;
        this.next = null;
    } // end of LinkedListNodeRagudosHannah T(data)

    /**
     * Getter method for the first node
     * @return data
     */
    public T getData () {
        return data;
    } // end of getData getter method

    /**
     * Setter method for the first node
     * @return (T) data
     */
    public T setData () {
        return (T) data;
    } // end of setData setter method

    /**
     * Getter method for the another node
     * @return next data
     */
    public LinkedListNodeRagudosHannah<T> getNext() {
        return next;
    } // end of getNext getter method

    /**
     * Setter method for the another node
     * @param next
     */
    public void setNext (LinkedListNodeRagudosHannah <T> next) {
        this.next = next;
    } // end of setNext setter method

} // end of LinkedListNodeRagudosHannah <T> class
