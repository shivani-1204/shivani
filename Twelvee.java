package number;

// encapsulation
class Nine {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Twelvee extends Nine {
    public static void main(String[] args) {
        Twelvee ff = new Twelvee();

        ff.setName("SHMA");   
        String ss = ff.getName();

        System.out.println(ss);
    }
}