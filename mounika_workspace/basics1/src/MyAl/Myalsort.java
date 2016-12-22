package MyAl;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Myalsort  
{
	public static void main(String abc[])
	{
		List<Empl> list=new ArrayList<Empl>();
		list.add(new Empl("hh",100));
		list.add(new Empl("jnb",101));
		list.add(new Empl("bnhj",102));
		Collections.sort(list,new MySalaryComp());
        System.out.println("Sorted list entries: ");
        for(Empl e:list){
            System.out.println(e);
        }
    }
}
class MySalaryComp implements Comparator<Empl>
{
	 public int compare(Empl e1, Empl e2)
	 {
        if(e1.getSalary() < e2.getSalary())
        {
            return 1;
        } 
        else
        {
            return -1;
        }
    }
}
class Empl{
    
    private String name;
    private int salary;
     
    public Empl(String n, int s){
        this.name = n;
        this.salary = s;
    }
     
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String toString(){
        return "Name: "+this.name+"-- Salary: "+this.salary;
    }
}