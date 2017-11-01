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
public class WinnerState implements State {

    private GumballMachine gumballMachine;
    
    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Insert quarter error msg");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Eject quarter error msg");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turn crank error msg");
    }

    @Override
    public void dispense() {
        System.out.println("You're the winner, you get two for one");
        gumballMachine.releaseBall();
        if(gumballMachine.getCount() == 0) {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
        else {
            gumballMachine.releaseBall();
            if(gumballMachine.getCount() > 0) {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            }
            else {
                System.out.println("Oops, out of gumballs");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }
    
}
