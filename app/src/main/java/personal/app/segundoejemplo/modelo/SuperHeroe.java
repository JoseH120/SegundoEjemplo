package personal.app.segundoejemplo.modelo;

public class SuperHeroe {
    private String name;
    private String skill;

    public SuperHeroe(String _name, String _skill){
        this.name = _name;
        this.skill = _skill;
    }

    @Override
    public String toString(){
        return this.name;
    }

}
