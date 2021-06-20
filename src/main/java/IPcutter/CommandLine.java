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
public class CommandLine {
    private String CmdLINE;
    public CommandLine(String cmdline){
        this.CmdLINE=cmdline;
                                       }
    public void setCommandLine(String CommandLine){ 
       CmdLINE=CommandLine;
                                  }
   public String getCommandLine(){ 
       return CmdLINE;
                                 }
   
     public  int[]  DoOperation( ){
    String[] Parts=CmdLINE.split("\\.");
     int Len=Parts.length;
     int[] out=new int[Len];
       if(Len!=4){
     System.out.println("Error In Type");
                 }
    else{
        for(int i=0;i<Len;i++){
          out[i]= Integer.parseInt(Parts[i]);
        }
                   
   }
    return out;
   }
}
 
    
    
    
   
