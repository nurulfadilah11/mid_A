/*/
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mid_a1;
import java.util.Scanner;
class kode{
    int sqrt,a=3,t=6;
    int sisimiring,keliling;
    
    public int sisimiring(){
        return sisimiring=sqrt*(a*a*t*t);
    }
        
    public int keliling(){
        return keliling+a*t+sisimiring;
        

        }
}

public class Mid_A1 {
    public static void main(String[] args) {
        kode x=new kode();
        Scanner input=new Scanner(System.in);
        System.out.println("menghitung sisi miring dan keliling segitiga siku");
        
        System.out.print("masukkan sisi tegak mendatar:");
        x.sqrt=input.nextInt();
        
        System.out.println("sisi miring: "+x.sisimiring());
        System.out.println("keliling="+x.keliling());
                
    }
    
    
    }
    

