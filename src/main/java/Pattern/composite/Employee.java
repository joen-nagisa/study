package Pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合模式就是把对象变成树形结构，这样的部分、整体的形式。组合包括组件和叶节点。组件又包括组合。类似这样的树形结构。
 * 使得能一一种方式处理对象和对象的数组
 */
public class Employee {
    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates ;

    Employee(String name,String dept,int salary){
        this.name=name;
        this.dept=dept;
        this.salary=salary;
        subordinates = new ArrayList<Employee>();
    }
    public void add(Employee employee){
        subordinates.add(employee);
    }
    public void remove(Employee employee){
        subordinates.remove(employee);
    }
    public List<Employee> getSubordinates(){
        return subordinates;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }
}
