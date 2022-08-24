package com.springdemo.springframework.nestedBeans;


public class Phone {
    public Carrier getCarrier() {
        return carrier;
    }

    public void setCarrier(Carrier carrier) {
        this.carrier = carrier;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    Carrier carrier;
    Model model;
}
