package sample.SingleyList.Medium;

class SLLNode<E> {
    protected E element;
    protected SLLNode<E> succ;

    public SLLNode(E elem, SLLNode<E> succ) {
        this.element = elem;
        this.succ = succ;
    }

    public SLLNode() {
        this.succ = null;
    }
    public SLLNode(E element) {
        this.element = element;
        this.succ = null;
    }
    @Override
    public String toString() {
        return element.toString();
    }
}
