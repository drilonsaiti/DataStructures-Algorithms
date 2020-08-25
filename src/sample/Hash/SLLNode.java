package sample.Hash;

public class SLLNode<E> {
	protected E element;
	protected SLLNode<E> succ;

	public SLLNode(E elem, SLLNode<E> succ) {
		this.element = elem;
		this.succ = succ;
	}
	public E getElement(){
		return this.element;
	}
	public SLLNode<E> getSucc(){
		return this.succ;
	}
	@Override
	public String toString() {
		return element.toString();
	}
}