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
public class ExeceptionPlayground {

    public static void main(String[] args) {
        System.out.println("Mulai");
        try{
            methodWithCustomError(11);
        }catch(Exception e){
            System.out.println(e.toString());
            System.out.println("Eh ada error nih!");
        }
        System.out.println("Selesai");
    }
    
    static void methodWithError(){
        int[] array = {1};
        System.out.println(array[1]);
    }
    
    //Buatlah method, yang akan menghasilkan error ketika inputan
    //Lebih dari 10
    static void methodWithCustomError(int angka) throws Exception{
        if(angka < 10){
            System.out.println("Horaayyy!");
        }else{
            throw new Exception("Hei angkamu lebih dari 10");
        }
    }
}
