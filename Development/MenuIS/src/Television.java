/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author msi
 */
public class Television {

    public String model;
    public String company;
    public String size;
    public String panel;
    public String resol;
    public int price;
    
    //constructor
    public Television(String model, String company, String size, String panel, String resol, int price){
        this.model = model;
        this.company = company;
        this.size= size;
        this.panel= panel;
        this.resol= resol;
        this.price = price;
        }
    
    public String getModel(){
	return model;
    }
    public String getCompany(){
            return company;
    }
    public String getSize(){
            return size;
    }
    public String getPanel(){
            return panel;
    }
    public String getResol(){
            return resol;
    }
    public int getPrice(){
            return price;
    }
    
    
    public Object[] getTV(){
        String sPrice = Integer.toString(price);
        Object tv [] = {model, company, size, panel, resol, sPrice};
        
        return tv;
    
    }
}
