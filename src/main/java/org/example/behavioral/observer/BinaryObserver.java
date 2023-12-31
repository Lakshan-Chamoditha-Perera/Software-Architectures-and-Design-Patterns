package org.example.behavioral.observer;

public class BinaryObserver extends Observer{
    public BinaryObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    void update() {
        System.out.println("Binary observer is updated : "+Integer.toBinaryString(subject.getState()));
    }
}
