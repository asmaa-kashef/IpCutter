/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IPcutter;

/**
 *
 * @author asmaa
 */
public class comndline {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CommandLine cmd=new CommandLine("163.121.12.30");
         System.out.println(cmd.getCommandLine());
        int[]arr=  cmd.DoOperation();
         for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
                               }
        
        // TODO code application logic here
    }
    
}
