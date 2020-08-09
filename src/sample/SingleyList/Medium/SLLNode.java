package sample.SingleyList.Medium;

class SLLNode<E> {
    protected E element;
    protected SLLNode<E> succ;

    public SLLNode(E elem, SLLNode<E> succ) {
        this.element = elem;
        this.succ = succ;
    }

    public SLLNode(E i) {
        this.element = i;
    }

    @Override
    public String toString() {
        return element.toString();
    }
}
