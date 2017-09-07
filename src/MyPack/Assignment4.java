package MyPack;
import java.util.*;
interface Stack{
	void push(int i);
	int pop();
}
class FixedStack implements Stack{
	int size;
	FixedStack(int size){
		this.size=size;
	}
	ArrayList<Integer> list=new ArrayList<Integer>(size);
	public void push(int n){
		if(list.size()<size){
		list.add(n);
		}
		else
		{
			System.out.println("Stack Overflow !!!!");
		}
	}
	public int pop(){
		
		if(list.size()!=0){
			return list.get(list.size()-1);
		}
		else 
			return 0;
		}
}

class VariableStack implements Stack{
	int size;
	VariableStack(int size){
		this.size=size;
	}
	ArrayList<Integer> list=new ArrayList<Integer>(size);
	public void push(int n){
		int counter=1;
		if(list.size()==size){
			list.ensureCapacity(list.size()+counter);
		}
		list.add(n);
		counter++;
		
		
	}
	public int pop(){
		
		if(list.size()!=0){
			return list.get(list.size()-1);
		}
		else 
			return 0;
		}
}
public class Assignment4 {
    public static void main(String args[]){
    	Scanner sc=new Scanner(System.in);
    	
    	System.out.println("Enter the size of the fixed list");
    	int list_size=sc.nextInt();
    	System.out.println("Enter the no of elements for fixed list");
    	int no_of_elements=sc.nextInt();
    	FixedStack fs=new FixedStack(list_size);
    	for(int i=1;i<=no_of_elements;i++){
    		fs.push(i);
    	}
    	System.out.println(fs.list);
    	int element=fs.pop();
    	System.out.println("The last element of the fixed list is :"+element);
    	
    	System.out.println("Enter the size of the variable list");
    	int var_list_size=sc.nextInt();
    	System.out.println("Enter the no of elements for varable list");
    	int no_of_var_elements=sc.nextInt();
    	VariableStack vs=new VariableStack(var_list_size);
    	for(int i=1;i<=no_of_var_elements;i++){
    		vs.push(i);
    	}
    	System.out.println(vs.list);
    	int var_element=vs.pop();
    	System.out.println("The last element of the variable list is :"+var_element);
    	
    }
}
