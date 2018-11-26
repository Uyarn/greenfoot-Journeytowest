import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StateContext here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StateContext extends Actor
{
    /**
     * Act - do whatever the StateContext wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    State state;
    int health;
    boolean status;
    Player player;
    Actor bulletEnemy;
    Actor enemy;
    Actor enemy_touch;
    
    
    
    //health还没给进来
    
    public StateContext(int health,boolean status,Actor bulletEnemy,Actor enemy,Actor enemy_touch,Player player){
        this.health=health;
        this.status=status;
        this.bulletEnemy=bulletEnemy;
        this.enemy=enemy;
        this.enemy_touch=enemy_touch;
        this.player=player;
        
    }
    
    public void act() 
    {
        // Add your action code here.        
    }    
    
    public void healthControl(){
//        System.out.println(health);
//        System.out.println(status+"11111");
//        System.out.println(player);
         //System.out.println(status);
        if (10<health&&health<=30){
            state= new HealthNormal();
            state.healthControl(bulletEnemy,enemy,enemy_touch,player);
        }
        if (health==10&&status==false){
            state=new HealthPower();
            state.healthControl(bulletEnemy,enemy,enemy_touch,player);
        }
        if(health==10 &&status==true){
            
            state=new HealthNormal();
            state.healthControl(bulletEnemy,enemy,enemy_touch,player);
        }
        
        
    }
    
    
}
