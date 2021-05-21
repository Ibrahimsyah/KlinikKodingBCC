/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3;

/**
 *
 * @author Ibrahimsyah
 */
interface Robot {

    void bergerak();

    void tembak();
}

class Ultraman implements Robot {

    @Override
    public void bergerak() {
        System.out.println("Ultraman sedang bergerak");
    }

    @Override
    public void tembak() {
        System.out.println("Ultraman Menembakkkkk!");
    }

}

class Transformer implements Robot {

    @Override
    public void bergerak() {
        System.out.println("Transformer sedang bergerak");
    }

    @Override
    public void tembak() {
        System.out.println("Transformer tidak bisa menembak");
    }

}

public class InterfacePlayground {

    public static void main(String[] args) {
        Ultraman ultraman = new Ultraman();
        ultraman.bergerak();
        ultraman.tembak();
        
        Robot transformer = new Transformer();
        transformer.bergerak();
        transformer.tembak();
        
        gerakkanRobot(ultraman);
    }
    
    static void gerakkanRobot(Robot robot){
        robot.bergerak();
    }
}
