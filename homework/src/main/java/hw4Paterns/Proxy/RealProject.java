package hw4Paterns.Proxy;

public class RealProject  implements Project{

    private String url;

    public RealProject(String url) {
        this.url = url;
        load();
    }

    public void load(){
        System.out.println("loading project from " + url + " ...");
    }
    @Override
    public void run() {

    }
}
