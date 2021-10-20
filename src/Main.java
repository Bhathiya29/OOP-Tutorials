public class Main {

    public static void main(String[] args) {


    Employee employee=new Employee("John",120000);
        System.out.println(employee.getName());
        System.out.println(employee.getSalary());

    VotingMachine machine=new VotingMachine();
    machine.randomVoteForLabour();
    machine.randomVoteForConservative();
        System.out.println(machine.getvotesForLabour());
        System.out.println(machine.getvotesForConservative());


    Car car =new Car("1234",60,320);
    car.print();

    }

}

//Tutorial 3 Week 4

//Q2
//Implement a class Employee. An employee has a a name and a salary (a double). The class
//should have a default constructor (i.e. one without any arguments), a constructor with two
//parameters (name and salary), and methods to return the name and the salary.
//Write a program to test your class.

//Q3
/*3 Designing and Implementing a Class
        1. Implement a VotingMachine class that can be used for a simple election. It should have
        methods to clear the machine state, to vote for a Labour, to vote for a Conservative, and
        to get the number of votes for each of the two parties.
        2. Assuming that your machine is biased towards one of the two parties, modify the vote
        method(s) to add a random number to the number of votes for that party.
        Hint: The random() method of the library class Math, can be used for the generation of a
        random number.
 */

//Q4
//4 Objects are Copied by Reference
//This exercise illustrates that objects are copied by reference, i.e. whether they are passed to a
//method, returned from a method or assigning an object's reference to another reference.


//Q5
//5 Object Comparison

//Q6
/*6 The null keyword
        The value null indicate that an object variable does not point to an object.
        Guess what will happen when the following program is run. Verify your guess by running
        the program. Make sure you understand what happens.
public class NullObjectsTest {
    public static void main(String[] args) {
        String s = null;
        s.toUpperCase();
    }
}
The above program will give a null pointer Exception
*/