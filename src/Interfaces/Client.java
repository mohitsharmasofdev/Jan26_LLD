package Interfaces;

public class Client {
    private static void startRace(Runner[] participants){
        for(Runner runner : participants){
            runner.run();
        }
    }
    public static void main(String[] args) {
        Runner[] participants = {new Dog(),
                new Snake(),
                new RoboticDog(),
                new Car(),
        };

        startRace(participants);



        Stack stack = new ArrayStack(10);

        Stack stack1 = new LinkedListStack();

        Stack stack2 = new QueueStack();


    }
}

// Stack
    // pop , push , top

// ArrayStack , LinkedListStack , QueueStack
