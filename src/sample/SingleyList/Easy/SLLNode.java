package sample.SingleyList.Easy;

class SLLNode<E> {
    protected E element;
    protected SLLNode<E> succ;

    public SLLNode(E elem, SLLNode<E> succ) {
        this.element = elem;
        this.succ = succ;
    }

    public SLLNode() {

    }

    @Override
    public String toString() {
        return element.toString();
    }
}
