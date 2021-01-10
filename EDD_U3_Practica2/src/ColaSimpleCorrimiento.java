/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chuy4
 */
public class ColaSimpleCorrimiento {
    private char[] vector = new char[5];
    private int ini = -1;
    private int fin = -1;
    private char valor;
    private char valorEliminado;
    
    public boolean insertarS(char valor){
        if(fin == vector.length-1){
            return false;
        }
        fin++;
        vector[fin] = valor;
        if(fin == 0 && ini == -1){
            ini++;
        }
        return true;
    }
    
    public boolean insertarC(char valor){
        if(fin == vector.length-1){
            if(ini > 0){
                int recibe = 0;
                for(int envia = ini; envia <= fin; envia++){
                    vector[recibe] = vector[envia];
                }
                ini = 0;
                fin = recibe -1;
                return insertarC(valor);
            }
            return false;
        }
        fin++;
        vector[fin] = valor;
        if(ini == -1 && fin == 0){
            ini++;
        }
        return true;
    }
    
    public boolean eliminar(){
        if(ini == -1 && fin == -1){
            return false;
        }
        valorEliminado = vector[ini];
        if(ini == fin && ini != -1){
            ini = fin = -1;
        }
        ini++;
        return true;
    }
  
    public int valorINI(){
        return ini;
    }
    public int valorFIN(){
        return fin;
    }
    public char valorEliminado(){
        return valorEliminado;
    }
    public char valor(){
        return valor;
    }
    public char[] valorVECTOR(){
        return vector;
    }
}
