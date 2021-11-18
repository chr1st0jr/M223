package MVC;

public class Controller{

    Model model;

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public void update(){

        model.setCounter(model.getCounter()+1);

    }
}
