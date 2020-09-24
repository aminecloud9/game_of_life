/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emp.edu.demo.gl.tp.gamelife;

/**
 *
 * @author ninob
 */
public class RulesFactory {

    
    
    public RuleSet getRule(String rule){
        if(rule==null)
            return null;
        if(rule=="conway")
            return new Conway();
        if(rule=="corona")
            return new Corona();
        if(rule=="highlife")
            return new HighLife();
        return null;
    } 
    
}
