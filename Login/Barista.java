package login;

public class Barista extends Employee {
    final String position = "Barista";
    final float BaristaBonus = 125;
   

    public Barista(String name, String password, float salary)
    {
        super(name, password, salary);
    }

    @Override
    public float getSalary() {
        return super.getSalary() + this.BaristaBonus;
    }

    @Override
    public String toString() {
        String s = super.toString() + "position = " + this.position;
        return s;
    }
    @Override
    public boolean equals(Object obj) {
        super.equals(obj);
        Barista e = (Barista) obj;
        

        if(e.position == this.position)
        {
            return true;
        }

        return false;
    }
}
