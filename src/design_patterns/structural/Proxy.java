package design_patterns.structural;

import design_patterns.creational.Prototype.P;

interface Image{
    public void display();
}

class RealImage implements  Image{
    private String fileName;
    public RealImage(String fileName){
        this.fileName = fileName;
    }
    @Override
    public void display() {
        System.out.println("real"+fileName);
    }
}

class ImageProxy implements Image{
    private String fileName;
    private RealImage r;

    public ImageProxy(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(r == null){
            r = new RealImage(fileName);
        }
        r.display();
    }
}
public class Proxy {

    public static void main(String[] args) {
        Image i = new ImageProxy("sdjfn");
        i.display();
    }
}
