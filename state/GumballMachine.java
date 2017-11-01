/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author mohamed
 */
public class GumballMachine {
    private State soldOutState;
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State winnerState;
    private State state;
    private int count;
    
    public GumballMachine(int numberOfGumballs) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new hasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        
        this.count = numberOfGumballs;
        
        if(numberOfGumballs > 0) {
            state = noQuarterState;
        }
    }
    
    public void ejectQuarter() {
        state.ejectQuarter();
    }
    
    public void insertQuarter() {
        state.insertQuarter();
    }
    
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }
    
    
    public void setState(State state) {
        this.state = state;
    }
    
    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if(count > 0) {
            count--;
        }
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }
    
    public int getCount() {
        return count;
    }
    
    @Override
    public String toString() {
        return "Inventory contains " + count + " gumballs";
    }
    
}
